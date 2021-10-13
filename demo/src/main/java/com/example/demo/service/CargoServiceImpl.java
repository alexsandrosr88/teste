package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.curso.boot.domain.Cargo;
import com.example.demo.dao.CargoDao;

@Service
@Transactional(readOnly = false)
public class CargoServiceImpl implements CargoService {
	
	@Autowired
	private CargoDao dao;
	
	@Transactional(readOnly = false)
	@Override
	public void salvar(Cargo cargo) {
		dao.save(cargo);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(Cargo cargo) {
		dao.update(cargo);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Transactional(readOnly = true)
	@Override
	public Cargo buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Cargo> buscarTodos() {
		return dao.findAll();
	}
}
