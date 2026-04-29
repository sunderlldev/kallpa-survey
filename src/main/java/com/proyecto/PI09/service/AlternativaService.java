package com.proyecto.PI09.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.PI09.model.Alternativa;
import com.proyecto.PI09.model.Pregunta;
import com.proyecto.PI09.repository.AlternativaRepository;

@Service
public class AlternativaService {

    @Autowired
    private AlternativaRepository alternativaRepository;

    public List<Alternativa> listarPorPregunta(Pregunta pregunta) {
        return alternativaRepository.findByPreguntaAndEstadoTrue(pregunta);
    }

    public Optional<Alternativa> buscarPorId(Integer id) {
        return alternativaRepository.findById(id);
    }

    public Alternativa guardar(Alternativa alternativa) {
        return alternativaRepository.save(alternativa);
    }

    public void desactivar(Integer id) {
        Optional<Alternativa> alternativaOpt = alternativaRepository.findById(id);
        if (alternativaOpt.isPresent()) {
            Alternativa alternativa = alternativaOpt.get();
            alternativa.setEstado(false);
            alternativaRepository.save(alternativa);
        }
    }
}