package com.example.claudioribeiro.service;

import com.example.claudioribeiro.model.Produto;
import com.example.claudioribeiro.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {
    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public List<Produto> findAll() {
        return produtoRepository.findAll(Sort.by("nome"));
    }

    @Override
    public Produto findById(Long id) {
        return produtoRepository.findById(id).get();
    }
}
