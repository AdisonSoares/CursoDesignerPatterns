package aula03.parte02NovaFuncionalidade;

/**
 * @RegraDeNegocio
 * O jogador ter� nome, treino, competi��o e estrat�gia pr�pria.
 * 
 * @Classe que vai implementar as caracteristicas especificas
 * do jogador de futebol.
 * 
 * @Itera��o da caracteristica de corrida do jogador.
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















