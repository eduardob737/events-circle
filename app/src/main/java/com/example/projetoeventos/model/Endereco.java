package com.example.projetoeventos.model;

import java.io.Serializable;


public class Endereco implements Serializable {

    private Long id;
    private Integer numero;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;

    /**
     * Construtor de Endereço sem parametros.
     */
    public Endereco() {
    }

    /**
     * Construtor com parametros que instancia um Endereço com:
     * @param numero número referente ao endereço;
     * @param bairro bairro referente ao endereço;
     * @param cep cep referente ao endereço;
     * @param cidade cidade referente ao endereço;
     * @param estado estado referente ao endereço.
     */
    public Endereco(Integer numero, String bairro, String cep, String cidade, String estado) {
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
