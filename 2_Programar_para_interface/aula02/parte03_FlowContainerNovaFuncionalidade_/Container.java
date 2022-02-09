package aula02.parte03_FlowContainerNovaFuncionalidade_;

/**
 * @Classe para estruturar o funcionamento
 * de um container.
 * 
 * @Metodos abstratos que, obrigatoriamente, terão que
 * ser implementados por suas classes herdeiras de acordo
 * com seus diferentes comportamentos, é uma forma de
 * programar para interface.
 * 
 * @Quando_programar_para_Interface
 * O ideal é programar para interface quando for necessário,
 * normalmente vem da necessidade de se atender ao principio
 * de variações protegidas, ou seja, permitir que implementações
 * mudem sem afetar o codigo cliente.
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para INTERFACE.
 */
public abstract class Container {
	
	//Método abstrato
	public abstract void addComponent(Component component);
	public abstract void remComponent(Component component);
	public abstract void exibir();
	
	//Método concreto
	public void dispor() {
		System.out.println("Fechando o container");
	}
	
}
