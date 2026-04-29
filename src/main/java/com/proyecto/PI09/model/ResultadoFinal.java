package com.proyecto.PI09.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "resultado_final")
public class ResultadoFinal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_resultado")
	private Integer idResultado;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_intento", nullable = false, unique = true)
	private IntentoSimulacion intento;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_perfil")
	private Perfil perfil;

	@Column(name = "resumen", columnDefinition = "TEXT")
	private String resumen;

	@Column(name = "feedback", columnDefinition = "TEXT")
	private String feedback;

	@Column(name = "fecha_generacion", nullable = false)
	private LocalDateTime fechaGeneracion;

	@PrePersist
	public void prePersist() {
		if (fechaGeneracion == null)
			fechaGeneracion = LocalDateTime.now();
	}

	public Integer getIdResultado() {
		return idResultado;
	}

	public IntentoSimulacion getIntento() {
		return intento;
	}

	public void setIntento(IntentoSimulacion intento) {
		this.intento = intento;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public LocalDateTime getFechaGeneracion() {
		return fechaGeneracion;
	}

	public void setFechaGeneracion(LocalDateTime fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}
}