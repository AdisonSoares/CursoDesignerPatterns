package Aula03.parte03NovaFuncionalidadeOtimizada;

/**
 * @RegraDeNegocio
 * O jogador terá nome, classificação de treino,
 * competição, estratégia e corrida.
 * 
 * @Interface que encapsula as caracteristicas gerais
 * dos jogadores.
 * 
 * @Iteração da interface Corrida para encapsular o comportamento correr.
 * 
 * @Problemática
 * Alguns tipos de jogadores incluidos, exigem 
 * mais flexibilidade na implementação do método corrida,
 * exigindo uma constante edição quando se inclui novas classes
 * de jogadores, com pouca facilidade para iterações.
 * 
 * @SoluçãoImplementaçãoInterface resolve o problema da obrigatoriedade
 * da implementação desse método nas classes mas deixa a edição ainda
 * constante a cada iteração, deixando o programa pouco atrativo para
 * mudanças e atualizações.
 */
public abstract class Jogador implements Corrida{
	// Regra de negócio - Nome do jogador
	private String nome;

	// Regra de negócio - Métodos de atividades
	public void treino() {
		System.out.println("Jogador " + nome + " em treinamento");
	}

	public void competicao() {
		System.out.println("Jogador " + nome + " em competição");
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
