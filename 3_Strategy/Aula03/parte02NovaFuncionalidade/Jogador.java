package Aula03.parte02NovaFuncionalidade;

/**
 * @RegraDeNegocio
 * O jogador ter� nome, classifica��o de treino,
 * competi��o, estrat�gia e corrida.
 * 
 * @Interface que encapsula as caracteristicas gerais
 * dos jogadores.
 * 
 * @Quando_programar_para_Interface
 * O ideal � programar para interface quando for necess�rio,
 * normalmente vem da necessidade de se atender ao principio
 * de varia��es protegidas, ou seja, permitir que implementa��es
 * mudem sem afetar o codigo cliente.
 * 
 * @Itera��o de um novo tipo de jogador.
 * 
 * @Problem�tica
 * A funcionalidade exigida de corrida, obrigatoriamente, precisa
 * ser incluida nas novas classes de jogadores e tem uma implementa��o
 * que varia muito de acordo com o comportamento do tipo de jogador 
 * incluido.Exemplo m�todo correr na classe Jogador_Poker.
 * 
 * @Solu��oHeran�a ameniza a problem�tica do m�todo correr, pois podem ser editadas 
 * dentro da classe que herda da classe m�e, mas essa flixibiliza��o 
 * pode ser melhor otimizada para deixar menos repetitiva a sua edi��o
 * aos diferentes tipos de comportamentos das classes jogadores.
 */
public abstract class Jogador {
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

	// Regra de neg�cio - Nova funcionalidade (Correr)
	public void correr() {
		System.out.println("O jogador " + nome + " precisa correr muito");
		System.out.println();
	}

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
