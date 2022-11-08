package com.example.projAPI.controller;

import com.example.projAPI.model.Produto;
import com.example.projAPI.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/apiProduto")
public class ProdutoController {
    @Autowired
    ProdutoRepository ProRepo;

    @PostMapping("/insereProduto")
    public void inserirProduto(@RequestBody Produto p){
        ProRepo.save(p);
    }

    @PutMapping("/atualizaProduto")
    public void atualizaProduto(@RequestBody Produto p){
        ProRepo.save(p);
    }

    @DeleteMapping("/deletaProduto")
    public void deletaProduto(@RequestBody Produto p){
        ProRepo.delete(p);
    }

    @GetMapping("/buscaTodos")
    public List<Produto> buscaTodos(){
        return ProRepo.findAll();
    }
}
