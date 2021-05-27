package br.edu.unidep.webservice.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.edu.unidep.webservice.model.dominio.Pessoa;
import br.edu.unidep.webservice.service.PessoaService;

@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Path("/pessoas")
public class PessoaREST {

	private PessoaService service = new PessoaService();

	@GET
	public List<Pessoa> listar() throws Exception {
		return service.listar();
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(Pessoa obj) {
		try {
			System.out.println(obj.toString());
			obj = service.cadastrar(obj);
			return Response.ok(obj).build();
		} catch (Exception e) {
			return Response.serverError().entity(e.getLocalizedMessage()).build();
		} 
	}
	
	@PUT 
	@Produces(MediaType.APPLICATION_JSON) 
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizar(Pessoa obj) {
		try {
			obj = service.atualizar(obj);
			return Response.ok(obj).build();
		} catch (Exception e) {
			return Response.serverError().entity(e.getLocalizedMessage()).build();
		}
	}
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response remover(@PathParam("id") Integer id) {
		try {
			System.out.println(id);
			id = service.remover(id);
			return Response.ok(id).build();
		} catch (Exception e) { 
			return Response.serverError().entity(e.getLocalizedMessage()).build();
		}
	}

}
