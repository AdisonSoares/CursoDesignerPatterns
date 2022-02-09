package aula02.parte06_FlowGridContainerNovaFuncionalidadeOtimizadaHerancaComposicao_;

/**
 * @Interface criada para centralizar a funcionalidade borda, para
 * desassociar as bordas dos containes, gerando uma hierarquia de bordas.
 * 
 * @Quando_programar_para_Interface
 * O ideal � programar para interface quando for necess�rio,
 * normalmente vem da necessidade de se atender ao principio
 * de varia��es protegidas, ou seja, permitir que implementa��es
 * mudem sem afetar o codigo cliente.
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para INTERFACE.
 * 
 * @autor Adison
 */
public interface IBorda {
	/*Forma facultativa*/
	public abstract void gerarBorda();
	
	/*Forma reduzida*/
	//void gerarBorda();
}
