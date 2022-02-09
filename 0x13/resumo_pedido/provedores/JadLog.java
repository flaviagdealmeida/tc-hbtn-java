package provedores;
import resumo_pedido.Frete;

public class JadLog implements ProvedorFrete {

	private Frete frete = new Frete();
	private double totalFrete;
	
	public JadLog() {
		
	}
	
	@Override
	public Frete calcularFrete(double peso, double valor) {
		totalFrete = peso > 2000 ? (valor*0.07): (valor*0.045);
		
		frete.setValor(totalFrete);
		frete.setTipoProvedorFrete(obterTipoProvedorFrete());
		return frete;
		
	}

	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {
		return TipoProvedorFrete.JADLOG;
	}

}
