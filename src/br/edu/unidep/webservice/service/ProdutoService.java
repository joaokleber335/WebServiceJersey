package br.edu.unidep.webservice.service;

import java.util.List;

import br.edu.unidep.webservice.model.dao.ProdutoDAO;
import br.edu.unidep.webservice.model.dominio.Produto;

public class ProdutoService {

	private ProdutoDAO dao = new ProdutoDAO();
	
	public List<Produto> listar() {
		return dao.listar();
	}	
	
}