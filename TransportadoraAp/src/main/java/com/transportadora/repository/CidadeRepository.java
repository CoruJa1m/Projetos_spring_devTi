package com.transportadora.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transportadora.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

	public List<Cidade> findByUf(String uf);
	
}
