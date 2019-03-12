package post;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import usuario.UsuarioDTO;

/**
 * @author haony
 *
 * Entidade de Post refletindo a tabela de usuarios do BD.
 *
 */
@Entity
@Table(name="posts")
public class PostDTO extends Post {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idPost;
	
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private UsuarioDTO usuario;
	
	@Column(length = 64, nullable = false)
	private String titulo;
	
	@Column(length = 120)
	private String subtitulo;
	
	private Date dataPublicacao;
	
	private Date dataAtualizacao;
	
	@Column(columnDefinition = "TEXT")
	private String conteudo;
	
	@ElementCollection
	@CollectionTable(name="tags")
	@Column(length = 32)
	private Set<String> tags = new HashSet<>();
	
	private boolean arquivado;
	
	private Date dataArquivamento;

	public long getIdPost() {
		return idPost;
	}

	public void setIdPost(long idPost) {
		this.idPost = idPost;
	}

	public UsuarioDTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSubtitulo() {
		return subtitulo;
	}

	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}


	public Set<String> getTags() {
		return tags;
	}

	public void setTags(Set<String> tags) {
		this.tags = tags;
	}

	public boolean isArquivado() {
		return arquivado;
	}

	public void setArquivado(boolean arquivado) {
		this.arquivado = arquivado;
	}

	public Date getDataArquivamento() {
		return dataArquivamento;
	}

	public void setDataArquivamento(Date dataArquivamento) {
		this.dataArquivamento = dataArquivamento;
	}
	
}
