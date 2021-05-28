package br.edu.unidep.webservice.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.edu.unidep.webservice.model.dominio.Produto;

public class ProdutoDAO extends AbstractDAO<Produto> {

	@Override
	public Class<Produto> getClasse() {
		return Produto.class;
	}

	@Override
	public List<Produto> listar() {
		EntityManager em = JPAUtil.getEntityManager();
		return em.createQuery("select p from Produto p", Produto.class).getResultList();
	}

}