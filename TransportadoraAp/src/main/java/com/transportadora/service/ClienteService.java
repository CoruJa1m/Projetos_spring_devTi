package com.transportadora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.transportadora.model.Cliente;
import com.transportadora.repository.ClienteRepository;

@Service
public class ClienteService{
	
	@Autowired
	ClienteRepository repo;

	public List<Cliente> listarTodos() {
		return repo.findAll();
	}

	@Transactional
	public Cliente salvar(Cliente cliente) {
		return repo.save(cliente);
	}

	@Transactional
	public Cliente alterar(Cliente cliente) {
		return repo.save(cliente);
	}

	public void excluir(Long id) {
		if(repo.existsById(id)) repo.deleteById(id);
	}

	public List<Cliente> listarPorCidade(String cidade) {
		return repo.findAllByCidadeNome(cidade);
	}

	public void excluirTodos() {
		repo.deleteAll();
	}

}
