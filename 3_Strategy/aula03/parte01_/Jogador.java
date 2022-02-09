package aula03.parte01_;

/**
 * @RegraDeNegocio
 * O jogador ter� nome,treino, competi��o e estrat�gia pr�pria.
 * 
 * @Interface que vai encapsular as caracteristicas gerais
 * dos jogadores.
 * 
 * @Quando_programar_para_Interface
 * O ideal � programar para interface quando for necess�rio,
 * normalmente vem da necessidade de se atender ao principio
 * de varia��es protegidas, ou seja, permitir que implementa��es
 * mudem sem afetar o codigo cliente.
 */
public abstract class Jogador {
	//Regra de neg�cio - Nome do jogador
	private String nome;

	// Regra de neg�cio - M�todos de atividades
	public void treino() {
		System.out.println("Jogador "+nome+" em treinamento");
	}
	
	public void competicao() {
		System.out.println("Jogador "+nome+" em competi��o");
		System.out.println();
	}
	
	public abstract void estrategia();
		
	// Construtor
	public Jogador() {
	}
	public Jogador(String nome) {
		this.nome = nome;
	}

	// M�todos Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
