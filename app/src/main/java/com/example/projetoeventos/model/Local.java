package com.example.projetoeventos.model;

import java.io.Serializable;


public class Local implements Serializable {

    private Long id;
    private String nomeLocalidade;
    private Double latitude;
    private Double longitute;
    private Endereco endereco;
    private Long empresa_id;
    private Double classificacao;

    /** Construtor de Local sem parametros.
     *
     */
    public Local() {
    }

    /** Construtor com parametros que instancia um Endereço com:
     * @param nomeLocalidade Nome do local para identifica-lo mais facilmente;
     * @param latitude Latitude para calculos de distância;
     * @param longitute Longitude para calculos de distância;
     * @param endereco Endereço da Localidade;
     * @param empresa_id Id da Empresa relacionada a essa localidade;
     * @param classificacao Rating/Classificação da Localidade;
     */
    public Local(String nomeLocalidade, Double latitude, Double longitute, Endereco endereco, Long empresa_id, Double classificacao) {
        this.nomeLocalidade = nomeLocalidade;
        this.latitude = latitude;
        this.longitute = longitute;
        this.endereco = endereco;
        this.empresa_id = empresa_id;
        this.classificacao = classificacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeLocalidade() {
        return nomeLocalidade;
    }

    public void setNomeLocalidade(String nomeLocalidade) {
        this.nomeLocalidade = nomeLocalidade;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitute() {
        return longitute;
    }

    public void setLongitute(Double longitute) {
        this.longitute = longitute;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Long getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(Long empresa_id) {
        this.empresa_id = empresa_id;
    }

    public Double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Double classificacao) {
        this.classificacao = classificacao;
    }
}
