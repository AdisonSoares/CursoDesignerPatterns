package Aula04.parte05AdapterClass;

/**
 * 
 * @Métodos useArma-carregarArma-mirarArma
 *
 */
public class Personagem {
	private String nome;
	private Arma arma;

	public Personagem(String nome, Arma arma) {
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

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}
}
