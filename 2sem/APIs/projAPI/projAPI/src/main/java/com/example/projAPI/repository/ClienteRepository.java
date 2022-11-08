package com.example.projAPI.repository;

import com.example.projAPI.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository <Cliente, Integer>{

    public List<Cliente> findByNome(String nome);

    @Query(value = "select c from Cliente c where c.email like ?1")
    public List<Cliente> findByEmail(String email);
}
