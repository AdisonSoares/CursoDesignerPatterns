package aula02.parte05_FlowGridContainerNovaFuncionalidadeOtimizadaHeranca;

/**
 * @FlowContainer 
 * (Fluxo Container) - Agrupa os componentes da esquerda 
 * para direita, em forma de linha por meio de uma List.
 * 
 * @Implementa��o da classe 
 * Container para adicionar, remover e exibir a lista.
 * 
 * @Itera��o de um novo requisito/funcionalidade borda solida ao redor.
 * 
 * @Otimiza��o por meio de HERAN�A para reaproveitar c�digos, os outros m�todos
 * ser�o herdados de FluxoContainer.
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para INTERFACE.
 */
public class FluxoContainerBordaSolida extends FluxoContainer{
	
	@Override
	public void exibir() {
		System.out.println("Container utilizado - Fluxo Container");
		System.out.println("Contem uma borda solida ao redor");
		System.out.println("Elementos presentes nesse container:");
		System.out.println(elementos.toString());
		System.out.println("Usando heran�a para fechar o container");
		this.dispor();
		System.out.println();
	}
	
}
