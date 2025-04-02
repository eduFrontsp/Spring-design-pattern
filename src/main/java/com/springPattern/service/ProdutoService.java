package com.springPattern.service;

import com.springPattern.factory.ProdutoFactory;
import com.springPattern.model.Produto;
import com.springPattern.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ProdutoFactory produtoFactory;

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Produto criarProduto(String nome, double preco) {

        Produto produto = produtoFactory.criarProduto(nome, preco);
        return produtoRepository.save(produto);
    }

    public Produto atualizarProduto(Long id, Produto produtoAtualizado) {

        Produto produto = produtoRepository.findById(id)
                .orElse(null);
        if(produto != null) {
            produtoAtualizado.setId(id);

            return produtoRepository.save(produtoAtualizado);
        }
        return null;
    }

    public void deletarProduto(Long id) {

        produtoRepository.deleteById(id);
    }
}
