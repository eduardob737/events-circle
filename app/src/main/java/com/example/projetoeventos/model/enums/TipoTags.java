package com.example.projetoeventos.model.enums;

public enum TipoTags {
    TAG0("Tag 0",0),
    TAG1("Tag 1",1),
    TAG2("Tag 2",2);

    private String nome;
    private int indice;

    /**
     * Um construtor de tipo de tag
     * @param nome O rótulo do tipo de tag como String
     * @param indice O Índice referente a esse tipo de tag
     */
    TipoTags(String nome, int indice) {
        this.nome = nome;
        this.indice = indice;
    }

    /**
     * @return O rótulo do tipo de tag como String
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * @return O Índice referente a esse tipo de tag
     */
    public int getIndice() {
        return this.indice;
    }

}
