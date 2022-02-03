package Aula03.parte01;
//Pattern atual Singleton.

/**
 * @RegraDeNegocio
 * O jogador terá nome, treino, competição e estratégia própria.
 * 
 * @Classe que vai implementar as caracteristicas especificas
 * do jogador de futebol.
 */
public class Jogador_Futebol extends Jogador {
	
	//Método construtor
	public Jogador_Futebol() {
	}
	public Jogador_Futebol(String nome) {
		super.setNome(nome);
	}
	
	@Override
	public void estrategia() {
		System.out.println("o Jogador de futebol "+getNome()+" prioriza o drible e avanço");
	}
}
