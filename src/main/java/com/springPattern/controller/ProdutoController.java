package com.springPattern.controller;

import com.springPattern.model.Produto;
import com.springPattern.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listarProdutos() {

        return produtoService.listarProdutos();
    }

    @PostMapping
    public Produto criarProduto(@RequestParam String nome, @RequestParam double preco) {

        return produtoService.criarProduto(nome, preco);
    }

    @PutMapping("/{id}")
    public Produto atulizarProduto(@PathVariable Long id, @RequestBody Produto produtoAtualizado) {

        return produtoService.atualizarProduto(id, produtoAtualizado);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id) {

        produtoService.deletarProduto(id);
    }
}
