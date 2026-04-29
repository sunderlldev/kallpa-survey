package com.proyecto.PI09.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.PI09.model.Pregunta;
import com.proyecto.PI09.model.Simulacion;
import com.proyecto.PI09.repository.PreguntaRepository;

@Service
public class PreguntaService {

	@Autowired
	private PreguntaRepository preguntaRepository;

	public List<Pregunta> listarPorSimulacion(Simulacion simulacion) {
		return preguntaRepository.findBySimulacionAndEstadoTrueOrderByOrdenAscIdPreguntaAsc(simulacion);
	}

	public Optional<Pregunta> buscarPorId(Integer id) {
		return preguntaRepository.findById(id);
	}

	public Optional<Pregunta> buscarPreguntaInicial(Simulacion simulacion) {
		List<Pregunta> preguntas = listarPorSimulacion(simulacion);
		return preguntas.isEmpty() ? Optional.empty() : Optional.of(preguntas.get(0));
	}

	public int siguienteOrden(Simulacion simulacion) {
		return preguntaRepository.findMaxOrdenBySimulacion(simulacion) + 1;
	}

	public Pregunta guardar(Pregunta pregunta) {
		return preguntaRepository.save(pregunta);
	}

	public void desactivar(Integer id) {
		Optional<Pregunta> preguntaOpt = preguntaRepository.findById(id);
		if (preguntaOpt.isPresent()) {
			Pregunta pregunta = preguntaOpt.get();
			pregunta.setEstado(false);
			preguntaRepository.save(pregunta);
		}
	}
}