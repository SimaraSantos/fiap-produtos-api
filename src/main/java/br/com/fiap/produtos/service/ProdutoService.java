package br.com.fiap.produtos.service;


import br.com.fiap.produtos.model.Produto;
import br.com.fiap.produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto buscarPorId(Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);

        if (produto.isPresent()) {
            return produto.get();
        } else {
            throw new RuntimeException("Produto não encontrado");
        }
    }

    public List<Produto> buscarTodos() {
        return produtoRepository.findAll();
    }

    public void excluir(Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        if (produto.isPresent()) {
            produtoRepository.deleteById(id);
        } else {
            throw new RuntimeException("Produto não encontrado!");
        }
    }

    public Produto atualizar(Long id, Produto produto) {
        Optional<Produto> produtoAtual = produtoRepository.findById(id);
        if (produtoAtual.isPresent()) {
            return produtoRepository.save(produto);
        } else {
            throw new RuntimeException("Produto não encontrado!");
        }
    }
}




