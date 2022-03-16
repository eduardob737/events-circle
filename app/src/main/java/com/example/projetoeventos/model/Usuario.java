package com.example.projetoeventos.model;

import com.example.projetoeventos.model.enums.TipoCliente;

import java.util.List;

public class Usuario extends Cliente{

	private static final long serialVersionUID = 1L;

	private Long id;
	private String cpf;
	private List<Empresa> empresas;
	private TipoCliente tipoCliente;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}

	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
}
