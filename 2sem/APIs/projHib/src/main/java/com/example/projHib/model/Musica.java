package com.example.projHib.model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name="TabMusica")
public class Musica {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int codMusica;
    @Column(nullable = false)
    protected String nome;
    @Column
    protected String album;
    @Column
    protected int anoLancamento;
    @Column
    protected String genero;

    //Getters e setters
    public int getCodMusica() {
        return codMusica;
    }

    public void setCodMusica(int codMusica) {
        this.codMusica = codMusica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
