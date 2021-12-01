package com.example.claudioribeiro.service;

import com.example.claudioribeiro.model.Produto;

import java.util.List;

public interface ProdutoService {
    public List<Produto> findAll();
    public Produto findById(Long id);

}
