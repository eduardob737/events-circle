package com.example.projetoeventos.model;

import java.io.Serializable;
import java.util.List;


public abstract class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private String url;
    private String email;
    private String telefone;
    private String senha;
    private List<Evento> eventos;
    private List<Evento> eventosConfirmados;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public List<Evento> getEventosConfirmados() {
        return eventosConfirmados;
    }

    public void setEventosConfirmados(List<Evento> eventosConfirmados) {
        this.eventosConfirmados = eventosConfirmados;
    }
}
