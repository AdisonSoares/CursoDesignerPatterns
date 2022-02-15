package aula05.parte03Facade_Fachada;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
	private List<Cliente> clientes;
	private List<Produto> produtos;
	
	public BancoDeDados() {
		clientes = new ArrayList<Cliente>();
		produtos = new ArrayList<Produto>();
		produtos.add(new Produto(2,"Notebook", 1200.50));
		produtos.add(new Produto(3,"Mouse", 14.50));
	}
	
	public Cliente selecionarCliente(int id) {
		for (Cliente cliente : clientes) {
			if(cliente.getId() == id) {
				return cliente;
			}
		}
		return null;
	}
	
	public Produto selecionarProduto(int id) {
		for (Produto produto : produtos) {
			if(produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}
	
	public void processoDePagamento(Cliente cliente, double total) {
		System.out.println("Processando o pagamento do cliente \n"+cliente);
		System.out.println("Pagamento aceito no Total de R$ "+total);
	}
	
	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}
	
}
