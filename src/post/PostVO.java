package post;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PostVO {

	private long idPost;
	private String titulo;
	private String subtitulo;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataPublicacao;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataAtualizacao;
	private String conteudo;
	private String tags;
	public PostVO(long idPost, String titulo, String subtitulo, Date dataPublicacao, Date dataAtualizacao,
			String conteudo, String tags) {
		super();
		this.idPost = idPost;
		this.titulo = titulo;
		this.subtitulo = subtitulo;
		this.dataPublicacao = dataPublicacao;
		this.dataAtualizacao = dataAtualizacao;
		this.conteudo = conteudo;
		this.tags = tags;
	}
	public long getIdPost() {
		return idPost;
	}
	public void setIdPost(long idPost) {
		this.idPost = idPost;
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
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	
	
	
	
}
