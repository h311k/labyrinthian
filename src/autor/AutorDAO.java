package autor;

import java.util.List;

import javax.persistence.EntityManager;

import conexao.FabricaConexao;
import conexao.ObjetoDAO;

public class AutorDAO implements ObjetoDAO<Autor> {

	@Override
	public void addUpdate(Autor autor) {
		EntityManager manager = FabricaConexao.getFactory().createEntityManager();
		manager.getTransaction().begin();
		manager.merge(autor);
		manager.getTransaction().commit();
		manager.close();
	}

	@Override
	public void delete(Autor autor) {
		EntityManager manager = FabricaConexao.getFactory().createEntityManager();
		manager.getTransaction().begin();
		manager.remove(autor);
		manager.getTransaction().commit();
		manager.close();
	}

	@Override
	public AutorVO find(Autor autor) {
		EntityManager manager = FabricaConexao.getFactory().createEntityManager();
		autor = manager.find(Autor.class, autor.getIdUsuario());
		AutorVO autorVo = new AutorVO(autor.getIdUsuario().getIdUsuario(), autor.getNome(), autor.getSobrenome(), autor.getDataNascimento(), autor.getBiografia(), autor.getUrlFotoPerfil());
		return autorVo;
	}

	@Override
	public List<Autor> getList() {
		return null;
	}
	
}
