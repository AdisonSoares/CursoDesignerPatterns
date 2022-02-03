package Aula05.parte01Facade_Fachada;
import java.util.ArrayList;
import java.util.List;
//Pattern atual Singleton.

public class CarrinhoDeCompras {
	//Tipo interface - List
	@SuppressWarnings("unused")
	private List<Produto> produtos;
	
	//Instanciar o objeto concreto que implementa List
	public CarrinhoDeCompras() {
		produtos = new ArrayList<Produto>();
	}
	
}
