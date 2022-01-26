package aula02.parte06_FlowGridContainerNovaFuncionalidadeOtimizadaHerancaComposicao;

/**
 * @Classe para estruturar o funcionamento
 * de um container.
 * 
 * @Metodos abstratos que, obrigatoriamente, terão que
 * ser implementados por suas classes herdeiras de acordo
 * com seus diferentes comportamentos.
 * 
 * @Composicao de uma borda para não precisar criar classe,
 * indicando que todo o container terá uma borda.
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para INTERFACE.
 */
public abstract class Container {
	
	//Composição
	protected Borda borda;
	
	/**
	 * No momento de instanciação, o Container e suas subclasses
	 * vão poder indicar dentro do construtor um tipo de borda
	 * para ser configurada no container.
	 * @Parametro Borda
	 */
	public Container(Borda borda) {
		this.borda = borda;
	}
	
	//Construtor vazio - Caso não queira um tipo de borda.
	public Container(){}
	
	//Método abstrato
	public abstract void addComponent(Component component);
	public abstract void remComponent(Component component);
	public abstract void exibir();
	
	//Método concreto
	public void fecharContainer() {
		System.out.println("Fechando o container");
	}
	
}
