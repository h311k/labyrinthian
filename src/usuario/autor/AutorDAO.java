package usuario.autor;

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
	public Autor find(Autor autor) {
		EntityManager manager = FabricaConexao.getFactory().createEntityManager();
		autor = manager.find(Autor.class, autor.getIdUsuario());
		return autor;
	}

	@Override
	public List<Autor> getList() {
		return null;
	}
	
}
