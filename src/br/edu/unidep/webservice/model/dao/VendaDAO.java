package br.edu.unidep.webservice.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.edu.unidep.webservice.model.dominio.Venda;

public class VendaDAO extends AbstractDAO<Venda> {

	@Override
	public Class<Venda> getClasse() {
		return Venda.class;
	}

	@Override
	public List<Venda> listar() {
		EntityManager em = JPAUtil.getEntityManager();
		return em.createQuery("select v from Venda v", Venda.class).getResultList();
	}
	
	public void cancelar(Long id) throws Exception {
		Venda venda = buscarPorId(id);
		venda.cancelar();
		atualizar(venda);
		return;
	}

}
