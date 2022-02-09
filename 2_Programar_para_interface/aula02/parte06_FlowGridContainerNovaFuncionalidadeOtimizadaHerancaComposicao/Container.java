package aula02.parte06_FlowGridContainerNovaFuncionalidadeOtimizadaHerancaComposicao;

/**
 * @Classe para estruturar o funcionamento
 * de um container.
 * 
 * @Metodos abstratos que, obrigatoriamente, ter�o que
 * ser implementados por suas classes herdeiras de acordo
 * com seus diferentes comportamentos, � uma forma de 
 * programar para interface.
 * 
 * @Quando_programar_para_Interface
 * O ideal � programar para interface quando for necess�rio,
 * normalmente vem da necessidade de se atender ao principio
 * de varia��es protegidas, ou seja, permitir que implementa��es
 * mudem sem afetar o codigo cliente.
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
	protected IBorda borda;
	
	/**
	 * No momento de instancia��o, o Container e suas subclasses
	 * v�o poder indicar dentro do construtor um tipo de borda
	 * para ser configurada no container.
	 * @Parametro Borda
	 */
	public Container(IBorda borda) {
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
