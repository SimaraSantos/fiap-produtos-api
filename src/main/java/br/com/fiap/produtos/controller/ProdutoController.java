package br.com.fiap.produtos.controller;


import br.com.fiap.produtos.model.Produto;
import br.com.fiap.produtos.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    // Método responsavel por criar um novo produto no banco de dados
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Produto salvar(@RequestBody Produto produto) {
        return produtoService.salvar(produto);

    }
@GetMapping("/{id}")
@ResponseStatus(HttpStatus.OK)
    public Produto buscarPorId(@PathVariable Long id){
        return  produtoService.buscarPorId(id);
    }


@GetMapping
@ResponseStatus(HttpStatus.OK)
    public List<Produto>buscarTodos(){
    return produtoService.buscarTodos();
}


@DeleteMapping("/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
public void excluir(@PathVariable Long id){
     produtoService.excluir((id));
}

@PutMapping("/{id}")
@ResponseStatus(HttpStatus.OK)
public Produto atualizar(@PathVariable Long id, @RequestBody Produto produto){
    return produtoService.atualizar(id,produto);
}


}



