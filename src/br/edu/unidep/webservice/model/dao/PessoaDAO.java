package br.edu.unidep.webservice.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.edu.unidep.webservice.model.dominio.Pessoa;

public class PessoaDAO extends AbstractDAO<Pessoa> {

	@Override
	public Class<Pessoa> getClasse() {
		return Pessoa.class;
	}

	@Override
	public List<Pessoa> listar() {
		EntityManager em = JPAUtil.getEntityManager();
		return em.createQuery("select p from Pessoa p", Pessoa.class).getResultList();
	}

}