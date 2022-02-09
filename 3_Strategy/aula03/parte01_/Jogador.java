package aula03.parte01_;

/**
 * @RegraDeNegocio
 * O jogador terá nome,treino, competição e estratégia própria.
 * 
 * @Interface que vai encapsular as caracteristicas gerais
 * dos jogadores.
 * 
 * @Quando_programar_para_Interface
 * O ideal é programar para interface quando for necessário,
 * normalmente vem da necessidade de se atender ao principio
 * de variações protegidas, ou seja, permitir que implementações
 * mudem sem afetar o codigo cliente.
 */
public abstract class Jogador {
	//Regra de negócio - Nome do jogador
	private String nome;

	// Regra de negócio - Métodos de atividades
	public void treino() {
		System.out.println("Jogador "+nome+" em treinamento");
	}
	
	public void competicao() {
		System.out.println("Jogador "+nome+" em competição");
		System.out.println();
	}
	
	public abstract void estrategia();
		
	// Construtor
	public Jogador() {
	}
	public Jogador(String nome) {
		this.nome = nome;
	}

	// Métodos Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
