package com.transportadora.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.transportadora.model.Cliente;
import com.transportadora.service.ClienteService;

public class ClienteResources {

	@Autowired
	ClienteService service;
	
	@PostMapping
	public Cliente insere(@RequestBody Cliente c) {
		return service.insere(c);
	}
	
	@PutMapping
	public Cliente alterar( Cliente c) {
		return service.alterar(c);
	}
	
	@DeleteMapping("/{id}")
	public void excluir(@PathVariable("id") Integer id) {
		service.excluir(id);
	}
	
	@GetMapping
	public List<Cliente> listarTodos(){
		return service.listarTodos();
	}
}
