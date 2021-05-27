package br.edu.unidep.webservice.model.dao;

import java.util.List;

import br.edu.unidep.webservice.model.dominio.Venda;

public class VendaDAO extends AbstractDAO<Venda> {

	@Override
	public Class<Venda> getClasse() {
		return Venda.class;
	}

	@Override
	public List<Venda> listar() {
		return em.createQuery("select v from Venda v", Venda.class).getResultList();
	}

}
