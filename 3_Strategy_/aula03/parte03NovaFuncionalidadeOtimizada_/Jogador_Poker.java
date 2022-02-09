package aula03.parte03NovaFuncionalidadeOtimizada_;

/**
 * @RegraDeNegocio
 * O jogador ter� nome, classifica��o de treino,
 * competi��o, estrat�gia e corrida.
 * 
 * @Classe que vai implementar as caracteristicas especificas
 * do jogador de poker.
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
public class Jogador_Poker extends Jogador implements ICorrida{

	//M�todo construtor
	public Jogador_Poker() {
	}
	public Jogador_Poker(String nome) {
		super.setNome(nome);
	}

	@Override
	public void estrategia() {
		System.out.println("O jogador de poker "+getNome()+" n�o expressa emo�oes durante as jogadas");
	}
	
	public void correr() {
		System.out.println("O jogador " +getNome()+ " n�o precisa correr");
		System.out.println();
	}

}
