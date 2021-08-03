package com.springboot.estudo.service;

import com.springboot.estudo.datastore.entity.PessoaEntity;
import com.springboot.estudo.datastore.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository_pessoa;

    public void salvar(PessoaEntity entity) {
        repository_pessoa.save(entity);
    }

    @Cacheable(value = "cachePessoas")
    public Collection<PessoaEntity> buscar_todas_pessoas() throws InterruptedException {

        Thread.sleep(2000);

        return repository_pessoa.findAll();
    }


    public Page<PessoaEntity> buscar_todas_pessoas_com_paginacao(int page) {

        return repository_pessoa.findAll(Pageable.ofSize(page));
    }

    public Page<PessoaEntity> buscar_pessoas_com_classificacao_pagerequest(PageRequest page_request) {
        return repository_pessoa.findAll(page_request);
    }

    public List<PessoaEntity> buscar_pessoas_com_especificacao(Specification<PessoaEntity> specification) {
        return repository_pessoa.findAll(specification);
    }


}
