package com.example.demo.curso.boot.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@SuppressWarnings("serial")
@Table(name="CARGOS")
public class Cargo extends AbstractEntity<Serializable>{
	
	@Column(name="nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="id_departamento_fk")
	private Departamento departamento;
	
	@OneToMany(mappedBy = "cargo")
	private List<Funcionario> funcionario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
}
