package Aula05.parte03Facade_Fachada;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Produto> produtos;

	public CarrinhoDeCompras() {
		produtos = new ArrayList<Produto>();
	}

	public void addProduto(Produto produto) {
		this.produtos.add(produto);
	}

	public double getTotal() {
		double total = 0;
		for (Produto produto : produtos) {
			total += produto.getPreco();
		}
		return total;
	}
	
	@Override
	public String toString() {
		String resultado = "";
		for (Produto produto : produtos) {
			resultado += produto.toString();
		}
		return resultado;
	}
}
