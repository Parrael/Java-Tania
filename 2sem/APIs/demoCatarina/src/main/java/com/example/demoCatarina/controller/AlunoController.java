package com.example.demoCatarina.controller;

import com.example.demoCatarina.model.Aluno;
import com.example.demoCatarina.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (value = "/apiAluno")
public class AlunoController {

    @Autowired
    AlunoRepository alRepo;

    @GetMapping(value="/todos")
    public List<Aluno> buscarTodos(){
       return  alRepo.findAll();
    }
}
