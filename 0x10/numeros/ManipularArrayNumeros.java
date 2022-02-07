import java.util.List;

public class ManipularArrayNumeros {

	public static int buscarPosicaoNumero(List<Integer> listaDeNumeros, int numeroBuscado) {

		return listaDeNumeros.indexOf(numeroBuscado);

	}

	public static void adicionarNumero(List<Integer> listaDeNumeros, int numeroAdicionado) {

		int retorno = buscarPosicaoNumero(listaDeNumeros, numeroAdicionado);

		if (retorno > 0) {
			throw new IllegalArgumentException("Numero jah contido na lista");
		}

		listaDeNumeros.add(numeroAdicionado);
	}

	public static void removerNumero(List<Integer> listaDeNumeros, int numeroRemovido) {

		int retorno = buscarPosicaoNumero(listaDeNumeros, numeroRemovido);

		if (retorno < 0) {
			throw new IllegalArgumentException("Numero nao encontrado na lista");
		}

		listaDeNumeros.remove(retorno);
	}


	public static void substituirNumero(List<Integer> listaDeNumeros, int numeroSubstituir, int numeroSubstituto) {
		int retorno = buscarPosicaoNumero(listaDeNumeros, numeroSubstituir);

		if (retorno < 0) {
			listaDeNumeros.add(numeroSubstituto);
		} else {
			listaDeNumeros.set(retorno,numeroSubstituto);
		}
	}
}
