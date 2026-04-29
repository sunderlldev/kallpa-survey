package com.proyecto.PI09.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "intento_simulacion")
public class IntentoSimulacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_intento")
	private Integer idIntento;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuario usuario;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_simulacion", nullable = false)
	private Simulacion simulacion;

	@Column(name = "puntaje_total", nullable = false)
	private Integer puntajeTotal = 0;

	@Column(name = "estado", nullable = false, length = 20)
	private String estado = "EN_PROCESO";

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pregunta_actual")
	private Pregunta preguntaActual;

	@Column(name = "fecha_inicio", nullable = false)
	private LocalDateTime fechaInicio;

	@Column(name = "fecha_fin")
	private LocalDateTime fechaFin;

	@PrePersist
	public void prePersist() {
		if (fechaInicio == null)
			fechaInicio = LocalDateTime.now();
	}

	public Integer getIdIntento() {
		return idIntento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Simulacion getSimulacion() {
		return simulacion;
	}

	public void setSimulacion(Simulacion simulacion) {
		this.simulacion = simulacion;
	}

	public Integer getPuntajeTotal() {
		return puntajeTotal;
	}

	public void setPuntajeTotal(Integer puntajeTotal) {
		this.puntajeTotal = puntajeTotal;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Pregunta getPreguntaActual() {
		return preguntaActual;
	}

	public void setPreguntaActual(Pregunta preguntaActual) {
		this.preguntaActual = preguntaActual;
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}
}