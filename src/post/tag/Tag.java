package post.tag;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import post.Post;

@Entity
@Table(name="tags")
public class Tag implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idTag;
	
	@Column(length = 32)
	private String nome;
	
	@ManyToMany
	@JoinTable(name = "posts_tags", joinColumns = @JoinColumn(name = "idTag"), inverseJoinColumns = @JoinColumn(name = "idPost"))
	private Set<Post> posts = new HashSet<>();
}
