package com.proyecto.PI09.repository;

import com.proyecto.PI09.model.IntentoSimulacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IntentoSimulacionRepository extends JpaRepository<IntentoSimulacion, Integer> {

    long countByEstado(String estado);

    @Query("SELECT COUNT(DISTINCT i.usuario.idUsuario) FROM IntentoSimulacion i")
    long countUsuariosConIntento();
}