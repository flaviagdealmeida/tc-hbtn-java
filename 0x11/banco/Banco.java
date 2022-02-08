import java.util.ArrayList;

public class Banco {

	private String nome;
	private ArrayList<Agencia> agencias;
	private Agencia agenciaBuscada;

	public Banco() {

	}

	public Banco(String nome) {

		this.nome = nome;
		this.agencias = new ArrayList<Agencia>();
	}

	public Agencia buscarAgencia(String nomeAgencia) {

		for (int i = 0; i < this.agencias.size(); i++) {
			if (this.agencias.get(i).getNome().equals(nome)) {
				return agencias.get(i);
			}
		}

		return null;
	}

	public boolean adicionarAgencia(String agencia) {
		Agencia agenciaLocalizada = buscarAgencia(agencia);
		if (agenciaLocalizada != null) {
			return false;

		}

		Agencia novaAgencia = new Agencia(agencia);
		agencias.add(novaAgencia);
		return true;
	}

	public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorTansacaoInicial) {
		Agencia agencia = buscarAgencia(nomeAgencia);
		if (agencia == null) {
			return false;
		}

		agencia.novoCliente(nomeCliente, valorTansacaoInicial);
		agencia.adicionarTransacaoCliente(nomeCliente, valorTansacaoInicial);
	
		return true;
	}

	public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTansacaoInicial) {
		Agencia agencia = buscarAgencia(nomeAgencia);
		if (agencia == null) {
			return false;
		}

		agencia.adicionarTransacaoCliente(nomeCliente, valorTansacaoInicial);
		return true;

	}

	public boolean listarClientes(String nomeAgencia, boolean imprimirTransacoes) {
		Agencia agenciaEncontrada = buscarAgencia(nomeAgencia);

		if (agenciaEncontrada == null) {
			return false;
		}

		for (int i = 0; i < agenciaEncontrada.getClientes().size(); i++) {
			Cliente clienteEncontrado = agenciaEncontrada.getClientes().get(i);
			System.out.println("Cliente: " + clienteEncontrado.getNome() + " [" + (i + 1) + "]");

			if (imprimirTransacoes) {
				for (int j = 0; j < clienteEncontrado.getTransacoes().size(); j++) {
					System.out.println("  [" + (j + 1) + "] valor " + clienteEncontrado.getTransacoes().get(j));
				}
			}

		}

		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Agencia> getAgencias() {
		return agencias;
	}

	public void setAgencias(ArrayList<Agencia> agencias) {
		this.agencias = agencias;
	}

	public Agencia getAgenciaBuscada() {
		return agenciaBuscada;
	}

	public void setAgenciaBuscada(Agencia agenciaBuscada) {
		this.agenciaBuscada = agenciaBuscada;
	}

}

