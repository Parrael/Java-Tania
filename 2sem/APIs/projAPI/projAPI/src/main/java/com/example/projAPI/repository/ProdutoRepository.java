package com.example.projAPI.repository;

import com.example.projAPI.model.Cliente;
import com.example.projAPI.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository <Produto,Integer>{
    List<Produto> findById(int codigo);

    //Busca de Descrição:
    @Query(value = "select p from Produto p where p.descricao like ?1")
    List<Produto> findByDescricao(String descricao);
    @Query(value = "select p from Produto p where p.descricao like %?1%")
    List<Produto> findByDescricaoInicia(String descricao);

    //Busca de Marca:
    @Query(value = "select p from Produto p where p.marca like ?1")
    List<Produto> findByMarca(String marca);
    @Query(value = "select p from Produto p where p.marca like %?1%")
    List<Produto> findByMarcaInicia(String marca);

    //Busca de Preços:
    @Query(value = "select p from Produto p where p.preco like ?1")
    List<Produto> findByPreco(double preco);

    @Query(value = "select p from Produto p where p.preco  > ?1")
    List<Produto> findByPrecoMaior(double preco);

    @Query(value = "select p from Produto p where p.preco  < ?1")
    List<Produto> findByPrecoMenor(double preco);

    //Buscas Duplas:
    @Query(value = "select p from Produto p where p.descricao like %?1% and like p.marca like %?2%")
    List<Produto> findByDescricaoIniciaEMarcaInicia(String descricao, String Marca);

    @Query(value = "select p from Produto p where p.descricao like %?1% and like p.preco < %?2%")
    List<Produto> findByDescricaoIniciaEPrecoMenor(String descricao, double preco);
}


