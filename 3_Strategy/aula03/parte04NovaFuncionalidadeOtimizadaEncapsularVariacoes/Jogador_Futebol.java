package aula03.parte04NovaFuncionalidadeOtimizadaEncapsularVariacoes;

/**
 * @RegraDeNegocio
 * O jogador ter� nome, classifica��o de treino,
 * competi��o, estrat�gia e corrida.
 * 
 * @Interface que encapsula as caracteristicas gerais
 * dos jogadores.
 * 
 * @Funcionalidade
 * Essa classe herda os m�todos treino, competicao, correr e implementa o estrat�gia.
 * O m�todo correr � passado por delega��o, pois vai iniciar a inst�ncia 
 * ComportamentoCorridaStrategy e a especifica��o do tipo de comportamento,
 * ativo ou inativo, vai ser implementado no m�todo construtor depois do nome do jogador.
 * 
 * @Itera��oAnterior da interface Corrida para encapsular o comportamento correr.
 * 
 * @Problem�ticaAnterior
 * Alguns tipos de jogadores incluidos, exigem 
 * mais flexibilidade na implementa��o do m�todo corrida,
 * exigindo uma constante edi��o quando se inclui novas classes
 * de jogadores, com pouca facilidade para itera��es.
 * 
 * @Solu��oImplementa��oInterfaceAnterior resolve o problema da obrigatoriedade
 * da implementa��o desse m�todo nas classes mas deixa a edi��o ainda
 * constante a cada itera��o, deixando o programa pouco atrativo para
 * mudan�as e atualiza��es.
 * 
 * @Itera��oAtual o comportamento correr foi separado da classe jogador para compor
 * uma hierarquia das suas varia��es, sendo acessado pela classe Jogador 
 * por meio de delega��o do comportamento Correr por meio da inicia��o
 * do objeto ComportamentoCorridaStrategy.
 * 
 * @Tirar o c�digo que varia entre as subclasses e colocar em uma hierarquia separada
 * usa o principio de programar para interface e favorecer a composi��o sobre heran�a.
 * 
 * @Solu��oStrategy forma uma base para todos os tipos de projetos se baseia no 
 * principio de designer que resolve o problema encapsular o que varia.
 * 
 * Identifica-se os aspectos da aplica��o que variam entre as subclasses e separamos
 * daqueles que permanecem sem altera��o.
 * 
 * Pega-se o que varia e encapsulamos para que mais tarde possam ser alteradas ou extendidas
 * sem que haja alguma altera��o nas funcionalidades que n�o variam.
 * 
 * @Resolvendo o problema da pouca otimiza��o no aproveitamento de c�digo e deixando mais
 * f�cil e atrativa a itera��o do programa.
 */
public class Jogador_Futebol extends Jogador_ClienteStrategy {
	
	//M�todo construtor
	public Jogador_Futebol() {
	}
	public Jogador_Futebol(String nome, IComportamentoCorrida_StrategyBase comportamentoCorrida) {
		super(nome,comportamentoCorrida);
	}
	
	@Override
	public void estrategia() {
		System.out.println("O Jogador de futebol "+getNome()+" prioriza o drible e avan�o");
	}
	
}
