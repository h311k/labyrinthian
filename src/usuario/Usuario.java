package usuario;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author haony
 * 
 * Entidade de Usuario refletindo a tabela de usuarios do BD.
 *
 */
@Entity
@Table(name="usuarios")
public class Usuario {
	
	@Id
	@Column(name = "idUsuario", length = 64, updatable = false, nullable = false)
	private String idUsuario;
	private boolean ativo;
	private Date dataInscricao;
	@Column(length = 64)
	private String senha;
	
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getIdUsuario() {
		return idUsuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public Date getDataInscricao() {
		return dataInscricao;
	}
	public void setDataInscricao(Date dataInscricao) {
		this.dataInscricao = dataInscricao;
	}
	
	
}
