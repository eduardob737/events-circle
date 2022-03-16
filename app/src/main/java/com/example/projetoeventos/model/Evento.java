package com.example.projetoeventos.model;

import com.example.projetoeventos.model.enums.TipoAtracao;
import com.example.projetoeventos.model.enums.TipoTags;
import com.example.projetoeventos.model.enums.TipoVisibilidade;

import java.time.LocalDate;
import java.util.List;

public class Evento {


    private static final long serialVersionUID = 1L;

    private Long id;


    private String titulo;


    private String urlEvento;


    private String descricao;


    private LocalDate data;

    private Local localizacao;
    private Integer visualizacoes;
    private Integer confirmacoes;
    private TipoAtracao.TipoEvento tipoEvento;
    private TipoVisibilidade tipoVisibilidade;
    private Long cliente_id;
    private Double valor;
    private List<TipoTags> tags;

//    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<Artista> artistas;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrlEvento() {
        return urlEvento;
    }

    public void setUrlEvento(String urlEvento) {
        this.urlEvento = urlEvento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Local getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Local localizacao) {
        this.localizacao = localizacao;
    }

    public Integer getVisualizacoes() {
        return visualizacoes;
    }

    public void setVisualizacoes(Integer visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    public Integer getConfirmacoes() {
        return confirmacoes;
    }

    public void setConfirmacoes(Integer confirmacoes) {
        this.confirmacoes = confirmacoes;
    }

    public TipoAtracao.TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoAtracao.TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public TipoVisibilidade getTipoVisibilidade() {
        return tipoVisibilidade;
    }

    public void setTipoVisibilidade(TipoVisibilidade tipoVisibilidade) {
        this.tipoVisibilidade = tipoVisibilidade;
    }

    public Long getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Long cliente_id) {
        this.cliente_id = cliente_id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public List<TipoTags> getTags() {
        return tags;
    }

    public void setTags(List<TipoTags> tags) {
        this.tags = tags;
    }
}
