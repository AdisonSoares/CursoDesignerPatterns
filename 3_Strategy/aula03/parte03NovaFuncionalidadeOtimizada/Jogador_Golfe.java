package aula03.parte03NovaFuncionalidadeOtimizada;

/**
 * @RegraDeNegocio
 * O jogador ter� nome, classifica��o de treino,
 * competi��o, estrat�gia e corrida.
 * 
 * @Classe que vai implementar as caracteristicas especificas
 * do jogador de golfe.
 * 
 * @Itera��o da interface Corrida para encapsular o comportamento correr.
 * 
 * @Problem�tica
 * Alguns tipos de jogadores incluidos, exigem 
 * mais flexibilidade na implementa��o do m�todo corrida,
 * exigindo uma constante edi��o quando se inclui novas classes
 * de jogadores, com pouca facilidade para itera��es.
 * 
 * @Solu��oImplementa��oInterface resolve o problema da obrigatoriedade
 * da implementa��o desse m�todo nas classes mas deixa a edi��o ainda
 * constante a cada itera��o, deixando o programa pouco atrativo para
 * mudan�as e atualiza��es.
 */
public class Jogador_Golfe extends Jogador implements ICorrida{

	//M�todo construtor
	public Jogador_Golfe() {
		
	}
	public Jogador_Golfe(String nome) {
		super.setNome(nome);
	}
	
	@Override
	public void estrategia() {
		System.out.println("O jogador de golfe "+getNome()+" n�o ultrapassa os limites de tacadas para cada distancia");
		
	}
	
	public void correr() {
		System.out.println("O jogador " +getNome()+ " n�o precisa correr");
		System.out.println();
	}

}
