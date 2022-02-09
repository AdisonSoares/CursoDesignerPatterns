package aula03.parte01_;

/**
 * @RegraDeNegocio
 * O jogador ter� nome, treino, competi��o e estrat�gia pr�pria.
 * 
 * @Classe que vai implementar as caracteristicas especificas
 * do jogador de t�nis.
 */
public class Jogador_Tenis extends Jogador {

	//M�todo construtor
	public Jogador_Tenis() {
	}
	public Jogador_Tenis(String nome) {
		super.setNome(nome);
	}
	
	@Override
	public void estrategia() {
		System.out.println("O jogador de t�nis "+getNome()+" for�a mais o saque");
	}
}
