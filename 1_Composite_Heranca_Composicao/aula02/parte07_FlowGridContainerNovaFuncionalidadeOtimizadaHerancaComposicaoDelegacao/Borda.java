package aula02.parte07_FlowGridContainerNovaFuncionalidadeOtimizadaHerancaComposicaoDelegacao;

/**
 * @Interface criada para centralizar a funcionalidade borda, para
 * desassociar as bordas dos containes, gerando uma hierarquia de bordas.
 * 
 * @Delega��o
 * Agora a interface borda possui um container
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para INTEFACE.
 * 
 * @autor Adison
 */
public abstract class Borda {
	//Liga��o com a classe container
	private Container container;
	
	//M�todo para ativar a funcionalidade
	public abstract void gerarBorda();


	public void setContainer(Container container) {
		this.container = container;
	}
	
	public Container getContainer() {
		return container;
	}
	
}
