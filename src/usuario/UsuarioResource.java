package usuario;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/administrausuario")
public class UsuarioResource {
	
	@POST
	@Path("/autenticausuario")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUsuario(UsuarioDTO usuario) {
		UsuarioController uc = new UsuarioController();
		String jsonRetorno = uc.autenticaUsuario(usuario.getIdUsuario(), usuario.getSenha());
		return Response.status(200).entity(jsonRetorno).build();
	}
}
