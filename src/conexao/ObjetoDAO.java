package conexao;

import java.util.List;

public interface ObjetoDAO<T> {

	void addUpdate(T objeto);
	public void delete(T objeto);
	public Object find(T objeto);
	public List<T> getList();
	
}
