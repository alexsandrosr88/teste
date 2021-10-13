package com.example.demo.curso.boot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@SuppressWarnings("serial")
@Table(name="Enderecos")
public class Endereco extends AbstractEntity<Long> {
	
	@Column(nullable = false)
	private String logradouro;
	
	@Column(nullable = false)
	private String cidade;
	
	@Column(nullable = false)
	private String bairro;
	
	@Column(nullable = false, length = 2)
	@Enumerated(EnumType.STRING)
	private Uf uf;
	
	@Column(nullable = false, length = 9)
	private Integer numero;
	
	
	private String complemento;


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public Uf getUf() {
		return uf;
	}


	public void setUf(Uf uf) {
		this.uf = uf;
	}


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	
}
