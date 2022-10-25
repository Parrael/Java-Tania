package com.example.projHib.model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name="TabCantor")
public class Cantor {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int codCantor;
    @Column
    protected String nome;
    @Column
    protected int idade;
    @Column (nullable = false)
    protected String nomeArt;

    //Getters e Setters
    public int getCodCantor() {
        return codCantor;
    }

    public void setCodCantor(int codigo) {
        this.codCantor = codCantor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNomeArt() {
        return nomeArt;
    }

    public void setNomeArt(String nomeArt) {
        this.nomeArt = nomeArt;
    }
}
