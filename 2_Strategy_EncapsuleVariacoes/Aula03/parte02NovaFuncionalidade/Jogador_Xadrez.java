package Aula03.parte02NovaFuncionalidade;

/**
 * @RegraDeNegocio
 * O jogador terá nome, treino, competição e estratégia própria.
 * 
 * @Classe que vai implementar as caracteristicas especificas
 * do jogador de xadrez.
 * 
 * @Iteração da caracteristica de corrida do jogador e de um novo tipo
 * de jogador.
 * 
 * @Problemática
 * A funcionalidade exigida de corrida, obrigatoriamente, precisa
 * ser incluida nas novas classes de jogadores e tem uma implementação
 * que varia muito de acordo com o comportamento do tipo de jogador 
 * incluido.Exemplo método correr na classe Jogador_Poker.
 * 
 * @SoluçãoHerança ameniza a problemática do método correr, pois podem ser editadas 
 * dentro da classe que herda da classe mãe, mas essa flixibilização 
 * pode ser melhor otimizada para deixar menos repetitiva a sua edição
 * aos diferentes tipos de comportamentos das classes jogadores.
 */
public class Jogador_Xadrez extends Jogador{

	//Método construtor
	public Jogador_Xadrez() {
	}
	public Jogador_Xadrez(String nome) {
		super.setNome(nome);
	}
	
	@Override
	public void estrategia() {
		System.out.println("O jogador de xadrez "+getNome()+" começa com estrategias padronizadas e depois se adapta");
	}
	
	public void correr() {
		System.out.println("O jogador " +getNome()+ " não precisa correr");
		System.out.println();
	}

}
