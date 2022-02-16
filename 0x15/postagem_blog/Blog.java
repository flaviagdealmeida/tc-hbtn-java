import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Blog {

	private List<Post> posts;

	public Blog() {
		super();
		posts = new ArrayList<>();
	}

	public Set<Autor> obterTodosAutores() {
		Set<Autor> autores = new TreeSet<>();

		posts.forEach(post -> {
			Autor autorTemp = post.getAutor();
			autores.add(autorTemp);
		});

		return autores;
	}

	public Map<Categorias, Integer> obterContagemPorCategoria() {
		Map<Categorias, Integer> mapaCategorias = new TreeMap<Categorias, Integer>();

		int total = 0;

		for (int i = 0; i < posts.size(); i++) {
			for (int j = 0; j < posts.size(); j++) {
				if (posts.get(i).getCategoria().equals(posts.get(j).getCategoria())) {
					total++;
				}
			}
			mapaCategorias.put(posts.get(i).getCategoria(), total);
			total = 0;
		}
		return mapaCategorias;
	}

	public void adicionarPostagem(Post postagem) {

		for (Post post : posts) {
			if (post.getAutor().equals(postagem.getAutor()) && post.getTitulo().contains(postagem.getTitulo())) {
				throw new IllegalArgumentException("Postagem jah existente");
			}
		}
		posts.add(postagem);
	}

	public Set<Post> obterPostsPorAutor(Autor autor) {
		Set<Post> postAutor = new TreeSet<>();
		posts.sort(Comparator.comparing(Post::getTitulo));

		posts.forEach(post -> {
			if (post.getAutor().equals(autor)) {
				postAutor.add(post);
			}
		});

		return postAutor;
	}

	public Set<Post> obterPostsPorCategoria(Categorias categoria) {
		Set<Post> categoriasPost = new TreeSet<>();
		posts.sort(Comparator.comparing(Post::getTitulo));

		posts.forEach(post -> {
			if (post.getCategoria().equals(categoria)) {
				categoriasPost.add(post);
			}
		});

		return categoriasPost;
	}

	public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
		Map<Categorias, Set<Post>> mapaCategorias = new TreeMap<Categorias, Set<Post>>();
		Set<Post> postagens = new TreeSet<Post>();

		for (int i = 0; i < posts.size(); i++) {
			for (int j = 0; j < posts.size(); j++) {
				if (posts.get(i).getCategoria().equals(posts.get(j).getCategoria())) {
					postagens.add(posts.get(i));
				}
			}
			mapaCategorias.put(posts.get(i).getCategoria(), postagens);
		}

		return mapaCategorias;
	}

	public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
		Map<Autor, Set<Post>> mapaAutores = new TreeMap<Autor, Set<Post>>();
		Set<Post> postagens = new TreeSet<Post>();

		for (int i = 0; i < posts.size(); i++) {
			for (int j = 0; j < posts.size(); j++) {
				if (posts.get(i).getAutor().equals(posts.get(j).getAutor())) {
					postagens.add(posts.get(i));
				}
			}
			mapaAutores.put(posts.get(i).getAutor(), postagens);
		}

		return mapaAutores;
	}

}
