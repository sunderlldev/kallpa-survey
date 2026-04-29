package com.proyecto.PI09.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyecto.PI09.model.Pregunta;
import com.proyecto.PI09.model.Simulacion;

public interface PreguntaRepository extends JpaRepository<Pregunta, Integer> {

    List<Pregunta> findBySimulacionAndEstadoTrueOrderByOrdenAscIdPreguntaAsc(Simulacion simulacion);

    @Query("SELECT COALESCE(MAX(p.orden), 0) FROM Pregunta p WHERE p.simulacion = :simulacion AND p.estado = true")
    int findMaxOrdenBySimulacion(Simulacion simulacion);
}