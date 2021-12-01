package com.example.claudioribeiro.repository;

import com.example.claudioribeiro.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}