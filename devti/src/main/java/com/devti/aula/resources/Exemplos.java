package com.devti.aula.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devti")

public class Exemplos {
	
	@GetMapping
	public String exemplo1() {
		return "ola, voce esta na AP DevTi-Sul";
	}
}
