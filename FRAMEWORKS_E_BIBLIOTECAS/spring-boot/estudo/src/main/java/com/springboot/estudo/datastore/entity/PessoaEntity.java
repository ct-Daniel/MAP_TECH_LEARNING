package com.springboot.estudo.datastore.entity;



import javax.persistence.*;

@Entity
@Table(name = "Pessoa")
public class PessoaEntity {

    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "IDADE")
    private String idade;
    @Column(name = "ALTURA")
    private String altura;

    @OneToOne
    private EnderecoEntity endereco;


    @Deprecated
    public PessoaEntity() {}

    public PessoaEntity(String nome, String idade, String altura, int id) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.id = id;
    }

    /*    public PessoaEntity(String nome, String idade, String altura, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }*/

    public String getNome() { return nome; }

    public String getIdade() {
        return idade;
    }

    public String getAltura() {
        return altura;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public void setId(int id) {
        this.id = id;
    }
}
