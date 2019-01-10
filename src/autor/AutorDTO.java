package autor;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import usuario.UsuarioDTO;

/**
 * @author haony
 * 
 * Entidade de Usuario refletindo a tabela de autores do BD.
 *
 */
@Entity
@Table(name="autores")
public class AutorDTO extends Autor implements Serializable {
	
	@Id
	@OneToOne
	@JoinColumn(name = "idUsuario")
	private UsuarioDTO idUsuario;
	@Column(length = 30)
	private String nome;
	@Column(length = 120)
	private String sobrenome;
	private Date dataNascimento;
	@Column(length = 120)
	private String biografia;
	@Column(length = 240)
	private String urlFotoPerfil;
	
	public UsuarioDTO getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(UsuarioDTO idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getBiografia() {
		return biografia;
	}
	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
	public String getUrlFotoPerfil() {
		return urlFotoPerfil;
	}
	public void setUrlFotoPerfil(String urlFotoPerfil) {
		this.urlFotoPerfil = urlFotoPerfil;
	}
	

}
