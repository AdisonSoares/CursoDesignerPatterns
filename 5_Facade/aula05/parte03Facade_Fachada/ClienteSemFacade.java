package aula05.parte03Facade_Fachada;

public class ClienteSemFacade {
	public static void main(String[] args) {

		BancoDeDados bancoDeDados = new BancoDeDados();

		Cliente paiva = new Cliente(01, "Paiva");
		
		bancoDeDados.addCliente(paiva);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		paiva.setCarrinhoDeCompras(carrinho);
		
	
		Produto notebook = bancoDeDados.selecionarProduto(2);
		Produto mouse = bancoDeDados.selecionarProduto(3);

		paiva.getCarrinhoDeCompras().addProduto(notebook);
		paiva.getCarrinhoDeCompras().addProduto(mouse);
	
		
		double total = paiva.getCarrinhoDeCompras().getTotal();
		bancoDeDados.processoDePagamento(paiva, total);
	}
}
