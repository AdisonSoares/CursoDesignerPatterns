package aula03.parte04NovaFuncionalidadeOtimizadaEncapsularVariacoes;

/**
 * @RegraDeNegocio
 * O jogador terá nome, classificação de treino,
 * competição, estratégia e corrida.
 * 
 * @Interface que encapsula as caracteristicas gerais
 * dos jogadores.
 * 
 * @Funcionalidade
 * Essa classe herda os métodos treino, competicao, correr e implementa o estratégia.
 * O método correr é passado por delegação, pois vai iniciar a instância 
 * ComportamentoCorridaStrategy e a especificação do tipo de comportamento,
 * ativo ou inativo, vai ser implementado no método construtor depois do nome do jogador.
 * 
 * @IteraçãoAnterior da interface Corrida para encapsular o comportamento correr.
 * 
 * @ProblemáticaAnterior
 * Alguns tipos de jogadores incluidos, exigem 
 * mais flexibilidade na implementação do método corrida,
 * exigindo uma constante edição quando se inclui novas classes
 * de jogadores, com pouca facilidade para iterações.
 * 
 * @SoluçãoImplementaçãoInterfaceAnterior resolve o problema da obrigatoriedade
 * da implementação desse método nas classes mas deixa a edição ainda
 * constante a cada iteração, deixando o programa pouco atrativo para
 * mudanças e atualizações.
 * 
 * @IteraçãoAtual o comportamento correr foi separado da classe jogador para compor
 * uma hierarquia das suas variações, sendo acessado pela classe Jogador 
 * por meio de delegação do comportamento Correr por meio da iniciação
 * do objeto ComportamentoCorridaStrategy.
 * 
 * @Tirar o código que varia entre as subclasses e colocar em uma hierarquia separada
 * usa o principio de programar para interface e favorecer a composição sobre herança.
 * 
 * @SoluçãoStrategy forma uma base para todos os tipos de projetos se baseia no 
 * principio de designer que resolve o problema encapsular o que varia.
 * 
 * Identifica-se os aspectos da aplicação que variam entre as subclasses e separamos
 * daqueles que permanecem sem alteração.
 * 
 * Pega-se o que varia e encapsulamos para que mais tarde possam ser alteradas ou extendidas
 * sem que haja alguma alteração nas funcionalidades que não variam.
 * 
 * @Resolvendo o problema da pouca otimização no aproveitamento de código e deixando mais
 * fácil e atrativa a iteração do programa.
 */
public class Jogador_Futebol extends Jogador_ClienteStrategy {
	
	//Método construtor
	public Jogador_Futebol() {
	}
	public Jogador_Futebol(String nome, IComportamentoCorrida_StrategyBase comportamentoCorrida) {
		super(nome,comportamentoCorrida);
	}
	
	@Override
	public void estrategia() {
		System.out.println("O Jogador de futebol "+getNome()+" prioriza o drible e avanço");
	}
	
}
