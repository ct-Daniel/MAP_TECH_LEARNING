package com.projeto.seguranca.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.projeto.seguranca.repositories.UsuarioRepository;

public class AuthenticationService {
	
	@Autowired
	private UsuarioRepository repository;

	/*
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<UsuarioEntidade> usuario = repository.findByEmail(username);
				
		if(usuario.isEmpty()) {
			throw new UsernameNotFoundException("Dados inválidos");
		}
		
		
		
		return UserDetails;
	}*/

}
