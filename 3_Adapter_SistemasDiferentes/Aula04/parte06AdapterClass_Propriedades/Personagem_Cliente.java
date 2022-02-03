package Aula04.parte06AdapterClass_Propriedades;

/**
 * 
 * @Métodos useArma-carregarArma-mirarArma
 *
 */
public class Personagem_Cliente {
	private String nome;
	private Arma_Target arma;

	public Personagem_Cliente(String nome, Arma_Target arma) {
		this.nome = nome;
		this.arma = arma;
	}

	// Métodos para o uso da arma
	public void usarArma() {
		System.out.println(this.nome + " está usando sua arma");
		arma.atirar();
	}

	public void carregarArma() {
		System.out.println(this.nome + " está carregando sua arma");
		arma.carregar();
	}

	public void mirarArma() {
		System.out.println(this.nome + " está mirando sua arma");
		arma.mirar();
	}

	// Métodos Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Arma_Target getArma() {
		return arma;
	}

	public void setArma(Arma_Target arma) {
		this.arma = arma;
	}
}
