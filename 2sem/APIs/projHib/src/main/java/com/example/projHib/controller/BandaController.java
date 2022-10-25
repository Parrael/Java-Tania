package com.example.projHib.controller;

import com.example.projHib.model.Banda;
import com.example.projHib.repository.BandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/apiBanda")
public class BandaController {
    @Autowired
    BandaRepository bandaRep;

    @GetMapping (value = "/todos")
    public List<Banda> buscaTodos(){
        return bandaRep.findAll();
    }

}
