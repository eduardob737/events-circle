package com.example.projetoeventos.model;

import java.io.Serializable;
import java.util.List;

public class Empresa extends Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String razaoSocial;
    private String cnpj;
    private List<Local> locais;
    private List<Usuario> admins;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Local> getLocais() {
        return locais;
    }

    public void setLocais(List<Local> locais) {
        this.locais = locais;
    }

    public List<Usuario> getAdmins() {
        return admins;
    }

    public void setAdmins(List<Usuario> admins) {
        this.admins = admins;
    }
}