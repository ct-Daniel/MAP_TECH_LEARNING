package com.projeto.seguranca.controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class Teste {
	
	@GetMapping
	public String cadastrado() {
		
		
		return "RECURSO PRIVADO";
	}
	
	
}
