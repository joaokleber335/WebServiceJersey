package br.edu.unidep.webservice.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.edu.unidep.webservice.model.dominio.Produto;

public class ProdutoDAO {

	public static EntityManager em = JPAUtil.getEntityManager();
	
	public List<Produto> listar() {	
		return em.createQuery("select p from Produto p", Produto.class).getResultList();
	}
	
}