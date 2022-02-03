package aula02.parte07_FlowGridContainerNovaFuncionalidadeOtimizadaHerancaComposicaoDelegacao;

/**
 * @Interface criada para centralizar a funcionalidade borda, para
 * desassociar as bordas dos containes, gerando uma hierarquia de bordas.
 * 
 * @Delegação
 * Agora a interface borda possui um container
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para INTEFACE.
 * 
 * @autor Adison
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
