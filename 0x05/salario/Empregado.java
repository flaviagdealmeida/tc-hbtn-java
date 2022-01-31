public class Empregado {
	private double salarioFixo;
	private double bonus;
	
	public Empregado(double salarioFixo) {
		super();
		this.salarioFixo = salarioFixo;
	}
	
	public double calcularBonus(Departamento departamento) {
		if (departamento.alcancouMeta()) {
			bonus = salarioFixo * 0.1;
		}else {
			bonus = 0;
		}
		return bonus;
	}
	
	public double calcularSalarioTotal(Departamento departamento) {
		return salarioFixo + bonus;
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}
}
