package aula02.parte05_FlowGridContainerNovaFuncionalidadeOtimizadaHeranca_;
import java.util.Arrays;

/**
 * @GridContainer
 * (Rede Container) - Agrupa os componentes da 
 * esquerda para direita em linha, de cima para baixo em coluna, 
 * na forma de uma matriz por meio de um Array.
 * 
 * @Implementa��o da classe 
 * Container para adicionar, remover e exibir a lista.
 * 
 * @Itera��o de um novo requisito/funcionalidade borda solida ao redor.
 * 
 * @Otimiza��o por meio de HERAN�A para reaproveitar c�digos, os outros m�todos
 * ser�o herdados de RedeContainer.
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para INTERFACE.
 */
public class RedeContainerBordaSolida extends RedeContainer{
	
	public RedeContainerBordaSolida(int largura, int altura) {
		super(largura, altura);
		elementosArray = new Component[largura][altura]; 
	}

	@Override
	public void exibir() {
		System.out.println("Container utilizado - Rede Container");
		System.out.println("Contem uma borda solida ao redor");
		System.out.println("Elementos presentes nesse container:");
		System.out.println(Arrays.deepToString(elementosArray));
		System.out.println("Usando heran�a para fechar o container");
		this.dispor();
		System.out.println();
	}
	
}
