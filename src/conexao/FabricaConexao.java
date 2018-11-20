package conexao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FabricaConexao {

	private static EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("labyrinthian");
	
	public static EntityManagerFactory getFactory() {
		if(!FACTORY.isOpen()) {
			FACTORY = Persistence.createEntityManagerFactory("labyrinthian");
		}
		return FACTORY;
	}
}
