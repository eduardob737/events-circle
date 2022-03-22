package com.example.projetoeventos.model.enums;

public enum TipoVisibilidade {

    COMUNITARIO("Comunitário",0), PARTICULAR("Particular",1), PRIVADO("Privado",2), PUBLICO("Público",3);

    private String nome;
    private int indice;

    /**
     * Um construtor de visibilidade do evento
     * @param nome O rótulo do tipo de visibilidade como String
     * @param indice O Índice referente a esse tipo de visibilidade
     */
    TipoVisibilidade(String nome, int indice) {
        this.nome = nome;
        this.indice = indice;
    }

    /**
     * @return O rótulo do tipo de visibilidade como String
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * @return O Índice referente a esse tipo de visibilidade
     */
    public int getIndice() {
        return this.indice;
    }
}
