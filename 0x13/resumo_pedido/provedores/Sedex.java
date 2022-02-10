package provedores;
public class Sedex implements ProvedorFrete {

	private Frete frete = new Frete();
	private double totalFrete;
	
	public Sedex() {
		
	}
	
	@Override
	public Frete calcularFrete(double peso, double valor) {
		totalFrete = peso > 1000 ? (valor*0.10): (valor*0.05); 
		
		frete.setValor(totalFrete);
		frete.setTipoProvedorFrete(obterTipoProvedorFrete());
		
		return frete;
	}

	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {
		
		return TipoProvedorFrete.SEDEX;
	}
}
