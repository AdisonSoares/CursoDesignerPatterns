package aula02.parte04_GridContainerNovaFuncionalidade_;

/**
 * @Classe generica para ilustrar 
 * a classificação de um elemento
 * que pode ser armazenado.
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para ABSTRAÇÃO.
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
