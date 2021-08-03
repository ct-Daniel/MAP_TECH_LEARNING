package com.projeto.seguranca.controllers;

public class UsuarioDTO {

	private String email;
	private String senha;
	
	
	public String getEmail() {
		return email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public UsuarioEntidade converter() {
		
		
		
		return new UsuarioEntidade(email, senha);
	}
	
}
