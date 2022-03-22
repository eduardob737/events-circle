package com.example.projetoeventos.model;

import java.io.Serializable;

public class Avaliacao implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Double local;
	private Double evento;
	private Double organizador;
	private Double atracao;
	private String comentario;
	
	/**
	 * Método Construtor padrão de Avaliacação
	 */
	public Avaliacao() {}

	public Avaliacao(Double local, Double evento, Double organizador, Double atracao, String comentario) {
		this.local = local;
		this.evento = evento;
		this.organizador = organizador;
		this.atracao = atracao;
		this.comentario = comentario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getLocal() {
		return local;
	}

	public void setLocal(Double local) {
		this.local = local;
	}

	public Double getEvento() {
		return evento;
	}

	public void setEvento(Double evento) {
		this.evento = evento;
	}

	public Double getOrganizador() {
		return organizador;
	}

	public void setOrganizador(Double organizador) {
		this.organizador = organizador;
	}

	public Double getAtracao() {
		return atracao;
	}

	public void setAtracao(Double atracao) {
		this.atracao = atracao;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}
