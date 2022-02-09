package aula02.parte02_GridContainer;
import java.util.Arrays;

/**
 * @GridContainer
 * (Rede Container) - Agrupa os componentes da 
 * esquerda para direita em linha, de cima para baixo em coluna, 
 * na forma de uma matriz por meio de um Array.
 * 
 * @Implementação da classe 
 * Container para adicionar, remover e exibir a lista.
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para INTERFACE.
 */
public class RedeContainer extends Container{
	private Component[][] elementosArray;
	private int linha, coluna, altura, largura;
	
	public RedeContainer(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
		elementosArray = new Component[largura][altura]; 
	}

	@Override
	public void addComponent(Component component) {
		if(linha == altura && coluna == largura) {
			System.out.println("Não é possível adicionar, limite atingido");
		}else {
			elementosArray[linha][coluna] = component;
			coluna++;
			if(coluna == largura) {
				linha++;
				if(linha < altura) {
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
		System.out.println("Elementos presentes nesse container:");
		System.out.println(Arrays.deepToString(elementosArray));
		System.out.println("Usando herança para fechar o container");
		this.dispor();
		System.out.println();
	}
	
}
