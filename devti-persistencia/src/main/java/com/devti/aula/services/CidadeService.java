package com.devti.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devti.aula.model.Cidade;
import com.devti.aula.repositores.CidadeRepository;
import java.util.List;
import java.util.Optional;


@Service
public class CidadeService {
	
	@Autowired
	CidadeRepository rep;
	
	public void excluir(Integer id) {
		Cidade cidadeExcluir = rep.findById(id).get();
		if (cidadeExcluir != null) {
			rep.delete(cidadeExcluir);
		}
	}
	
	public Cidade incluir(Cidade c) {
		 return rep.save(c);
	}
	
	public List<Cidade> listarTodas(){
		return rep.findAll();
	}
	
	public Cidade alterar(Cidade c) {
		return rep.save(c);
		
	}
	

	
}
