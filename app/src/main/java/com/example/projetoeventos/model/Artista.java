package com.example.projetoeventos.model;

import com.example.projetoeventos.model.enums.TipoAtracao;

import java.io.Serializable;

public class Artista implements Serializable {


	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String urlPerfil;
	private TipoAtracao atracao;

	public Artista() {}

	public Artista(String nome, String url, TipoAtracao tipo) {
		this.nome = nome;
		this.urlPerfil = url;
		this.atracao = tipo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUrlPerfil() {
		return urlPerfil;
	}

	public void setUrlPerfil(String urlPerfil) {
		this.urlPerfil = urlPerfil;
	}

	public TipoAtracao getAtracao() {
		return atracao;
	}

	public void setAtracao(TipoAtracao atracao) {
		this.atracao = atracao;
	}
}
