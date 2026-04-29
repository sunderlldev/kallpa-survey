package com.proyecto.PI09.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.PI09.model.Simulacion;
import com.proyecto.PI09.repository.SimulacionRepository;

@Service
public class SimulacionService {

    @Autowired
    private SimulacionRepository simulacionRepository;

    public List<Simulacion> listarTodas() {
        return simulacionRepository.findAll();
    }

    public Optional<Simulacion> buscarPorId(Integer id) {
        return simulacionRepository.findById(id);
    }

    public Simulacion guardar(Simulacion simulacion) {
        return simulacionRepository.save(simulacion);
    }
}