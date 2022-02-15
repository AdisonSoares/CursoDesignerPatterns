package aula04.parte06AdapterClass_Propriedades_;

/**
 * 
 * @M�todos useArma-carregarArma-mirarArma
 *
 */
public class Personagem_Cliente {
	private String nome;
	private IArma_Target arma;

	public Personagem_Cliente(String nome, IArma_Target arma) {
		this.nome = nome;
		this.arma = arma;
	}

	// M�todos para o uso da arma
	public void usarArma() {
		System.out.println(this.nome + " est� usando sua arma");
		arma.atirar();
	}

	public void carregarArma() {
		System.out.println(this.nome + " est� carregando sua arma");
		arma.carregar();
	}

	public void mirarArma() {
		System.out.println(this.nome + " est� mirando sua arma");
		arma.mirar();
	}

	// M�todos Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public IArma_Target getArma() {
		return arma;
	}

	public void setArma(IArma_Target arma) {
		this.arma = arma;
	}
}
