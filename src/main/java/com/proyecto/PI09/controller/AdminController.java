package com.proyecto.PI09.controller;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.proyecto.PI09.model.Alternativa;
import com.proyecto.PI09.model.Perfil;
import com.proyecto.PI09.model.Pregunta;
import com.proyecto.PI09.model.Simulacion;
import com.proyecto.PI09.repository.UsuarioRepository;
import com.proyecto.PI09.service.AlternativaService;
import com.proyecto.PI09.service.PerfilService;
import com.proyecto.PI09.service.PreguntaService;
import com.proyecto.PI09.service.SimulacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private SimulacionService simulacionService;
	@Autowired
	private PreguntaService preguntaService;
	@Autowired
	private AlternativaService alternativaService;
	@Autowired
	private PerfilService perfilService;
	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		List<Simulacion> simulaciones = simulacionService.listarTodas();

		long totalPreguntas = simulaciones.stream().mapToLong(s -> preguntaService.listarPorSimulacion(s).size()).sum();

		Set<Integer> simulacionesListas = simulaciones.stream()
				.filter(s -> preguntaService.buscarPreguntaInicial(s).isPresent()).map(Simulacion::getIdSimulacion)
				.collect(Collectors.toSet());

		model.addAttribute("simulaciones", simulaciones);
		model.addAttribute("totalSimulaciones", simulaciones.size());
		model.addAttribute("totalUsuarios", usuarioRepository.count());
		model.addAttribute("totalPreguntas", totalPreguntas);
		model.addAttribute("simulacionesListas", simulacionesListas);

		return "dashboard";
	}

	@PostMapping("/simulacion/crear")
	public String crearSimulacion(@RequestParam String titulo, @RequestParam(required = false) String descripcion) {
		Simulacion sim = new Simulacion();
		sim.setTitulo(titulo);
		sim.setDescripcion(descripcion);
		sim.setEstado(true);
		simulacionService.guardar(sim);
		return "redirect:/admin/dashboard";
	}

	@PostMapping("/simulacion/{id}/editar")
	public String editarSimulacion(@PathVariable Integer id, @RequestParam String titulo,
			@RequestParam(required = false) String descripcion) {
		simulacionService.buscarPorId(id).ifPresent(sim -> {
			sim.setTitulo(titulo);
			sim.setDescripcion(descripcion);
			simulacionService.guardar(sim);
		});
		return "redirect:/admin/dashboard";
	}

	@GetMapping("/simulacion/{id}/activar")
	public String activarSimulacion(@PathVariable Integer id) {
		simulacionService.buscarPorId(id).ifPresent(sim -> {
			sim.setEstado(true);
			simulacionService.guardar(sim);
		});
		return "redirect:/admin/dashboard";
	}

	@GetMapping("/simulacion/{id}/desactivar")
	public String desactivarSimulacion(@PathVariable Integer id) {
		simulacionService.buscarPorId(id).ifPresent(sim -> {
			sim.setEstado(false);
			simulacionService.guardar(sim);
		});
		return "redirect:/admin/dashboard";
	}

	@GetMapping("/simulacion/{id}/preguntas")
	public String verPreguntas(@PathVariable Integer id, Model model) {
		Optional<Simulacion> opt = simulacionService.buscarPorId(id);
		if (opt.isEmpty())
			return "redirect:/admin/dashboard";
		model.addAttribute("simulacion", opt.get());
		model.addAttribute("preguntas", preguntaService.listarPorSimulacion(opt.get()));
		return "admin-preguntas";
	}

	@GetMapping("/simulacion/{id}/preguntas/nueva")
	public String nuevaPregunta(@PathVariable Integer id, Model model) {
		Optional<Simulacion> opt = simulacionService.buscarPorId(id);
		if (opt.isEmpty())
			return "redirect:/admin/dashboard";
		Simulacion simulacion = opt.get();
		Pregunta pregunta = new Pregunta();
		pregunta.setOrden(preguntaService.siguienteOrden(simulacion));
		model.addAttribute("simulacion", simulacion);
		model.addAttribute("pregunta", pregunta);
		model.addAttribute("modo", "crear");
		return "admin-pregunta-form";
	}

	@PostMapping("/simulacion/{id}/preguntas/guardar")
	public String guardarPregunta(@PathVariable Integer id, @RequestParam String texto,
			@RequestParam(required = false) Integer orden) {
		Optional<Simulacion> opt = simulacionService.buscarPorId(id);
		if (opt.isEmpty())
			return "redirect:/admin/dashboard";
		Simulacion simulacion = opt.get();
		Pregunta pregunta = new Pregunta();
		pregunta.setSimulacion(simulacion);
		pregunta.setTexto(texto);
		pregunta.setOrden(orden != null ? orden : preguntaService.siguienteOrden(simulacion));
		pregunta.setEsInicial(false);
		pregunta.setEsFinal(false);
		pregunta.setEstado(true);
		preguntaService.guardar(pregunta);
		return "redirect:/admin/simulacion/" + id + "/preguntas";
	}

	@GetMapping("/pregunta/{id}/editar")
	public String editarPregunta(@PathVariable Integer id, Model model) {
		Optional<Pregunta> opt = preguntaService.buscarPorId(id);
		if (opt.isEmpty())
			return "redirect:/admin/dashboard";
		model.addAttribute("simulacion", opt.get().getSimulacion());
		model.addAttribute("pregunta", opt.get());
		model.addAttribute("modo", "editar");
		return "admin-pregunta-form";
	}

	@PostMapping("/pregunta/{id}/actualizar")
	public String actualizarPregunta(@PathVariable Integer id, @RequestParam String texto,
			@RequestParam(required = false) Integer orden) {
		Optional<Pregunta> opt = preguntaService.buscarPorId(id);
		if (opt.isEmpty())
			return "redirect:/admin/dashboard";
		Pregunta pregunta = opt.get();
		pregunta.setTexto(texto);
		if (orden != null)
			pregunta.setOrden(orden);
		preguntaService.guardar(pregunta);
		return "redirect:/admin/simulacion/" + pregunta.getSimulacion().getIdSimulacion() + "/preguntas";
	}

	@GetMapping("/pregunta/{id}/desactivar")
	public String desactivarPregunta(@PathVariable Integer id) {
		Optional<Pregunta> opt = preguntaService.buscarPorId(id);
		if (opt.isEmpty())
			return "redirect:/admin/dashboard";
		Integer idSim = opt.get().getSimulacion().getIdSimulacion();
		preguntaService.desactivar(id);
		return "redirect:/admin/simulacion/" + idSim + "/preguntas";
	}

	@GetMapping("/pregunta/{id}/alternativas")
	public String verAlternativas(@PathVariable Integer id, Model model) {
		Optional<Pregunta> opt = preguntaService.buscarPorId(id);
		if (opt.isEmpty())
			return "redirect:/admin/dashboard";
		Pregunta pregunta = opt.get();
		model.addAttribute("pregunta", pregunta);
		model.addAttribute("alternativas", alternativaService.listarPorPregunta(pregunta));
		model.addAttribute("preguntasSimulacion", preguntaService.listarPorSimulacion(pregunta.getSimulacion()));
		model.addAttribute("alternativa", new Alternativa());
		model.addAttribute("modo", "crear");
		return "admin-alternativas";
	}

	@PostMapping("/pregunta/{id}/alternativas/guardar")
	public String guardarAlternativa(@PathVariable Integer id, @RequestParam String texto,
			@RequestParam Integer puntaje, @RequestParam(required = false) Integer idSiguientePregunta) {
		Optional<Pregunta> opt = preguntaService.buscarPorId(id);
		if (opt.isEmpty())
			return "redirect:/admin/dashboard";
		Alternativa alternativa = new Alternativa();
		alternativa.setPregunta(opt.get());
		alternativa.setTexto(texto);
		alternativa.setPuntaje(puntaje);
		alternativa.setEstado(true);
		if (idSiguientePregunta != null) {
			preguntaService.buscarPorId(idSiguientePregunta).ifPresent(alternativa::setSiguientePregunta);
		}
		alternativaService.guardar(alternativa);
		return "redirect:/admin/pregunta/" + id + "/alternativas";
	}

	@GetMapping("/alternativa/{id}/editar")
	public String editarAlternativa(@PathVariable Integer id, Model model) {
		Optional<Alternativa> opt = alternativaService.buscarPorId(id);
		if (opt.isEmpty())
			return "redirect:/admin/dashboard";
		Alternativa alternativa = opt.get();
		model.addAttribute("alternativa", alternativa);
		model.addAttribute("pregunta", alternativa.getPregunta());
		model.addAttribute("preguntasSimulacion",
				preguntaService.listarPorSimulacion(alternativa.getPregunta().getSimulacion()));
		model.addAttribute("modo", "editar");
		return "admin-alternativas";
	}

	@PostMapping("/alternativa/{id}/actualizar")
	public String actualizarAlternativa(@PathVariable Integer id, @RequestParam String texto,
			@RequestParam Integer puntaje, @RequestParam(required = false) Integer idSiguientePregunta) {
		Optional<Alternativa> opt = alternativaService.buscarPorId(id);
		if (opt.isEmpty())
			return "redirect:/admin/dashboard";
		Alternativa alternativa = opt.get();
		alternativa.setTexto(texto);
		alternativa.setPuntaje(puntaje);
		alternativa.setSiguientePregunta(null);
		if (idSiguientePregunta != null) {
			preguntaService.buscarPorId(idSiguientePregunta).ifPresent(alternativa::setSiguientePregunta);
		}
		alternativaService.guardar(alternativa);
		return "redirect:/admin/pregunta/" + alternativa.getPregunta().getIdPregunta() + "/alternativas";
	}

	@GetMapping("/alternativa/{id}/desactivar")
	public String desactivarAlternativa(@PathVariable Integer id) {
		Optional<Alternativa> opt = alternativaService.buscarPorId(id);
		if (opt.isEmpty())
			return "redirect:/admin/dashboard";
		Integer idPregunta = opt.get().getPregunta().getIdPregunta();
		alternativaService.desactivar(id);
		return "redirect:/admin/pregunta/" + idPregunta + "/alternativas";
	}

	@GetMapping("/simulacion/{id}/perfiles")
	public String verPerfiles(@PathVariable Integer id, Model model) {
		Optional<Simulacion> opt = simulacionService.buscarPorId(id);
		if (opt.isEmpty())
			return "redirect:/admin/dashboard";
		Simulacion simulacion = opt.get();
		model.addAttribute("simulacion", simulacion);
		model.addAttribute("perfiles", perfilService.listarPorSimulacion(simulacion));
		return "admin-perfiles";
	}

	@PostMapping("/simulacion/{id}/perfiles/guardar")
	public String guardarPerfil(@PathVariable Integer id, @RequestParam String nombrePerfil,
			@RequestParam(required = false) String descripcion, @RequestParam String feedback,
			@RequestParam Integer puntajeMin, @RequestParam Integer puntajeMax) {
		Optional<Simulacion> opt = simulacionService.buscarPorId(id);
		if (opt.isEmpty())
			return "redirect:/admin/dashboard";
		Perfil perfil = new Perfil();
		perfil.setSimulacion(opt.get());
		perfil.setNombrePerfil(nombrePerfil);
		perfil.setDescripcion(descripcion);
		perfil.setFeedback(feedback);
		perfil.setPuntajeMin(puntajeMin);
		perfil.setPuntajeMax(puntajeMax);
		perfil.setEstado(true);
		perfilService.guardar(perfil);
		return "redirect:/admin/simulacion/" + id + "/perfiles";
	}

	@PostMapping("/perfil/{id}/actualizar")
	public String actualizarPerfil(@PathVariable Integer id, @RequestParam String nombrePerfil,
			@RequestParam(required = false) String descripcion, @RequestParam String feedback,
			@RequestParam Integer puntajeMin, @RequestParam Integer puntajeMax) {
		Optional<Perfil> opt = perfilService.buscarPorId(id);
		if (opt.isEmpty())
			return "redirect:/admin/dashboard";
		Perfil perfil = opt.get();
		perfil.setNombrePerfil(nombrePerfil);
		perfil.setDescripcion(descripcion);
		perfil.setFeedback(feedback);
		perfil.setPuntajeMin(puntajeMin);
		perfil.setPuntajeMax(puntajeMax);
		perfilService.guardar(perfil);
		return "redirect:/admin/simulacion/" + perfil.getSimulacion().getIdSimulacion() + "/perfiles";
	}

	@GetMapping("/perfil/{id}/desactivar")
	public String desactivarPerfil(@PathVariable Integer id) {
		Optional<Perfil> opt = perfilService.buscarPorId(id);
		if (opt.isEmpty())
			return "redirect:/admin/dashboard";
		Integer idSim = opt.get().getSimulacion().getIdSimulacion();
		perfilService.desactivar(id);
		return "redirect:/admin/simulacion/" + idSim + "/perfiles";
	}
}