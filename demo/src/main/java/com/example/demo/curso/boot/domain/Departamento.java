package com.example.demo.curso.boot.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@SuppressWarnings("serial")
@Table(name="DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long> {
	
	@Column(name="nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@OneToMany(mappedBy = "departamento")
	private List<Cargo> cargos;
}
