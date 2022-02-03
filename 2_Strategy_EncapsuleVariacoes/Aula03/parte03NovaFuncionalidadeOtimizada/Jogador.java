package Aula03.parte03NovaFuncionalidadeOtimizada;

/**
 * @RegraDeNegocio
 * O jogador ter� nome, classifica��o de treino,
 * competi��o, estrat�gia e corrida.
 * 
 * @Interface que encapsula as caracteristicas gerais
 * dos jogadores.
 * 
 * @Itera��o da interface Corrida para encapsular o comportamento correr.
 * 
 * @Problem�tica
 * Alguns tipos de jogadores incluidos, exigem 
 * mais flexibilidade na implementa��o do m�todo corrida,
 * exigindo uma constante edi��o quando se inclui novas classes
 * de jogadores, com pouca facilidade para itera��es.
 * 
 * @Solu��oImplementa��oInterface resolve o problema da obrigatoriedade
 * da implementa��o desse m�todo nas classes mas deixa a edi��o ainda
 * constante a cada itera��o, deixando o programa pouco atrativo para
 * mudan�as e atualiza��es.
 */
public abstract class Jogador implements Corrida{
	// Regra de neg�cio - Nome do jogador
	private String nome;

	// Regra de neg�cio - M�todos de atividades
	public void treino() {
		System.out.println("Jogador " + nome + " em treinamento");
	}

	public void competicao() {
		System.out.println("Jogador " + nome + " em competi��o");
	}

	public abstract void estrategia();
	
	// Construtor
	public Jogador() {
	}
	
	public Jogador(String nome) {
		this.nome = nome;
	}

	// M�todos Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
