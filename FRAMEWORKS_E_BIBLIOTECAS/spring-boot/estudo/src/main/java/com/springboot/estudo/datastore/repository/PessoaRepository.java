package com.springboot.estudo.datastore.repository;

import com.springboot.estudo.datastore.entity.PessoaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long>, JpaSpecificationExecutor<PessoaEntity> {

    @Query(value = "SELECT (*)  FROM Pessoa WHERE NOME = ?1",  nativeQuery = true)
    List<PessoaEntity> buscar_todas_pessoas(String nome);

    @Override
    Page<PessoaEntity> findAll(Pageable page);

    @Override
    List<PessoaEntity> findAll();


    // Classificação/Sort

    @Override
    List<PessoaEntity> findAll(Sort sort);


}
