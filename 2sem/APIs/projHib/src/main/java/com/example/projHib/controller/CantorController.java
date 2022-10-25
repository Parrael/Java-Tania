package com.example.projHib.controller;

import com.example.projHib.model.Cantor;
import com.example.projHib.repository.CantorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/apiCantor")
public class CantorController {
    @Autowired
    CantorRepository cantorRep;

    @RequestMapping(value = "/todos")
    public List<Cantor> buscaTodos(){
        return cantorRep.findAll();
    }

}
