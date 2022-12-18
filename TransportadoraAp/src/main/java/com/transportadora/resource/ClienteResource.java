package com.transportadora.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.transportadora.model.Cliente;
import com.transportadora.service.ClienteService;


@RestController
@RequestMapping("/cliente")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;
	
	@PostMapping
	public Cliente salvarCidade(@RequestBody Cliente c) {
		return service.salvar(c);
	}
	
	@PutMapping
	public Cliente AlterarCidade(@RequestBody Cliente c, @RequestParam("id") int id) {
		c.setId(id);
		return service.alterar(c);
	}
	
	@GetMapping
	public List<Cliente> listarTodas() {
		return service.listarTodos();
	}
	
	@GetMapping("/{cidadeNome}")
	public List<Cliente> listarPorNomeCidade(@PathVariable("cidadeNome") String cidadeNome) {
		return service.listarPorCidade(cidadeNome);
	}
	
	@DeleteMapping("/{id}")
	public void excluir(@PathVariable("id") Long id) {
		service.excluir(id);
	}
	
	@DeleteMapping("/all")
	public void excluir() {
		service.excluirTodos();
	}

}
