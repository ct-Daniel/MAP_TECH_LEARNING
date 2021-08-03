package com.springboot.estudo.datastore.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class EnderecoEntity {

    @Id
    private int id;
    private String rua;
    private String cidade;
    private String estado;

    public  EnderecoEntity(){};

    public EnderecoEntity(int id, String rua, String cidade, String estado) {
        this.id = id;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
