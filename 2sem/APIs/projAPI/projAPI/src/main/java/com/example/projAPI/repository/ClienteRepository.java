package com.example.projAPI.repository;

import com.example.projAPI.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository <Cliente, Integer>{

    //Busca por Nome
    public List<Cliente> findByNome(String nome);
    @Query(value = "select c from Cliente c where c.nome like ?1%")
    public List<Cliente> findByNomeInicia(String nome);

    //Busca por Email
    @Query(value = "select c from Cliente c where c.email like ?1")
    public List<Cliente> findByEmail(String email);
    @Query(value = "select c from Cliente c where c.email like ?1%")
    public List<Cliente> findByEmailInicia(String email);

    @Query(value = "select c from Cliente c where c.codigo > ?1")
    public List<Cliente> findByCodigoMaior(int codigo);

    //Busca Dupla:
    @Query(value = "select c from Cliente c where c.nome like ?1% and c.email like ?2%")
    public List<Cliente> findByNomeIniciaEEmailInicia(String nome, String email);
}
