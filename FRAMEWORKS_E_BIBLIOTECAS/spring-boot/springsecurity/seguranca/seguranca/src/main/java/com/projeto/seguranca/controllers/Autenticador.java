package com.projeto.seguranca.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.seguranca.configSec.JwtToken;
import com.projeto.seguranca.repositories.UsuarioRepository;

@RestController
@RequestMapping("/auth")
public class Autenticador implements AuthenticationManager {
	
	@Autowired
	private JwtToken token;
	
	@Autowired
	public UsuarioRepository repository;

	@PostMapping
	public String autenticador( @RequestBody UsuarioDTO request) {
		
		Optional<UsuarioEntidade> usuario = repository.findByEmail(request.getEmail());
		
		if (usuario.isEmpty()) {
			throw new RuntimeException("Dados inválidos");
		}
		
		Authentication au = new UsernamePasswordAuthenticationToken(request, usuario);
		
		authenticate(au);
		
		
		return "Cadastrado";
	}

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		
		
		return null;
	}
	
	

	
}
