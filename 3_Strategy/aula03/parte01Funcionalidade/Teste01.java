package aula03.parte01Funcionalidade;

public class Teste01 {
	public static void main(String[] args) {
		//Instanciando o objeto
		Jogador neymar;
		Jogador andre;
		
		//Inicializando o objeto
		neymar = new Jogador_Futebol("Neymar Junior");
		andre = new Jogador_Tenis("André Sá");
		
		//Métodos - Jogador de futebol
		neymar.estrategia();
		neymar.treino();
		neymar.competicao();
		
		
		//Métodos - Jogador de tênis
		andre.estrategia();
		andre.treino();
		andre.competicao();
		
	}
}
