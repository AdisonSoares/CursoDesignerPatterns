package Aula03.parte03NovaFuncionalidadeOtimizada;

/**
 * @RegraDeNegocio
 * O jogador terá nome, classificação de treino,
 * competição, estratégia e corrida.
 * 
 * @Classe que vai implementar as caracteristicas especificas
 * do jogador de tênis.
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
public class Jogador_Tenis extends Jogador implements ICorrida{

	//Método construtor
	public Jogador_Tenis() {
	}
	public Jogador_Tenis(String nome) {
		super.setNome(nome);
	}
	
	@Override
	public void estrategia() {
		System.out.println("O jogador de tênis "+getNome()+" força mais o saque");
	}
	@Override
	public void correr() {
		System.out.println("O jogador " +getNome()+ " precisa correr");
		System.out.println();
	}
}
