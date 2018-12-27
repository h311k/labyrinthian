package usuario;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UsuarioController {

	public String autenticaUsuario(String idUsuario, String pass) {
		String jsonRetorno = "";
		ObjectMapper mapper = new ObjectMapper();
		UsuarioDAO ud = new UsuarioDAO();
		try {
			jsonRetorno = mapper.writeValueAsString(ud.validaLogin(idUsuario, pass));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return jsonRetorno;
	}
}
