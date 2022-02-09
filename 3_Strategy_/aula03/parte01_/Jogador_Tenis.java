package aula03.parte01_;

/**
 * @RegraDeNegocio
 * O jogador terá nome, treino, competição e estratégia própria.
 * 
 * @Classe que vai implementar as caracteristicas especificas
 * do jogador de tênis.
 */
public class Jogador_Tenis extends Jogador {

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
}
