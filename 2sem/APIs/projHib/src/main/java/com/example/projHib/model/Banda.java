package com.example.projHib.model;

import javax.persistence.*;

@Entity
@Table(name="TabBanda")
public class Banda {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int codBanda;
    @Column (nullable = false)
    protected String nomeBanda;
    @Column
    protected int numIntegrantes;

    //Getters e Setters
    public int getCodBanda() {
        return codBanda;
    }

    public void setCodBanda(int codBanda) {
        this.codBanda = codBanda;
    }

    public String getNomeBanda() {
        return nomeBanda;
    }

    public void setNomeBanda(String nomeBanda) {
        this.nomeBanda = nomeBanda;
    }

    public int getNumIntegrantes() {
        return numIntegrantes;
    }

    public void setNumIntegrantes(int numIntegrantes) {
        this.numIntegrantes = numIntegrantes;
    }
}
