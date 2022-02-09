package aula02.parte06_FlowGridContainerNovaFuncionalidadeOtimizadaHerancaComposicao_;

/**
 * @Interface criada para centralizar a funcionalidade borda, para
 * desassociar as bordas dos containes, gerando uma hierarquia de bordas.
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
 * 
 * @autor Adison
 */
public interface IBorda {
	/*Forma facultativa*/
	public abstract void gerarBorda();
	
	/*Forma reduzida*/
	//void gerarBorda();
}
