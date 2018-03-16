package br.com.gabriel.cadastroproduto.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.gabriel.cadastroproduto.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long>{

}
