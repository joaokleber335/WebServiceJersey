package br.edu.unidep.webservice.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

public abstract class AbstractDAO<T> {

	public static EntityManager em = JPAUtil.getEntityManager();

	public abstract Class<T> getClasse();

	public T cadastrar(T obj) throws Exception {
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
		em.close();
		return obj;
	}

	public T atualizar(T obj) throws Exception {
		em.getTransaction().begin();
		obj = em.merge(obj);
		em.getTransaction().commit();
		em.close();
		return obj;
	}

	public void remover(Integer id) throws Exception {
		em.getTransaction().begin();
		T old = em.find(getClasse(), id);
		em.remove(old);
		em.getTransaction().commit();
		em.close();
	}

	public T buscarPorId(Integer id) throws Exception {
		return em.find(getClasse(), id);
	}

	public abstract List<T> listar() throws Exception;
}
