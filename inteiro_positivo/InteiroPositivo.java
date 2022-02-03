public class InteiroPositivo {

	private int valor, cont = 0, teste;

	public InteiroPositivo(int valor) {

		this.valor = valor;
	}

	public InteiroPositivo(String valor) {

		teste = Integer.valueOf(valor);
		setValor(teste);
	}

	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {

		if (valor > 0) {
			this.valor = valor;
		} else {
			throw new RuntimeException("Valor nao eh um valor inteiro positivo");
		}

	}

	public boolean ehPrimo() {
		
			for(int i=1; i <= valor; i++) {
				if (valor % i == 0) {
					cont++;
				}
			}
				
				if (cont == 2 || valor == 1) {
					return true;
				}
				
		
		return false;
	}

}
