package aula02.parte06_FlowGridContainerNovaFuncionalidadeOtimizadaHerancaComposicao;

/**
 * @Interface criada para centralizar a funcionalidade borda, para
 * desassociar as bordas dos containes, gerando uma hierarquia de bordas.
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para INTERFACE.
 * 
 * @autor Adison
 */
public interface Borda {
	/*Forma facultativa*/
	public abstract void gerarBorda();
	
	/*Forma reduzida*/
	//void gerarBorda();
}
