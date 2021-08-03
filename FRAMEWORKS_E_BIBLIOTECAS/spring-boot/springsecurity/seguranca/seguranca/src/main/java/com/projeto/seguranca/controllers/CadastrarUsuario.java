package com.projeto.seguranca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.seguranca.repositories.UsuarioRepository;

@RestController
@RequestMapping("/cadastrar")
public class CadastrarUsuario {
	
	@Autowired 
	private UsuarioRepository repository;
	
	@PostMapping
	public String cadastrar(@RequestBody UsuarioDTO request) {
		
				
		
		repository.save(request.converter());
		
		
		return "USUARIO CADASTRADO";
	}
	
	
	
}
