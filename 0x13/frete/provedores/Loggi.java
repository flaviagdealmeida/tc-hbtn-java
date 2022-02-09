package provedores;
import frete.Frete;
public class Loggi implements ProvedorFrete {
	
	private Frete frete = new Frete();
	private double totalFrete;

	public Loggi() {
		
	}

	@Override
	public Frete calcularFrete(double peso, double valor) {
		totalFrete = peso > 5000 ? (valor * 0.15) : (valor * 0.4);
		frete.setValor(totalFrete);
		frete.setTipoProvedorFrete(obterTipoProvedorFrete());
		return frete;
		
	}

	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {

		return TipoProvedorFrete.LOGGI;
	}

}
