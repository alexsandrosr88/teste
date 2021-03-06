package com.example.demo.curso.boot.domain;

public enum Uf {
	
	AC("AC", "Acre"),
	AL("AL", "Alagoas");
	
	private String sigla;
	
	private String descricao;

	Uf(String sigla, String descricao) {
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
