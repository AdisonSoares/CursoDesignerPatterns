package aula03.parte01Funcionalidade;

public class Teste01 {
	public static void main(String[] args) {
		//Instanciando o objeto
		Jogador neymar;
		Jogador andre;
		
		//Inicializando o objeto
		neymar = new Jogador_Futebol("Neymar Junior");
		andre = new Jogador_Tenis("Andr� S�");
		
		//M�todos - Jogador de futebol
		neymar.estrategia();
		neymar.treino();
		neymar.competicao();
		
		
		//M�todos - Jogador de t�nis
		andre.estrategia();
		andre.treino();
		andre.competicao();
		
	}
}
