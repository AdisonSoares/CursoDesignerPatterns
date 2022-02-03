package Aula03.parte02NovaFuncionalidade;

/**
 * @RegraDeNegocio
 * O jogador terá nome, classificação de treino,
 * competição, estratégia e corrida.
 * 
 * @Interface que encapsula as caracteristicas gerais
 * dos jogadores.
 * 
 * @Quando_programar_para_Interface
 * O ideal é programar para interface quando for necessário,
 * normalmente vem da necessidade de se atender ao principio
 * de variações protegidas, ou seja, permitir que implementações
 * mudem sem afetar o codigo cliente.
 * 
 * @Iteração de um novo tipo de jogador.
 * 
 * @Problemática
 * A funcionalidade exigida de corrida, obrigatoriamente, precisa
 * ser incluida nas novas classes de jogadores e tem uma implementação
 * que varia muito de acordo com o comportamento do tipo de jogador 
 * incluido.Exemplo método correr na classe Jogador_Poker.
 * 
 * @SoluçãoHerança ameniza a problemática do método correr, pois podem ser editadas 
 * dentro da classe que herda da classe mãe, mas essa flixibilização 
 * pode ser melhor otimizada para deixar menos repetitiva a sua edição
 * aos diferentes tipos de comportamentos das classes jogadores.
 */
public abstract class Jogador {
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

	// Regra de negócio - Nova funcionalidade (Correr)
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

	// Métodos Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
