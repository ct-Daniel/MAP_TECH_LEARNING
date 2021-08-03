package com.springboot.estudo.controller;

import com.springboot.estudo.datastore.entity.PessoaEntity;
import com.springboot.estudo.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping
public class PessoaController {

    private PessoaService service;

    public PessoaController(PessoaService service) {
        this.service = service;
    }

    @GetMapping("/buscar/pessoa")
    public ResponseEntity salvar_pessoa(@RequestBody(required = false) DtoPessoa request) throws InterruptedException {

/*       Page<PessoaEntity> pessoas_encontradas =
                 service.buscar_todas_pessoas_com_paginacao(Integer.valueOf(page));
*/

/*
        int sorts[] = { 1, 2, 3 };
        Page<PessoaEntity> pessoas_encontradas =
                service.buscar_pessoas_com_classificacao_pagerequest(PageRequest.of(1, 5, Sort.unsorted()));
*/

        Collection<PessoaEntity> pessoas_encontradas = service.buscar_todas_pessoas();

        System.out.println("enviado");

        return ResponseEntity.ok().body(pessoas_encontradas);
    }

    @GetMapping("/salvar/pessoa")
    public ResponseEntity getPessoa(@RequestBody(required = false) DtoPessoa request) throws InterruptedException {

/*       Page<PessoaEntity> pessoas_encontradas =
                 service.buscar_todas_pessoas_com_paginacao(Integer.valueOf(page));
*/

/*
        int sorts[] = { 1, 2, 3 };
        Page<PessoaEntity> pessoas_encontradas =
                service.buscar_pessoas_com_classificacao_pagerequest(PageRequest.of(1, 5, Sort.unsorted()));
*/

        for(int contador = 0; contador < 2000000; contador++){
            PessoaEntity model = new PessoaEntity("Daniel", "19", "173", contador);

            service.salvar(model);
        };

        System.out.println("enviado");

        return ResponseEntity.ok().build();
    }

    @GetMapping("apagar-cache")
    public ResponseEntity<?> apagar_cache() {
        // service.apaga_cache();

        return ResponseEntity.ok().build();
    }


}
