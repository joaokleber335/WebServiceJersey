package br.edu.unidep.webservice.service;

import java.util.List;

import br.edu.unidep.webservice.model.dao.VendaDAO;
import br.edu.unidep.webservice.model.dominio.Venda;

public class VendaService {
	
	private VendaDAO dao = new VendaDAO();

	public List<Venda> listar() throws Exception {
		return dao.listar();
	}

	public Venda cadastrar(Venda obj) throws Exception {
		Venda venda = dao.cadastrar(obj);
		if (venda != null) {
			return venda;
		}
		return null;
	}
	
	public Venda cancelar(Venda obj) throws Exception {
		obj.cancelar();
		Venda venda = dao.atualizar(obj);
		if (venda != null) {
			return venda;
		}
		return null;
	}

}
