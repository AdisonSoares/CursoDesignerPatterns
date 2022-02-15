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

	// Método Set
	public void addProdutos(Produto produto) {
		this.produtos.add(produto);
	}

	// Método de calculo total
	public double getTotal() {
		double total = 0;
		for (Produto produto : produtos) {
			total += produto.getPreco();
		}
		return total;
	}
	
	//Exibição - Método toString para List
	@Override
	public String toString() {
		String resultado = "";
		for(Produto produto:produtos) {
			resultado+=produto.toString();
		}
		return resultado;
	}
}
