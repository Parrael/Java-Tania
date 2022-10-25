package com.example.projHib.controller;

import com.example.projHib.model.Musica;
import com.example.projHib.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/apiMusica")
public class MusicaController {

    @Autowired
    MusicaRepository musicaRep;

    @GetMapping(value = "/todos")
    public List<Musica> buscaTodos(){
        return musicaRep.findAll();
    }
}
