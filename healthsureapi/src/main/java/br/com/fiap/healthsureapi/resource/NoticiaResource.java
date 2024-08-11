package br.com.fiap.healthsureapi.resource;

import java.util.List;
import br.com.fiap.healthsureapi.model.Noticia;
import br.com.fiap.healthsureapi.service.NoticiaService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("noticias")
public class NoticiaResource {

	private NoticiaService service = new NoticiaService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Noticia> listAll() {
		return service.findAll();
	}
}
