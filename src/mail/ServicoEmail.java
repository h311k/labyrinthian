package mail;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import usuario.UsuarioDTO;

@Entity
@Table(name="servicosEmail")
public class ServicoEmail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idServicoEmail", updatable = false, nullable = false)
	private Long idServicoEmail;
	@ManyToOne
	private UsuarioDTO usuario;
	@Column(length = 64)
	private String nome;
	@Column(length = 64)
	private String host;
	@Column(length = 4)
	private String porta;
	@Column(length = 64)
	private String login;
	@Column(length = 64)
	private String senha;
	public Long getIdServicoEmail() {
		return idServicoEmail;
	}
	public void setIdServicoEmail(Long idServicoEmail) {
		this.idServicoEmail = idServicoEmail;
	}
	public UsuarioDTO getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPorta() {
		return porta;
	}
	public void setPorta(String porta) {
		this.porta = porta;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
