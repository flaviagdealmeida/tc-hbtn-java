import provedores.Frete;
import provedores.ProvedorFrete;

public class ProcessadorPedido {

	private ProvedorFrete provedorFrete;

	
	public ProcessadorPedido() {
		
	}

	public ProcessadorPedido(ProvedorFrete provedorFrete) {
		super();
		this.provedorFrete = provedorFrete;
	}
	
	public void processar(Pedido pedido) {
		Frete calculo = provedorFrete.calcularFrete(pedido.getPeso(), pedido.getTotal());
		pedido.setFrete(calculo);
	}
}
