package com.estudo.springboot.springbootteste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ObjetoPessoa {

    private String nome;

    private String idade;

    @Autowired
    public ObjetoPessoa(
            @Value("${nome}") String nome,
            @Value("${idade}") String idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
