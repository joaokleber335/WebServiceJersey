package br.edu.unidep.webservice.service;

import java.util.List;

import br.edu.unidep.webservice.model.dao.ProdutoDAO;
import br.edu.unidep.webservice.model.dominio.Produto;

public class ProdutoService {

	private ProdutoDAO dao = new ProdutoDAO();

	public List<Produto> listar() throws Exception {
		return dao.listar();
	}

	public Produto cadastrar(Produto obj) throws Exception {
		Produto produto = dao.cadastrar(obj);
		if (produto != null) {
			return produto;
		}
		return null;
	}

}