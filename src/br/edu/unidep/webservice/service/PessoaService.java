package br.edu.unidep.webservice.service;

import java.util.List;

import br.edu.unidep.webservice.model.dao.PessoaDAO;
import br.edu.unidep.webservice.model.dominio.Pessoa;

public class PessoaService {

	private PessoaDAO dao = new PessoaDAO();

	public List<Pessoa> listar() throws Exception {
		return dao.listar();
	}

	public Pessoa cadastrar(Pessoa obj) throws Exception {
		Pessoa produto = dao.cadastrar(obj);
		if (produto != null) {
			return produto;
		}
		return null;
	}
	
	public Pessoa atualizar(Pessoa obj) throws Exception {
		Pessoa produto = dao.atualizar(obj);
		if (produto != null) {
			return produto;
		}
		return null;
	}
	
	public Integer remover(Integer id) throws Exception {
		dao.remover(id);
		return id;
	}

}