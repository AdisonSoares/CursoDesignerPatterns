package aula03.parte03NovaFuncionalidadeOtimizada;

/**
 * @RegraDeNegocio
 * O jogador terá nome, classificação de treino,
 * competição, estratégia e corrida.
 * 
 * @Classe que vai implementar as caracteristicas especificas
 * do jogador de golfe.
 * 
 * @Iteração da interface Corrida para encapsular o comportamento correr.
 * 
 * @Problemática
 * Alguns tipos de jogadores incluidos, exigem 
 * mais flexibilidade na implementação do método corrida,
 * exigindo uma constante edição quando se inclui novas classes
 * de jogadores, com pouca facilidade para iterações.
 * 
 * @SoluçãoImplementaçãoInterface resolve o problema da obrigatoriedade
 * da implementação desse método nas classes mas deixa a edição ainda
 * constante a cada iteração, deixando o programa pouco atrativo para
 * mudanças e atualizações.
 */
public class Jogador_Golfe extends Jogador implements ICorrida{

	//Método construtor
	public Jogador_Golfe() {
		
	}
	public Jogador_Golfe(String nome) {
		super.setNome(nome);
	}
	
	@Override
	public void estrategia() {
		System.out.println("O jogador de golfe "+getNome()+" não ultrapassa os limites de tacadas para cada distancia");
		
	}
	
	public void correr() {
		System.out.println("O jogador " +getNome()+ " não precisa correr");
		System.out.println();
	}

}
