package autor;

import java.util.List;

import javax.persistence.EntityManager;

import conexao.FabricaConexao;
import conexao.ObjetoDAO;

public class AutorDAO implements ObjetoDAO<AutorDTO> {

	@Override
	public void addUpdate(AutorDTO autor) {
		EntityManager manager = FabricaConexao.getFactory().createEntityManager();
		manager.getTransaction().begin();
		manager.merge(autor);
		manager.getTransaction().commit();
		manager.close();
	}

	@Override
	public void delete(AutorDTO autor) {
		EntityManager manager = FabricaConexao.getFactory().createEntityManager();
		manager.getTransaction().begin();
		manager.remove(autor);
		manager.getTransaction().commit();
		manager.close();
	}

	@Override
	public AutorVO find(AutorDTO autor) {
		EntityManager manager = FabricaConexao.getFactory().createEntityManager();
		autor = manager.find(AutorDTO.class, autor.getIdUsuario());
		AutorVO autorVo = new AutorVO(autor.getIdUsuario().getIdUsuario(), autor.getNome(), autor.getSobrenome(), autor.getDataNascimento(), autor.getBiografia(), autor.getUrlFotoPerfil());
		return autorVo;
	}

	@Override
	public List<AutorDTO> getList() {
		return null;
	}
	
}
