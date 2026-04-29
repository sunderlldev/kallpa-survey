package com.proyecto.PI09.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "respuesta_usuario")
public class RespuestaUsuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_respuesta_usuario")
	private Integer idRespuestaUsuario;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_intento", nullable = false)
	private IntentoSimulacion intento;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_pregunta", nullable = false)
	private Pregunta pregunta;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_alternativa", nullable = false)
	private Alternativa alternativa;

	@Column(name = "puntaje_obtenido", nullable = false)
	private Integer puntajeObtenido = 0;

	@Column(name = "fecha_respuesta", nullable = false)
	private LocalDateTime fechaRespuesta;

	@PrePersist
	public void prePersist() {
		if (fechaRespuesta == null)
			fechaRespuesta = LocalDateTime.now();
	}

	public Integer getIdRespuestaUsuario() {
		return idRespuestaUsuario;
	}

	public IntentoSimulacion getIntento() {
		return intento;
	}

	public void setIntento(IntentoSimulacion intento) {
		this.intento = intento;
	}

	public Pregunta getPregunta() {
		return pregunta;
	}

	public void setPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}

	public Alternativa getAlternativa() {
		return alternativa;
	}

	public void setAlternativa(Alternativa alternativa) {
		this.alternativa = alternativa;
	}

	public Integer getPuntajeObtenido() {
		return puntajeObtenido;
	}

	public void setPuntajeObtenido(Integer puntajeObtenido) {
		this.puntajeObtenido = puntajeObtenido;
	}

	public LocalDateTime getFechaRespuesta() {
		return fechaRespuesta;
	}

	public void setFechaRespuesta(LocalDateTime fechaRespuesta) {
		this.fechaRespuesta = fechaRespuesta;
	}
}