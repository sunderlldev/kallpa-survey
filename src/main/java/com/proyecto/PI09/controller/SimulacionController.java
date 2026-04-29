package com.proyecto.PI09.controller;

import com.proyecto.PI09.model.Alternativa;
import com.proyecto.PI09.model.Perfil;
import com.proyecto.PI09.model.Pregunta;
import com.proyecto.PI09.model.Simulacion;
import com.proyecto.PI09.service.AlternativaService;
import com.proyecto.PI09.service.PerfilService;
import com.proyecto.PI09.service.PreguntaService;
import com.proyecto.PI09.service.SimulacionService;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class SimulacionController {

	@Autowired
	private SimulacionService simulacionService;
	@Autowired
	private PreguntaService preguntaService;
	@Autowired
	private AlternativaService alternativaService;
	@Autowired
	private PerfilService perfilService;

	@GetMapping("/simulacion")
	public String listarSimulaciones(Model model) {
		model.addAttribute("simulaciones", simulacionService.listarTodas());
		return "preguntas-publico";
	}

	@GetMapping("/simulacion/{id}/iniciar")
	public String iniciarSimulacion(@PathVariable Integer id, HttpSession session) {
		Optional<Simulacion> simulacionOpt = simulacionService.buscarPorId(id);
		if (simulacionOpt.isEmpty())
			return "redirect:/simulacion";

		Optional<Pregunta> preguntaInicialOpt = preguntaService.buscarPreguntaInicial(simulacionOpt.get());
		if (preguntaInicialOpt.isEmpty())
			return "redirect:/simulacion?sinPreguntas";

		session.setAttribute("puntajeTotal", 0);
		session.setAttribute("idSimulacionActual", simulacionOpt.get().getIdSimulacion());

		return "redirect:/simulacion/pregunta/" + preguntaInicialOpt.get().getIdPregunta();
	}

	@GetMapping("/simulacion/pregunta/{idPregunta}")
	public String mostrarPregunta(@PathVariable Integer idPregunta, Model model, HttpSession session) {
		Optional<Pregunta> preguntaOpt = preguntaService.buscarPorId(idPregunta);
		if (preguntaOpt.isEmpty())
			return "redirect:/simulacion";

		Pregunta pregunta = preguntaOpt.get();
		List<Alternativa> alternativas = alternativaService.listarPorPregunta(pregunta);

		if (alternativas.isEmpty())
			return "redirect:/simulacion/resultado";

		model.addAttribute("pregunta", pregunta);
		model.addAttribute("alternativas", alternativas);
		model.addAttribute("puntajeTotal",
				session.getAttribute("puntajeTotal") == null ? 0 : session.getAttribute("puntajeTotal"));

		return "pregunta";
	}

	@PostMapping("/simulacion/responder")
	public String responderPregunta(@RequestParam Integer idAlternativa, HttpSession session) {
		Optional<Alternativa> alternativaOpt = alternativaService.buscarPorId(idAlternativa);
		if (alternativaOpt.isEmpty())
			return "redirect:/simulacion";

		Alternativa alternativa = alternativaOpt.get();

		Integer puntajeActual = (Integer) session.getAttribute("puntajeTotal");
		if (puntajeActual == null)
			puntajeActual = 0;
		puntajeActual += alternativa.getPuntaje();
		session.setAttribute("puntajeTotal", puntajeActual);

		if (alternativa.getSiguientePregunta() == null)
			return "redirect:/simulacion/resultado";

		return "redirect:/simulacion/pregunta/" + alternativa.getSiguientePregunta().getIdPregunta();
	}

	@GetMapping("/simulacion/resultado")
	public String mostrarResultado(Model model, HttpSession session) {
		Integer puntajeTotal = (Integer) session.getAttribute("puntajeTotal");
		if (puntajeTotal == null)
			puntajeTotal = 0;

		model.addAttribute("puntajeTotal", puntajeTotal);

		Integer idSimulacion = (Integer) session.getAttribute("idSimulacionActual");
		if (idSimulacion != null) {
			Optional<Simulacion> simOpt = simulacionService.buscarPorId(idSimulacion);
			if (simOpt.isPresent()) {
				Optional<Perfil> perfilOpt = perfilService.buscarPorSimulacionYPuntaje(simOpt.get(), puntajeTotal);
				if (perfilOpt.isPresent()) {
					Perfil perfil = perfilOpt.get();
					model.addAttribute("perfil", perfil.getNombrePerfil());
					model.addAttribute("mensaje",
							perfil.getFeedback() != null ? perfil.getFeedback() : perfil.getDescripcion());
					List<Perfil> todos = perfilService.listarPorSimulacion(simOpt.get());
					int idx = todos.indexOf(perfil);
					String[] colores = { "#f59e0b", "#3b82f6", "#10b981", "#8b5cf6", "#ef4444" };
					model.addAttribute("color", colores[Math.min(idx, colores.length - 1)]);
					session.removeAttribute("puntajeTotal");
					session.removeAttribute("idSimulacionActual");
					return "resultado";
				}
			}
		}

		model.addAttribute("perfil", "Resultado");
		model.addAttribute("mensaje", "Has completado la simulación con " + puntajeTotal
				+ " puntos. El administrador aún no ha configurado los perfiles de resultado para este rango.");
		model.addAttribute("color", "#6b7280");

		session.removeAttribute("puntajeTotal");
		session.removeAttribute("idSimulacionActual");

		return "resultado";
	}
}