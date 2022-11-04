package com.example.demoCatarina.controller;

import com.example.demoCatarina.model.Aluno;
import com.example.demoCatarina.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (value = "/apiAluno")
public class AlunoController {

    @Autowired
    AlunoRepository alRepo;

    @GetMapping(value="/todos")
    public List<Aluno> buscarTodos(){
        return  alRepo.findAll();
    }

    @GetMapping("/aluno/{ra}")
    public Optional<Aluno> buscarPorRa(@PathVariable(value = "ra") int ra){
        return alRepo.findById(ra);
    }

    @PostMapping("/inserirAluno")
    public void inserirAlunos(@RequestBody Aluno al){
        alRepo.save(al);
    }

    @DeleteMapping("/removerAluno")
    public void removerAluno(@RequestBody Aluno al){
        alRepo.delete(al);
    }

    @PutMapping("/atualizarAluno")
    public void atualizarALuno(@RequestBody Aluno al){
        alRepo.save(al);
    }

    @GetMapping("/nome/{nome}")
    public List<Aluno> listaPorNome(@PathVariable(value = "nome") String nome){
        return alRepo.findByNome(nome);
    }

    @GetMapping("/raMaior/{ra}")
    public List<Aluno> listPorRaMaior(@PathVariable(value="ra") int ra){
        return alRepo.findByRaMaior(ra);
    }

    @GetMapping("/buscaPorLetra/{letra}")
    public List<Aluno> listaPorLetra(@PathVariable(value = "letra") String letra){
        return alRepo.findByLetra(letra);
    }

    @GetMapping("/raNome/{ra}/{nome}")
    public List<String> listarRaNome(@PathVariable(value= "ra")int ra, @PathVariable(value = "nome") String nome){
        return alRepo.findByRaNome(ra, nome);
    }

}
