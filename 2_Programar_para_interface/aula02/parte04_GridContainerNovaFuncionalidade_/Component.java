package aula02.parte04_GridContainerNovaFuncionalidade_;

/**
 * @Classe generica para ilustrar 
 * a classifica��o de um elemento
 * que pode ser armazenado.
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para ABSTRA��O.
 */
public class Component {
	private String nome;
	
	public Component(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return nome;
	}
}
