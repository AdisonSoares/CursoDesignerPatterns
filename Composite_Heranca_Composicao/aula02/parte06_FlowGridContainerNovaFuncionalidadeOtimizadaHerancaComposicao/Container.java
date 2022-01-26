package aula02.parte06_FlowGridContainerNovaFuncionalidadeOtimizadaHerancaComposicao;

/**
 * @Classe para estruturar o funcionamento
 * de um container.
 * 
 * @Metodos abstratos que, obrigatoriamente, ter�o que
 * ser implementados por suas classes herdeiras de acordo
 * com seus diferentes comportamentos.
 * 
 * @Composicao de uma borda para n�o precisar criar classe,
 * indicando que todo o container ter� uma borda.
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para INTERFACE.
 */
public abstract class Container {
	
	//Composi��o
	protected Borda borda;
	
	/**
	 * No momento de instancia��o, o Container e suas subclasses
	 * v�o poder indicar dentro do construtor um tipo de borda
	 * para ser configurada no container.
	 * @Parametro Borda
	 */
	public Container(Borda borda) {
		this.borda = borda;
	}
	
	//Construtor vazio - Caso n�o queira um tipo de borda.
	public Container(){}
	
	//M�todo abstrato
	public abstract void addComponent(Component component);
	public abstract void remComponent(Component component);
	public abstract void exibir();
	
	//M�todo concreto
	public void fecharContainer() {
		System.out.println("Fechando o container");
	}
	
}
