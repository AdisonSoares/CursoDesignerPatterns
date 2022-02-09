package aula03.parte01;
//Pattern atual F�brica Concreta.

/**
 * @RegraDeNegocio
 * O jogador ter� nome, treino, competi��o e estrat�gia pr�pria.
 * 
 * @Classe que vai implementar as caracteristicas especificas
 * do jogador de futebol.
 */
public class Jogador_Futebol extends Jogador {
	
	//M�todo construtor
	public Jogador_Futebol() {
	}
	public Jogador_Futebol(String nome) {
		super.setNome(nome);
	}
	
	@Override
	public void estrategia() {
		System.out.println("o Jogador de futebol "+getNome()+" prioriza o drible e avan�o");
	}
}
