package aula03.parte02NovaFuncionalidade;

/**
 * @RegraDeNegocio
 * O jogador ter� nome, treino, competi��o e estrat�gia pr�pria.
 * 
 * @Classe que vai implementar as caracteristicas especificas
 * do jogador de poker.
 * 
 * @Itera��o da caracteristica de corrida do jogador e de um novo tipo.
 * 
 * @Problem�tica
 * A funcionalidade exigida de corrida, obrigatoriamente, precisa
 * ser incluida nas novas classes de jogadores e tem uma implementa��o
 * que varia muito de acordo com o comportamento do tipo de jogador 
 * incluido.Exemplo m�todo correr na classe Jogador_Poker.
 * 
 * @Solu��oHeran�a ameniza a problem�tica do m�todo correr, pois podem ser editadas 
 * dentro da classe que herda da classe m�e, mas essa flixibiliza��o 
 * pode ser melhor otimizada para deixar menos repetitiva a sua edi��o
 * aos diferentes tipos de comportamentos das classes jogadores.
 */
public class Jogador_Poker extends Jogador{

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
