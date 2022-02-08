import java.util.ArrayList;
import java.util.List;

public class Celular {

	private ArrayList<Contato> listaDeContatos = new ArrayList<Contato>();
	private List<Contato> listaDeContatosPesquisados = new ArrayList<Contato>();

	public Celular() {

	}

	public Celular(ArrayList<Contato> listaDeContatos) {
		this.listaDeContatos = listaDeContatos;
	}

	public int buscarPosicaoContato(String nomeContato) {

		return listaDeContatos.indexOf(nomeContato);

	}

	public void adicionarContato(Contato contato) {

		for (Contato contatoAdd : listaDeContatos) {
			if (contatoAdd.getNome().equals(contato.getNome())) {
				throw new IllegalArgumentException(
						"Nao foi possivel adicionar contato. Contato jah existente com esse nome");
			}

		}

		listaDeContatos.add(contato);
	}

	public void removerContato(Contato contato) {

		for (int i = 0; i < listaDeContatos.size(); i++) {

			if (listaDeContatos.get(i).getNome().equals(contato.getNome())) {
				listaDeContatos.remove(i);
			} else {
				throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
			}
		}
	}

	public void atualizarContato(Contato contatoAntigo, Contato novoContato) {

		
		
		for (Contato contato : listaDeContatos) {
			if (contato.getNome().equals(novoContato.getNome()) && ! contato.getNome().equals(contatoAntigo.getNome())){
				throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
			}
			if (!(contatoAntigo.getNome().equals(novoContato.getNome()))) {
			throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
		}
			}

		

		for (int i = 0; i < listaDeContatos.size(); i++) {

			if (listaDeContatos.get(i).getNome().equals(contatoAntigo.getNome())) {
				listaDeContatos.get(i).setNumeroDeTelefone(novoContato.getNumeroDeTelefone());
				listaDeContatos.get(i).setTipo(novoContato.getTipo());
			}

		}

	}

	public List<Contato> buscarContato(String nomeContatoBuscado) {

		for (Contato contato : listaDeContatos) {
			if (contato.getNome().equals(nomeContatoBuscado)) {
				listaDeContatosPesquisados.add(contato);
			}
		}
		return listaDeContatosPesquisados;
	}

	public void listarContatos() {
		for (Contato contato : listaDeContatos) {
			System.out.println(
					contato.getNome() + " -> " + contato.getNumeroDeTelefone() + " (" + contato.getTipo() + ")");
		}
	}
}
