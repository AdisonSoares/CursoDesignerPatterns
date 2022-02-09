package aula02.parte07_FlowGridContainerNovaFuncionalidadeOtimizadaHerancaComposicaoDelegacao;

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
 * @Composicao de uma borda para não precisar criar classe,
 * indicando que todo o container terá uma borda.
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para INTEFACE.
 */
public abstract class Container {

	//Método abstrato
	public abstract void addComponent(Component component);
	public abstract void remComponent(Component component);
	public abstract void exibir();
	
	//Método concreto
	public void fecharContainer() {
		System.out.println("Fechando o container personalizado atraves de delegação\n");
	}
	
}
