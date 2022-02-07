package Aula03.parte03NovaFuncionalidadeOtimizada;

/**
 * @RegraDeNegocio
 * O jogador ter� nome, classifica��o de treino,
 * competi��o, estrat�gia e corrida.
 * 
 * @Classe que vai implementar as caracteristicas especificas
 * do jogador de xadrez.
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
public class Jogador_Xadrez extends Jogador implements ICorrida{

	//M�todo construtor
	public Jogador_Xadrez() {
	}
	public Jogador_Xadrez(String nome) {
		super.setNome(nome);
	}
	
	@Override
	public void estrategia() {
		System.out.println("O jogador de xadrez "+getNome()+" come�a com estrategias padronizadas e depois se adapta");
	}
	
	public void correr() {
		System.out.println("O jogador " +getNome()+ " n�o precisa correr");
		System.out.println();
	}
	

}
