package aula03.parte02NovaFuncionalidade;

public class Teste02 {
	public static void main(String[] args) {
		// Instanciando o objeto
		Jogador neymar, andre, rafael, rodrigo, joao;

		// Inicializando o objeto
		neymar = new Jogador_Futebol("Neymar Junior");
		andre = new Jogador_Tenis("André Sá");
		rafael = new Jogador_Xadrez("Rafael Leitão");
		rodrigo = new Jogador_Golfe("Rodrigo Lee");
		joao = new Jogador_Poker("João Simão");

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

	}
}
