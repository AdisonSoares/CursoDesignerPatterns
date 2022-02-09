package aula02.parte06_FlowGridContainerNovaFuncionalidadeOtimizadaHerancaComposicao_;

/**
 * @Classe criada para implementar uma caracteristica solida
 * de Borda.
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para INTERFACE.
 * 
 * @autor Adison
 */
public class BordaColorida implements IBorda{

	@Override
	public void gerarBorda() {
		System.out.println("Contem uma borda colorida");
		
	}

}
