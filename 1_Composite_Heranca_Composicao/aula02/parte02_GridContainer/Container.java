package aula02.parte02_GridContainer;

/**
 * @Classe para estruturar o funcionamento
 * de um container.
 * 
 * @Metodos abstratos que, obrigatoriamente, ter�o que
 * ser implementados por suas classes herdeiras de acordo
 * com seus diferentes comportamentos.
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para INTERFACE.
 */
public abstract class Container {
	
	//M�todo abstrato
	public abstract void addComponent(Component component);
	public abstract void remComponent(Component component);
	public abstract void exibir();
	
	//M�todo concreto
	public void dispor() {
		System.out.println("Fechando o container");
	}
	
}
