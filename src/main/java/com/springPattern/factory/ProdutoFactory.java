package com.springPattern.factory;

import com.springPattern.model.Produto;

public interface ProdutoFactory {

    Produto criarProduto(String nome, double preço);
}
