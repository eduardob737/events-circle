package com.example.projetoeventos.model.enums;

public enum TipoCliente {
	ORGANIZADOR("Organizador",0),ESPECTADOR("Espectador",1);
	
	private String nome;
	private int position;
	
	/**
	 * 
	 * @param nome
	 * @param position
	 */
	TipoCliente(String nome, int position) {
		this.nome = nome;
		this.position = position;
	}
	
	/**
	 * 
	 * @return o nome formatado do enum
	 */
	public String getNome() {
		return this.nome;
	}
	
	/**
	 * 
	 * @return a posicao do Enum
	 */
	public int getPosition() {
		return this.position;
	}
	
}
