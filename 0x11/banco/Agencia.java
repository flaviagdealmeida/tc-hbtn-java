import java.util.ArrayList;

public class Agencia {

	private String nome;
	private ArrayList<Cliente> clientes;
	

	public Agencia() {

	}

	public Agencia(String nome) {
		super();
		this.nome = nome;
		this.clientes = new ArrayList<>();

	}

	public boolean novoCliente(String nome, double transacao) {

		if (buscarCliente(nome) != null) {
			return false;
		}
		Cliente novoCliente = new Cliente(nome, transacao);
		clientes.add(novoCliente);
		return true;
	}

	public boolean adicionarTransacaoCliente(String cliente, double transacao) {
		Cliente clienteLocalizado = buscarCliente(cliente);
		if (clienteLocalizado == null) {
			return false;
		}
		
		clienteLocalizado.adicionarTransacao(transacao);
		return true;
		
	}

	 public Cliente buscarCliente(String nomeCliente){
	        for (int i =0; i < this.clientes.size();i++){
	            if (this.clientes.get(i).getNome().equals(nomeCliente)){
	                return clientes.get(i);
	            }
	        }
	        return null;
	    }

	public String getNome() {
		return nome;
	}
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

}
