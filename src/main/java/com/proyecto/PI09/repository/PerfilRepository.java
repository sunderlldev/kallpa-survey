package com.proyecto.PI09.repository;

import com.proyecto.PI09.model.Perfil;
import com.proyecto.PI09.model.Simulacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PerfilRepository extends JpaRepository<Perfil, Integer> {

	List<Perfil> findBySimulacionAndEstadoTrueOrderByPuntajeMinAsc(Simulacion simulacion);

	@Query("SELECT p FROM Perfil p WHERE p.simulacion = :simulacion AND :puntaje BETWEEN p.puntajeMin AND p.puntajeMax AND p.estado = true")
	Optional<Perfil> findBySimulacionAndPuntaje(@Param("simulacion") Simulacion simulacion,
			@Param("puntaje") Integer puntaje);
}