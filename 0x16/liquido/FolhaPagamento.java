public class FolhaPagamento{
	
	public static double calularLiquido
	(Funcionario funcionario, CalculadorDeSalario calculadora) {
		return calculadora.calcular(funcionario.getSalario());
	}

}

