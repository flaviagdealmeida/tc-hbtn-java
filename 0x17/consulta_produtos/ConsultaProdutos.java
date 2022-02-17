import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {
	
	public static List<Produto> filtrar (List<Produto> produtos, CriterioFiltro filtro){
		 List<Produto> produtoFiltrado = new ArrayList<>();
		
		 produtos.forEach(produto -> {
			 if(filtro.testar(produto)) {
				 produtoFiltrado.add(produto);
			 }
		 });
		 
		return produtoFiltrado;
	}
}

