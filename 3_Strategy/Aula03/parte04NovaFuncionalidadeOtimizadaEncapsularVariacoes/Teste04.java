package Aula03.parte04NovaFuncionalidadeOtimizadaEncapsularVariacoes;

public class Teste04 {
	public static void main(String[] args) {
		// Instanciando o objeto
		Jogador_ClienteStrategy neymar, andre, rafael, rodrigo, joao;

		// Instanciando o objeto e inicializando com o coportamento especifico
		ComportamentoCorrida_StrategyBase corridaAtiva = new CorridaAtiva_StrategyCompleta01();
		ComportamentoCorrida_StrategyBase corridaInativa = new CorridaInativa_StrategyCompleta02();

		// Inicializando o objeto
		neymar = new Jogador_Futebol("Neymar Junior", corridaAtiva);
		andre = new Jogador_Tenis("Andr� S�", corridaAtiva);
		rafael = new Jogador_Xadrez("Rafael Leit�o", corridaInativa);
		rodrigo = new Jogador_Golfe("Rodrigo Lee", corridaInativa);
		joao = new Jogador_Poker("Jo�o Sim�o", new CorridaInativa_StrategyCompleta02());

		// Funcionalidades - Jogador de futebol
		neymar.estrategia();
		neymar.treino();
		neymar.competicao();
		neymar.correr();

		// M�todos - Jogador de t�nis
		andre.estrategia();
		andre.treino();
		andre.competicao();
		andre.correr();

		// M�todos - Jogador de xadrez
		rafael.estrategia();
		rafael.treino();
		rafael.competicao();
		rafael.correr();

		// Funcionalidades - Jogador de golfe
		rodrigo.estrategia();
		rodrigo.treino();
		rodrigo.competicao();
		rodrigo.correr();

		// M�todos - Jogador de poker
		joao.estrategia();
		joao.treino();
		joao.competicao();
		joao.correr();


	}
}
