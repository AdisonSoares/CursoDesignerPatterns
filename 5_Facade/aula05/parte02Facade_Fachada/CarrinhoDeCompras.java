package aula05.parte02Facade_Fachada;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	// Tipo interface - List
	private List<Produto> produtos;

	// Instanciar o objeto concreto que implementa List
	public CarrinhoDeCompras() {
		produtos = new ArrayList<Produto>();
	}

	// M�todo Set
	public void addProdutos(Produto produto) {
		this.produtos.add(produto);
	}

	// M�todo de calculo total
	public double getTotal() {
		double total = 0;
		for (Produto produto : produtos) {
			total += produto.getPreco();
		}
		return total;
	}
	
	//Exibi��o - M�todo toString para List
	@Override
	public String toString() {
		String resultado = "";
		for(Produto produto:produtos) {
			resultado+=produto.toString();
		}
		return resultado;
	}
}
