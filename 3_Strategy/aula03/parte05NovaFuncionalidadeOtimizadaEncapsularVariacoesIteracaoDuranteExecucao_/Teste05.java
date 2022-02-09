package aula03.parte05NovaFuncionalidadeOtimizadaEncapsularVariacoesIteracaoDuranteExecucao_;

public class Teste05 {
	public static void main(String[] args) {
		// Instanciando o objeto
		Jogador_ClienteStrategy neymar, andre, rafael, rodrigo, joao;

		// Instanciando o objeto e inicializando com o coportamento especifico
		IComportamentoCorrida_StrategyBase corridaAtiva = new CorridaAtiva_StrategyCompleta01();
		IComportamentoCorrida_StrategyBase corridaInativa = new CorridaInativa_StrategyCompleta02();

		// Inicializando o objeto
		neymar = new Jogador_Futebol("Neymar Junior", corridaAtiva);
		andre = new Jogador_Tenis("André Sá", corridaAtiva);
		rafael = new Jogador_Xadrez("Rafael Leitão", corridaInativa);
		rodrigo = new Jogador_Golfe("Rodrigo Lee", corridaInativa);
		joao = new Jogador_Poker("João Simão", new CorridaInativa_StrategyCompleta02());

		// Funcionalidades - Jogador de futebol
		neymar.estrategia();
		neymar.treino();
		neymar.competicao();
		neymar.correr();

		// Métodos - Jogador de tênis
		andre.estrategia();
		andre.treino();
		andre.competicao();
		andre.correr();

		// Métodos - Jogador de xadrez
		rafael.estrategia();
		rafael.treino();
		rafael.competicao();
		rafael.correr();

		// Funcionalidades - Jogador de golfe
		rodrigo.estrategia();
		rodrigo.treino();
		rodrigo.competicao();
		rodrigo.correr();

		// Métodos - Jogador de poker
		joao.estrategia();
		joao.treino();
		joao.competicao();
		joao.correr();

		System.out.println("-------TESTE DE MUDANÇA DE COMPORTAMENTO EM TEMPO DE EXECUÇÃO-------\n");

		// Funcionalidades - Jogador de futebol
		neymar.setComportamentoCorrida(corridaInativa);
		neymar.estrategia();
		neymar.treino();
		neymar.competicao();
		neymar.correr();
		
		// Métodos - Jogador de tênis
		rafael.setComportamentoCorrida(corridaInativa);
		rafael.estrategia();
		rafael.treino();
		rafael.competicao();
		rafael.correr();
		

	}
}
