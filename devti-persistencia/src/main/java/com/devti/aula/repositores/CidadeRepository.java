package com.devti.aula.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devti.aula.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{
	
}
