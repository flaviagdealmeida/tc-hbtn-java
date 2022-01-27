public class PersonagemGame{

	private int saudeAtual;
	private String nome;

	public void tomarDano(int quantidadeDeDano) {
		if (this.saudeAtual >= 0) {
			this.saudeAtual -= quantidadeDeDano;
		}

	}

	public void quantidadeDeCura(int receberCura) {
		if (this.saudeAtual <= 100) {
			this.saudeAtual += receberCura;
		}

	public int getSaudeAtual() {
		return saudeAtual;
	}

	public void setSaudeAtual(int saudeAtual) {
		this.saudeAtual = saudeAtual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
