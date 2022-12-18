package com.transportadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.transportadora.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
