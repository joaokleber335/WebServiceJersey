package br.edu.unidep.webservice.model.dao;

import java.util.List;

import br.edu.unidep.webservice.model.dominio.Pessoa;

public class PessoaDAO extends AbstractDAO<Pessoa> {

	@Override
	public Class<Pessoa> getClasse() {
		return Pessoa.class;
	}

	@Override
	public List<Pessoa> listar() {
		return em.createQuery("select p from pessoa p", Pessoa.class).getResultList();
	}

}