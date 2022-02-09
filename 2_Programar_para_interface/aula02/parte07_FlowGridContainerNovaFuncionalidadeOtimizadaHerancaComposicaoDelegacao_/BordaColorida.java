package aula02.parte07_FlowGridContainerNovaFuncionalidadeOtimizadaHerancaComposicaoDelegacao_;

/**
 * @Classe criada para implementar uma caracteristica solida
 * de Borda.
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para INTEFACE.
 * 
 * @autor Adison
 */
public class BordaColorida extends Borda{
	
	public BordaColorida() {
		
	}
	
	public BordaColorida(Container container) {
		super.setContainer(container);
	}

	@Override
	public void gerarBorda() {
		getContainer().exibir();
		System.out.println("Contem uma borda colorida");
		getContainer().fecharContainer();
		
	}

}
