package com.springPattern.factory;

import com.springPattern.model.Produto;
import org.springframework.stereotype.Component;

@Component
public class ProdutoFactoryImpl implements ProdutoFactory {


    @Override
    public Produto criarProduto(String nome, double preço) {

        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setPreco(preço);

        return produto;
    }
}
