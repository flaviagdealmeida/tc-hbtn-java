package provedores;
import resumo_pedido.Frete;
public interface ProvedorFrete {

	public Frete calcularFrete(double peso, double valor);
	public TipoProvedorFrete obterTipoProvedorFrete();
}
