package br.com.fiap.healthsureapi.resource;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.healthsureapi.model.Usuario;
import br.com.fiap.healthsureapi.service.UsuarioService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("usuarios")
public class UsuarioResource {

	private UsuarioService service = new UsuarioService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> listAll() {
		return service.findAll();
	}

	@GET
	@Path("{id_usuario}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findById(@PathParam("id_usuario") Long idUsuario) throws SQLException {
		var usuario = service.findById(idUsuario);
		if (usuario == null) {
			return Response.status(404).build();
		}

		return Response.ok(usuario).build();

	}

	@Path("cadastro")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response insert(Usuario usuario) {
		if (service.cadastrar(usuario)) {
			return Response.ok(usuario).build();
		} else {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
	}
	
	@Path("login")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response login(Usuario usuario) {
	    var usuarioLogado = service.login(usuario.getNmEmail(), usuario.getNmSenha());

	    if (usuarioLogado != null) {
	        return Response.ok(usuarioLogado).build();
	    } else {
	        return Response.status(Response.Status.UNAUTHORIZED).build();
	    }
	}

	@PUT
	@Path("{id_usuario}")
	public Response update(@PathParam("id_usuario") Long idUsuario, Usuario usuario) {
		var usuarioEncontrado = service.findById(idUsuario);

		if (usuarioEncontrado == null) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}

		usuario.setIdUsuario(idUsuario);
		if (!service.atualizar(usuario))
			return Response.status(Response.Status.BAD_REQUEST).build();

		return Response.ok(usuario).build();

	}

	@DELETE
	@Path("{id_usuario}")
	public Response delete(@PathParam("id_usuario") Long idUsuario) {
		var usuario = service.findById(idUsuario);

		if (usuario == null) {
			return Response.status(404).build();
		}

		service.delete(idUsuario);
		return Response.status(Response.Status.NO_CONTENT).build();
	}
}
