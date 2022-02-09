package aula03.parte04NovaFuncionalidadeOtimizadaEncapsularVariacoes_;

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
 * @IteraçãoAnterior da interface Corrida para encapsular o 
 * comportamento correr.
 * 
 * @ProblemáticaAnterior
 * Alguns tipos de jogadores incluidos, exigem 
 * mais flexibilidade na implementação do método corrida,
 * exigindo uma constante edição quando se inclui novas classes
 * de jogadores, com pouca facilidade para iterações.
 * 
 * @SoluçãoImplementaçãoInterfaceAnterior resolve o problema da 
 * obrigatoriedade da implementação desse método nas classes mas 
 * deixa a edição ainda constante a cada iteração, deixando o
 * programa pouco atrativo para mudanças e atualizações.
 * 
 * @IteraçãoAtual o comportamento correr foi separado da classe jogador 
 * para compor uma hierarquia das suas variações, sendo acessado pela 
 * classe Jogador por meio de delegação do comportamento Correr por meio
 * da iniciação do objeto ComportamentoCorridaStrategy.
 * 
 * @Tirar o código que varia entre as subclasses e colocar em uma hierarquia
 * separada usa o principio de programar para interface e favorecer 
 * a composição sobre herança.
 * 
 * @SoluçãoStrategy forma uma base para todos os tipos de projetos,
 * se baseia no principio de designer que resolve o problema de encapsular
 * o que varia.
 * 
 * Identifica-se os aspectos da aplicação que variam entre as subclasses
 * e separamos daqueles que permanecem sem alteração.
 * 
 * Pega-se o que varia e encapsulamos para que mais tarde possam ser 
 * alteradas ou extendidas sem que haja alguma alteração nas funcionalidades
 * que não variam.
 * 
 * @Resolvendo o problema da pouca otimização no aproveitamento de código
 * e deixando mais fácil e atrativa a iteração do programa.
 */
public abstract class Jogador_ClienteStrategy {
	// Regra de negócio - Nome do jogador
	private String nome;
	
	//Instanciando o objeto Comportamento Corrida - Strategy
	private IComportamentoCorrida_StrategyBase comportamentoCorrida;
	
	//Regra de negócio - Especificar corrida, delega a execução do comportamento
	public void correr() {
		comportamentoCorrida.correr();
	}

	// Regra de negócio - Métodos de atividades
	public void treino() {
		System.out.println("Jogador " + nome + " em treinamento");
	}

	public void competicao() {
		System.out.println("Jogador " + nome + " em competição");
	}

	public abstract void estrategia();

	// Construtor
	protected Jogador_ClienteStrategy() {
	}
	
	protected Jogador_ClienteStrategy(String nome, IComportamentoCorrida_StrategyBase comportamentoCorrida) {
		this.nome = nome;
		this.comportamentoCorrida = comportamentoCorrida;
	}

	// Métodos Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
