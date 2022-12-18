package com.transportadora.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transportadora.model.Cidade;
import com.transportadora.repository.CidadeRepository;


@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repo;
	
	public Cidade salvar(Cidade cidade) {
		return repo.save(cidade);
	}
	
	public Cidade alterar(Cidade cidade) {
		return repo.save(cidade);
	}

	public List<Cidade> listarTodas() {
		return repo.findAll();
	}

	public void excluir(Long id) {
		if(repo.existsById(id)) repo.deleteById(id);
	}

	public void excluirTodas() {
		repo.deleteAll();
	}

	public List<Cidade> buscarPorUf(String uf) {
		return repo.findByUf(uf);
	}

}
