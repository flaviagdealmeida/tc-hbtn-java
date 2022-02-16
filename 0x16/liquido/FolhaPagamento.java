public class FolhaPagamento{
	
	public static double calcularLiquido
	(Funcionario f, CalculadorDeSalario calculadora) {
		return calculadora.calcular(f.getSalario());
	}

}

