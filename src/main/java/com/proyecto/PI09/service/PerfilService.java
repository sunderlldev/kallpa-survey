package com.proyecto.PI09.service;

import com.proyecto.PI09.model.Perfil;
import com.proyecto.PI09.model.Simulacion;
import com.proyecto.PI09.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerfilService {

	@Autowired
	private PerfilRepository perfilRepository;

	public List<Perfil> listarPorSimulacion(Simulacion simulacion) {
		return perfilRepository.findBySimulacionAndEstadoTrueOrderByPuntajeMinAsc(simulacion);
	}

	public Optional<Perfil> buscarPorId(Integer id) {
		return perfilRepository.findById(id);
	}

	public Optional<Perfil> buscarPorSimulacionYPuntaje(Simulacion simulacion, Integer puntaje) {
		return perfilRepository.findBySimulacionAndPuntaje(simulacion, puntaje);
	}

	public Perfil guardar(Perfil perfil) {
		return perfilRepository.save(perfil);
	}

	public void desactivar(Integer id) {
		perfilRepository.findById(id).ifPresent(p -> {
			p.setEstado(false);
			perfilRepository.save(p);
		});
	}
}