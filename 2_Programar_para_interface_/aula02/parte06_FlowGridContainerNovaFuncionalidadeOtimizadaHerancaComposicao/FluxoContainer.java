package aula02.parte06_FlowGridContainerNovaFuncionalidadeOtimizadaHerancaComposicao;
import java.util.ArrayList;
import java.util.List;

/**
 * @FlowContainer
 * (Fluxo Container) - Agrupa os componentes da esquerda 
 * para direita, em forma de linha por meio de uma List.
 * 
 * @Implementa��o da classe 
 * Container para adicionar, remover e exibir a lista.
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para INTERFACE.
 */
public class FluxoContainer extends Container{
	protected List<Component> elementos;

	/**
	 * Ao instanciar o construtor a lista � inicializada.
	 */
	public FluxoContainer() {
		elementos = new ArrayList<Component>();
	}
	
	public FluxoContainer(IBorda borda) {
		/**
		 * Recebe a borda da inst�ncia e atribui � super classe que recebe
		 * como argumento uma borda, que ir� inicializar a vari�vel borda
		 * na classe Container, tendo que especificar qual tipo de borda
		 * ser� exibido.
		 * Ao instanciar o construtor a lista � inicializada.
		 */
		super(borda);
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
		if(borda != null) {
			borda.gerarBorda();
		}
		System.out.println("Elementos presentes nesse container:");
		System.out.println(elementos.toString());
		System.out.println("Usando heran�a para fechar o container");
		this.fecharContainer();
		System.out.println();
	}
}


