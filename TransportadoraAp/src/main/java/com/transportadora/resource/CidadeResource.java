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

import com.transportadora.model.Cidade;
import com.transportadora.service.CidadeService;

@RestController
@RequestMapping("/cidade")
public class CidadeResource {

	@Autowired
	private CidadeService service;
	
	@PostMapping
	public Cidade salvarCidade(@RequestBody Cidade c) {
		return service.salvar(c);
	}
	
	@PutMapping
	public Cidade AlterarCidade(@RequestBody Cidade c, @RequestParam("id") int id) {
		c.setId(id);
		return service.alterar(c);
	}
	
	@GetMapping
	public List<Cidade> listarTodas() {
		return service.listarTodas();
	}
	
	@GetMapping("buscaruf/{uf}")
	public List<Cidade> buscarPorUf(@PathVariable("uf") String uf) {
		return service.buscarPorUf(uf);
	}
	
	@DeleteMapping("/{id}")
	public void excluir(@PathVariable("id") Long id) {
		service.excluir(id);
	}
	
	@DeleteMapping("/all")
	public void excluirTodas() {
		service.excluirTodas();
	}
}
