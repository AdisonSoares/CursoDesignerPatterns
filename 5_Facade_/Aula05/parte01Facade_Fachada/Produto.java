package Aula05.parte01Facade_Fachada;

public class Produto {
	private int id;
	private String nome;
	private double preco;
		
	//Construtor
	public Produto(int id, String nome, double preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	
	//Método Get e Set
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//Exibição toString
	@Override
	public String toString() {
		return "Identificador: "+this.id+"\n"+
				"Preço: "+this.preco+"\n"+
				"Nome do produto: "+this.nome+"\n";
	}
	
}
