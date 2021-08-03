package com.springboot.estudo.controller;

public class DtoPessoa {

    private String nome;

    public DtoPessoa(){};

    public DtoPessoa(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
