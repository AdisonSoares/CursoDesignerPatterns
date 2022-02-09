package aula02.parte07_FlowGridContainerNovaFuncionalidadeOtimizadaHerancaComposicaoDelegacao;

/**
 * @Interface criada para centralizar a funcionalidade borda, para
 * desassociar as bordas dos containes, gerando uma hierarquia de bordas.
 * 
 * @Delegação
 * Agora a interface borda possui um container.
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
public abstract class Borda {
	//Ligação com a classe container
	private Container container;
	
	//Método para ativar a funcionalidade
	public abstract void gerarBorda();


	public void setContainer(Container container) {
		this.container = container;
	}
	
	public Container getContainer() {
		return container;
	}
	
}
