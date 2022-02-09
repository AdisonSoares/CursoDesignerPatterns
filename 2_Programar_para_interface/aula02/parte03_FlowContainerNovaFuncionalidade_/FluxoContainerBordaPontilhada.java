package aula02.parte03_FlowContainerNovaFuncionalidade_;

import java.util.ArrayList;
import java.util.List;

/**
 * @FlowContainer
 * (Fluxo Container) - Agrupa os componentes da esquerda 
 * para direita, em forma de linha por meio de uma List.
 * 
 * @Implementação da classe 
 * Container para adicionar, remover e exibir a lista.
 * 
 * @Iteração de um novo requisito/funcionalidade borda pontilhada ao redor.
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para INTERFACE.
 */
public class FluxoContainerBordaPontilhada extends Container{
	
	private List<Component> elementos;
	
	public FluxoContainerBordaPontilhada() {
		elementos = new ArrayList<Component>();
	}
	
	@Override
	public void addComponent(Component component) {
		elementos.add(component);
	}
	
	@Override
	public void remComponent(Component component) {
		elementos.remove(component);
	}
	
	@Override
	public void exibir() {
		System.out.println("Container utilizado - Fluxo Container");
		System.out.println("Contem uma borda pontilhada ao redor");
		System.out.println("Elementos presentes nesse container:");
		System.out.println(elementos.toString());
		System.out.println("Usando herança para fechar o container");
		this.dispor();
		System.out.println();
	}
	
}
