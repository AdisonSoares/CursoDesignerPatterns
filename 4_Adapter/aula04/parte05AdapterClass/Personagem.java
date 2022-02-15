package aula04.parte05AdapterClass;

/**
 * 
 * @Métodos useArma-carregarArma-mirarArma
 *
 */
public class Personagem {
	private String nome;
	private IArma arma;

	public Personagem(String nome, IArma arma) {
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

	public IArma getArma() {
		return arma;
	}

	public void setArma(IArma arma) {
		this.arma = arma;
	}
}
