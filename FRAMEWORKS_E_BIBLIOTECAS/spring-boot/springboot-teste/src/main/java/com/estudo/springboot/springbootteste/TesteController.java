package com.estudo.springboot.springbootteste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteController {

    @Autowired
    private ObjetoPessoa objeto_pessoa;

    @GetMapping
    public ResponseEntity<String> read() {

        System.out.println("nome: " + objeto_pessoa.getNome());
        System.out.println("idade: " + objeto_pessoa.getIdade());

        return ResponseEntity.ok().body("testado");
    }

}
