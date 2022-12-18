package com.transportadora.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.transportadora.model.Cliente;
import com.transportadora.repository.ClienteRepository;

public class ClienteService {

	@Autowired
	ClienteRepository repository;

	public Cliente insere(Cliente c) {
		return repository.save(c);
	}
	
	public Cliente alterar(Cliente c) {
		return repository.save(c);
	}
	
	public void excluir(Integer id) {
		Cliente c= repository.findById(id).get();
		 repository.delete(c);	}
	
	public List<Cliente> listarTodos(){
		return repository.findAll();
	}
	
}
