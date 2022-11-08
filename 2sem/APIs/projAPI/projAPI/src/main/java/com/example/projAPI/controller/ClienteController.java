package com.example.projAPI.controller;

import com.example.projAPI.model.Cliente;
import com.example.projAPI.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/apiCliente")
public class ClienteController {
    @Autowired
    ClienteRepository CliRepo;

    @PostMapping("/insereCliente")
    public void insereCliente(@RequestBody Cliente cl){
        CliRepo.save(cl);
    }

    @PostMapping("/atualizaCliente")
    public void atualizaCliente(@RequestBody Cliente cl){
        CliRepo.save(cl);
    }

    @DeleteMapping("/deletaCliente")
    public void deletaCliente(@RequestBody Cliente cl){
        CliRepo.delete(cl);
    }

    @GetMapping("/buscaTodos")
    public List<Cliente> buscaTodos(){
        return CliRepo.findAll();
    }

    @GetMapping("/buscaNome/{nome}")
    public List<Cliente> buscaNome(@PathVariable(value = "nome") String nome){
        return CliRepo.findByNome(nome);
    }

    @GetMapping("/buscaCodigo/{codigo}")
    public Optional<Cliente> buscarPorCodigo(@PathVariable(value = "codigo") int codigo){
        return CliRepo.findById(codigo);
    }

    @GetMapping("/buscaEmail/{email}")
    public List<Cliente> buscaEmail(@PathVariable(value = "email") String email){
        return CliRepo.findByEmail(email);
    }

}
