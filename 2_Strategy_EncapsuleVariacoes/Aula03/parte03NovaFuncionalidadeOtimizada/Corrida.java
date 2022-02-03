package Aula03.parte03NovaFuncionalidadeOtimizada;

/**
 * @Interface criada para implementar nas classes filhas o m�todo
 * Corrida, de acordo com cada tipo de comportamento.
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
public interface Corrida {
	public void correr();
}
