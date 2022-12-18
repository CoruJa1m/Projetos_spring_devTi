package com.devti.aula.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devti.aula.model.Cliente;

public interface ClienteRepository	extends JpaRepository<Cliente, Integer> {

	
}
