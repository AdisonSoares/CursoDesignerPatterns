package aula05.parte02Facade_Fachada_;

public class Cliente {
	private int id;
	private String nome;	
	private CarrinhoDeCompras carrinho;
	
	//M�todo construtor
	public Cliente(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	//M�todos Get e Set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public CarrinhoDeCompras getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(CarrinhoDeCompras carrinho) {
		this.carrinho = carrinho;
	}
	
	//Exibi��o - M�todo toString	
	@Override
	public String toString() {
		return "Identificador cliente: "+this.id+"\n"+
				"Nome do cliente: "+this.nome+"\n";
	}
}
