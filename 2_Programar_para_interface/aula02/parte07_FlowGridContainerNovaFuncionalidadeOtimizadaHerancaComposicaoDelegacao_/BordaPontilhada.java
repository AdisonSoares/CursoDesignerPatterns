package aula02.parte07_FlowGridContainerNovaFuncionalidadeOtimizadaHerancaComposicaoDelegacao_;

/**
 * @Classe criada para implementar uma caracteristica pontilhada
 * de Borda.
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para INTEFACE.
 * 
 * @autor Adison
 */
public class BordaPontilhada extends Borda{
	
	public BordaPontilhada() {
		
	}
	
	public BordaPontilhada(Container container) {
		super.setContainer(container);
	}

	@Override
	public void gerarBorda() {
		getContainer().exibir();
		System.out.println("Contem uma borda pontilhada ao redor");
		getContainer().fecharContainer();
	}

}
