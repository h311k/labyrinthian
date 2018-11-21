package usuario;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UsuarioController {

	public String autenticaUsuario(String user, String pass) {
		String jsonRetorno = "";
		ObjectMapper mapper = new ObjectMapper();
		UsuarioDAO ud = new UsuarioDAO();
		try {
			jsonRetorno = mapper.writeValueAsString(ud.validaLogin(user, pass));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return jsonRetorno;
	}
}
