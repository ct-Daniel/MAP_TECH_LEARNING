package com.projeto.seguranca.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.seguranca.controllers.UsuarioEntidade;

public interface UsuarioRepository extends JpaRepository<UsuarioEntidade, Long> {

	Optional<UsuarioEntidade> findByEmail(String email);
}
