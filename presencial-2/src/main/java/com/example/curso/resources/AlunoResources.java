package com.example.curso.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.curso.model.Aluno;
import com.example.curso.services.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoResources {
	
	@Autowired
	AlunoService service;
	
	@PostMapping
	public Aluno cadastraAluno(@RequestBody Aluno a) {
		return service.cadastrarAluno(a);
	}
	
	@GetMapping
	public String informacao(@RequestParam("nome")String nome ,@RequestParam("oper") int operacao) {
		Aluno al=service.buscarAluno(nome);
		
		if (operacao==1)
			return service.avaliaImc();
			
			return service.avaliaMedia(al);
	}
	
	@GetMapping("/listar")
	public List<Aluno> listarAlunos(){
		return service.listarTodos();
	}
	
	@GetMapping("listar/aprovados")
	public List<Aluno> listarAporvados(){
	return service.listarAprovados();
	
	}
	
	@GetMapping("/buscar")
	public Aluno buscarAluno(@RequestParam("nome") String nome){
		return service.buscarAluno(nome);
	}
	
	@GetMapping("listar/reprovados")
	public List<Aluno> listarreporvados(){
	return service.listarReprovados();
	
	}
		
	
	

}
