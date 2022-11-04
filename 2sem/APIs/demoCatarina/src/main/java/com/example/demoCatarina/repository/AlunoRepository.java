package com.example.demoCatarina.repository;

import com.example.demoCatarina.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlunoRepository extends JpaRepository <Aluno, Integer>{
    public List<Aluno> findByNome(String nome);

    @Query(value = "select a from Aluno a where a.ra > ?1")
    public List<Aluno> findByRaMaior(int ra);

    @Query(value = "select a from Aluno a where a.nome like ?1%")
    public List<Aluno> findByLetra(String letra);

    @Query(value= "select a.nome from Aluno a where a.ra> ?1 and a.nome like ?2%")
    public List<String> findByRaNome(int ra, String nome);
}
