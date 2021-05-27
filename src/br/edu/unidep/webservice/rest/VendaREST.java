package br.edu.unidep.webservice.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.edu.unidep.webservice.model.dominio.Venda;
import br.edu.unidep.webservice.service.VendaService;

@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Path("/vendas")
public class VendaREST {
	
	private VendaService service = new VendaService();
	
	@GET
	public List<Venda> listar() throws Exception {
		return service.listar();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(Venda obj) {
		try {
			System.out.println(obj.toString());
			obj = service.cadastrar(obj);
			return Response.ok(obj).build();
		} catch (Exception e) {
			return Response.serverError().entity(e.getLocalizedMessage()).build();
		} 
	}
	
	@PUT 
	@Path("/cancelar")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizar(Venda obj) {
		try {
			obj = service.cancelar(obj);
			return Response.ok(obj).build();
		} catch (Exception e) {
			return Response.serverError().entity(e.getLocalizedMessage()).build();
		}
	}
	
}
