package aula04.parte07AdapterObject;

/**
 * @ObjectAdapter possui a mesma estrutura de um class adapter, tendo como diferencial
 * o target(alvo), que n�o � uma interface � uma classe, j� que em java n�o permite
 * heran�a multipla, precisa fazer com que o adapter herde de target, em vez
 * de implementar o target, fazendo com que o adapter n�o herde do adaptee.
 * 
 * @Atraves_de_composi��o o adapter consegue adaptar a interface esperada pelo cliente
 * e a interface do presente no adaptee.
 *
 */
public class CD {
	private String nome, album, gravadora;
	private int ano;
	
	//M�todo construtor
	public CD(String nome, String album, String gravadora, int ano) {
		this.nome = nome;
		this.album = album;
		this.gravadora = gravadora;
		this.ano = ano;
	}
	
	public CD() {
	}
	
	//M�todo Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
