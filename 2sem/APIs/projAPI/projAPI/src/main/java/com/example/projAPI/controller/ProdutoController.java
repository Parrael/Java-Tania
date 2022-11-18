package com.example.projAPI.controller;

import com.example.projAPI.model.Cliente;
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

    @GetMapping("/buscaCodigo/{codigo}")
    public List<Produto> buscaCodigo(@PathVariable(value = "codigo") int codigo){
        return ProRepo.findById(codigo);
    }
    @GetMapping("/buscaDescricao/{descricao}")
    public List<Produto> buscaDescricao(@PathVariable(value = "descricao") String descricao){
        return ProRepo.findByDescricao(descricao);
    }
    @GetMapping("/buscaMarca/{marca}")
    public List<Produto> buscaMarca(@PathVariable(value = "marca") String marca){
         return ProRepo.findByMarca(marca);
    }
    @GetMapping("/buscaPreco/{preco}")
    public List<Produto> buscaPreco(@PathVariable(value = "preco") double preco) {
        return ProRepo.findByPreco(preco);
    }
    @GetMapping("/buscaPrecoMaior/{preco}")
    public List<Produto> buscaPrecoMaior(@PathVariable(value = "preco") double preco){
        return ProRepo.findByPrecoMaior(preco);
    }
    @GetMapping("/buscaPrecoMenor/{preco}")
    public List<Produto> buscaPrecoMenor(@PathVariable(value = "preco") double preco){
        return ProRepo.findByPrecoMenor(preco);
    }
    @GetMapping("/buscaDescricaoInicia/{descricao}")
    public List<Produto> buscaDescricaoInicia(@PathVariable(value = "descricao") String descricao){
        return ProRepo.findByDescricaoInicia(descricao);
    }
    @GetMapping("/buscaMarca/{marca}")
    public List<Produto> buscaMarcaInicia(@PathVariable(value = "marca") String marca){
        return ProRepo.findByMarcaInicia(marca);
    }
    @GetMapping("/buscaDescricaoIniciaEMarcaInicia/{descricao}/{marca}")
    public List<Produto> buscaDescricaoIniciaEMarcaInicia(@PathVariable(value = "descricao") String descricao, @PathVariable(value = "marca") String marca){
        return ProRepo.findByDescricaoIniciaEMarcaInicia(descricao, marca);
    }
    @GetMapping("/buscaDescricaoIniciaEPrecoMenor/{descricao}/{preco}")
    public List<Produto> buscaDescricaoIniciaEPrecoMenor(@PathVariable(value = "descricao") String descricao, @PathVariable(value = "preco") int preco){
        return ProRepo.findByDescricaoIniciaEPrecoMenor(descricao, preco);
    }


}
