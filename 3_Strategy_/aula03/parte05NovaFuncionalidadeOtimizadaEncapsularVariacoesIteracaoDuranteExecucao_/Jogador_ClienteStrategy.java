package aula03.parte05NovaFuncionalidadeOtimizadaEncapsularVariacoesIteracaoDuranteExecucao_;

/**
 * @RegraDeNegocio
 * O jogador ter� nome, classifica��o de treino,
 * competi��o, estrat�gia e corrida.
 * 
 * @Interface que encapsula as caracteristicas gerais
 * dos jogadores.
 * 
 * @Itera��oAnterior1 da interface Corrida para encapsular o comportamento
 * correr.
 * 
 * @Problem�ticaAnterior
 * Alguns tipos de jogadores incluidos, exigem 
 * mais flexibilidade na implementa��o do m�todo corrida,
 * exigindo uma constante edi��o quando se inclui novas classes
 * de jogadores, com pouca facilidade para itera��es.
 * 
 * @Solu��oImplementa��oInterfaceAnterior resolve o problema da 
 * obrigatoriedade da implementa��o desse m�todo nas classes mas 
 * deixa a edi��o ainda constante a cada itera��o, deixando o 
 * programa pouco atrativo para mudan�as e atualiza��es.
 * 
 * @Itera��oAnterior2 o comportamento correr foi separado da classe jogador
 * para compor uma hierarquia das suas varia��es, sendo acessado pela 
 * classe Jogador por meio de delega��o do comportamento Correr por meio
 * da inicia��o do objeto ComportamentoCorridaStrategy.
 * 
 * @Tirar o c�digo que varia entre as subclasses e colocar em uma hierarquia 
 * separada usa o principio de programar para interface e favorecer a 
 * composi��o sobre heran�a.
 * 
 * @Solu��oStrategy forma uma base para todos os tipos de projetos se baseia 
 * no principio de designer que resolve o problema encapsular o que varia.
 * 
 * Identifica-se os aspectos da aplica��o que variam entre as subclasses e 
 * separamos daqueles que permanecem sem altera��o.
 * 
 * Pega-se o que varia e encapsulamos para que mais tarde possam ser alteradas
 * ou extendidas sem que haja alguma altera��o nas funcionalidades que n�o
 * variam.
 * 
 * @Resolvendo o problema da pouca otimiza��o no aproveitamento de c�digo e 
 * deixando mais f�cil e atrativa a itera��o do programa.
 * 
 * @Itera��oAtual em tempo de execu��o criou-se o m�todo setComportamentoCorrida
 * para alterar o comportamento de corrida, sem precisar implementar 
 * nas outras classes apenas na execu��o.
 */
public abstract class Jogador_ClienteStrategy {
	// Regra de neg�cio - Nome do jogador
	private String nome;
	
	//Instanciando o objeto Comportamento Corrida - Strategy
	private IComportamentoCorrida_StrategyBase comportamentoCorrida;
	
	//Regra de neg�cio - Especificar corrida, delega a execu��o do comportamento
	public void correr() {
		comportamentoCorrida.correr();
	}

	// Regra de neg�cio - M�todos de atividades
	public void treino() {
		System.out.println("Jogador " + nome + " em treinamento");
	}

	public void competicao() {
		System.out.println("Jogador " + nome + " em competi��o");
	}

	public abstract void estrategia();

	// Construtor
	protected Jogador_ClienteStrategy() {
	}
	
	protected Jogador_ClienteStrategy(String nome, IComportamentoCorrida_StrategyBase comportamentoCorrida) {
		this.nome = nome;
		this.comportamentoCorrida = comportamentoCorrida;
	}

	// M�todos Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//Nova funcionalidade em tempo de execu��o
	public void setComportamentoCorrida(IComportamentoCorrida_StrategyBase comportamentoCorrida) {
		this.comportamentoCorrida = comportamentoCorrida;
	}

}
