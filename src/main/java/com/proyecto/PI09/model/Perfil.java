package com.proyecto.PI09.model;

import jakarta.persistence.*;

@Entity
@Table(name = "perfil")
public class Perfil {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_perfil")
	private Integer idPerfil;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_simulacion")
	private Simulacion simulacion;

	@Column(name = "nombre_perfil", nullable = false, length = 100)
	private String nombrePerfil;

	@Column(name = "descripcion", length = 255)
	private String descripcion;

	@Column(name = "feedback", columnDefinition = "TEXT")
	private String feedback;

	@Column(name = "puntaje_min", nullable = false)
	private Integer puntajeMin;

	@Column(name = "puntaje_max", nullable = false)
	private Integer puntajeMax;

	@Column(name = "estado", nullable = false)
	private Boolean estado = true;

	public Integer getIdPerfil() {
		return idPerfil;
	}

	public Simulacion getSimulacion() {
		return simulacion;
	}

	public void setSimulacion(Simulacion simulacion) {
		this.simulacion = simulacion;
	}

	public String getNombrePerfil() {
		return nombrePerfil;
	}

	public void setNombrePerfil(String nombrePerfil) {
		this.nombrePerfil = nombrePerfil;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Integer getPuntajeMin() {
		return puntajeMin;
	}

	public void setPuntajeMin(Integer puntajeMin) {
		this.puntajeMin = puntajeMin;
	}

	public Integer getPuntajeMax() {
		return puntajeMax;
	}

	public void setPuntajeMax(Integer puntajeMax) {
		this.puntajeMax = puntajeMax;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
}