package com.proyecto.PI09.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.PI09.model.Alternativa;
import com.proyecto.PI09.model.Pregunta;

public interface AlternativaRepository extends JpaRepository<Alternativa, Integer> {

    List<Alternativa> findByPreguntaAndEstadoTrue(Pregunta pregunta);
}