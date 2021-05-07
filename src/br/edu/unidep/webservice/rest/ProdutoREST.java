package br.edu.unidep.webservice.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.unidep.webservice.model.dominio.Produto;
import br.edu.unidep.webservice.service.ProdutoService;

@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Path("/produtos")
public class ProdutoREST {

	private ProdutoService service = new ProdutoService();

	@GET
	@Path("/olaMundo")
	public String olaMundo() {
		return "Olá Mundo!";
	}
	
	@GET
	public List<Produto> listar() {
		return service.listar();
	}
	
	
	/*
	  POST   - Inserir
	  PUT    - Atualizar
	  DELETE - Deletar
	  GET    - Buscar
	  
	  
	  1. Implementar os métodos acima para Produtos e Pessoas.
	  
	  Produto
	  	- Código
	  	- Nome
	  	- Unidade Medida
	  	- NCM
	  	- Valor Compra
	  	- Valor Venda
	  
	  Pessoa
	  	- Código
	  	- Nome
	  	- Data Nascimento
	  	- Sexo
	  
	  
	  Observação: Realizar o deploy do projeto no tomcat instalado em seu computador, e realizar
	  testes das rotas no Postman.
	  
	  	
	 */

}
