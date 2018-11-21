package usuario;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/administrausuario")
public class UsuarioResource {

	@GET
	@Path("/autenticausuario")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUsuario(@QueryParam("user") String user, @QueryParam("pass") String pass) {
		UsuarioController uc = new UsuarioController();
		String jsonRetorno = uc.autenticaUsuario(user, pass);
		return Response.status(200).entity(jsonRetorno).build();
	}
}
