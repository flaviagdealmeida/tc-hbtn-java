package provedores;
import frete.Frete;
public interface ProvedorFrete {

	public Frete calcularFrete(double peso, double valor);
	public TipoProvedorFrete obterTipoProvedorFrete();
}
