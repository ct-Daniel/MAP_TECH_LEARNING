package com.springboot.estudo.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Component;

@Component
public class PessoaImpl extends PessoaService {

    @CacheEvict(value = "cachePessoas")
    public void apaga_cache(){
        System.out.println("Cache apagado");
    }
}
