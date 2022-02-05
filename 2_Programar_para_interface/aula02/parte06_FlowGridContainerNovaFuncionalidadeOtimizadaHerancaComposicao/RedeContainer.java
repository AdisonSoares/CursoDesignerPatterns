package aula02.parte06_FlowGridContainerNovaFuncionalidadeOtimizadaHerancaComposicao;
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
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para INTERFACE.
 */
public class RedeContainer extends Container{
	protected Component[][] elementosArray;
	private int linha, coluna, altura, largura;
	
	public RedeContainer(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
		elementosArray = new Component[largura][altura]; 
	}
	public RedeContainer(int largura, int altura, Borda borda) {
		super(borda);
		this.largura = largura;
		this.altura = altura;
		elementosArray = new Component[largura][altura]; 
	}

	@Override
	public void addComponent(Component component) {
		if(linha == largura && coluna == altura) {
			System.out.println("N�o � poss�vel adicionar, limite atingido");
		}else {
			elementosArray[linha][coluna]= component;
			coluna++;
			if(coluna == altura) {
				linha++;
				if(linha < largura) {
					coluna=0;
				}
			}
		}	
	}

	@Override
	public void remComponent(Component component) {
		for (int i = 0; i < elementosArray.length; i++) {
			for (int j = 0; j < elementosArray[i].length; j++) {
				if(elementosArray[i][j] == component) {
					elementosArray[i][j] = null; 
				}
			}
		}	
	}

	@Override
	public void exibir() {
		System.out.println("Container utilizado - Rede Container");
		if(borda != null) {
			borda.gerarBorda();
		}
		System.out.println("Elementos presentes nesse container:");
		System.out.println(Arrays.deepToString(elementosArray));
		System.out.println("Usando heran�a para fechar o container");
		this.fecharContainer();
		System.out.println();
	}
	
}
