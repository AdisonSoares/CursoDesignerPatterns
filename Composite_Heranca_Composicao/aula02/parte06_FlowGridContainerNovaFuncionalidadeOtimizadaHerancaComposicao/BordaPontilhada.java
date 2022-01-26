package aula02.parte06_FlowGridContainerNovaFuncionalidadeOtimizadaHerancaComposicao;

/**
 * @Classe criada para implementar uma caracteristica pontilhada
 * de Borda.
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para INTERFACE.
 * 
 * @autor Adison
 */
public class BordaPontilhada implements Borda{

	@Override
	public void gerarBorda() {
		System.out.println("Contem uma borda pontilhada ao redor");
		
	}

}
