package com.example.projetoeventos.model.enums;

public enum TipoAtracao {

	MUSICAL("Musical", 0), 
	AUDIOVISUAL("Audiovisual", 1),
	CIRCENSE("Circense", 2);
	
	private String nome;
	private int indice;

	TipoAtracao(String nome, int indice) {
		this.nome = nome;
		this.indice = indice;
	}
	
	/**
	 * 
	 * @return String nome
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * @return int indica
	 */
	public int getIndice() {
		return this.indice;
	}

	/**
	 * Enum referente ao Tipo de Evento
	 *
	 * @author João Victor
	 * @since 0.0.1-SNAPSHOT
	 **/

	public enum TipoEvento {

		CONFERENCIA("Conferência", 0),
		MUSICAL("Musical", 1),
		SHOW("Show", 2);

		private String nome;
		private int indice;

		/**
		 * Um construtor de tipo de evento
		 *
		 * @param nome   O rótulo do tipo de evento como String
		 * @param indice O Índice referente a esse tipo de evento
		 */
		TipoEvento(String nome, int indice) {
			this.nome = nome;
			this.indice = indice;
		}

		/**
		 * @return O rótulo do tipo de evento como String
		 */
		public String getNome() {
			return this.nome;
		}

		/**
		 * @return O Índice referente a esse tipo de evento
		 */
		public int getIndice() {
			return this.indice;
		}

	}
}
