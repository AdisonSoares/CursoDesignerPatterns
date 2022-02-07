package Aula05.parte05Facade_FachadaAplicacaoConhecimentoMinimo;

/**
 * @Principio_Aplicado na classe facade, no acoplamento ao 
 * carrinho de compras, est� sendo acoplado mais de um m�todo,
 * para resolver isso � preciso deixar a cria��o do carrinho 
 * de compras para o cliente, objetivo � reduzir o acoplamento.
 * 
 * @Facade vem de fachada, uma interface que unifica
 * um conjunto de interfaces ou subsistemas, define
 * uma interface de n�vel mais alto, tornando o 
 * subsistema mais f�cil de ser utilizado por um cliente,
 * � criado  para simplificar o uso das classes, a fa�ade 
 * referencia todo o subsitema.
 *
 * @Objetivo desse designe pattern � facilitar o uso dos 
 * subsistemas interligados com o cliente, ou seja, 
 * deixar a liga��o do cliente com as classes dependetes 
 * mais flexivel criando uma classe intermediaria entre
 * o cliente e o subsitema de classes que � o fa�ade que
 * vai agregar todos os comportamentos do subsistema, 
 * tendo uma comunica��o apenas com a inteface cliente por
 * meio de delega��o.
 *
 * @AcoplamentoFraco
 * O fa�ade facilita o uso de toda a interface, tornando o 
 * acomplamento, de todos os codigos clientes com o subsistema,
 * mais fraco. Fraco acoplamento � um dos principios de bons 
 * projetos de desenvolvimento principalmente
 * para reuso de classes e ter uma melhor manuten��o.
 *
 * @ConhecimentoMinimo lei de Dem�trio ou n�o fale com estranhos
 * previne a cria��o de designers que possuem um grande n�mero 
 * de classes acopladas dessa forma mudan�as em uma parte 
 * do sistema n�o � refletido para outras partes.
 *
 * @ConsideracoesDoPrincipio
 * Dado um objeto a partir de qualquer metodo desse objeto devemos 
 * invocar metodos que perten�am apenas ao proprio objeto, diminuindo a
 * quantidade de classes envolvidas. Ao fazer a manuten��o ou mudan�a
 * n�o gera o efeito de cascateamento, afetando outras classes ou m�todos.
 * 
 * @Ideal � usar esse principio do conhecimento minimo em interfaces
 * inst�veis, quando tenho uma grande probabilidade de mudan�as.
 *
 * @SignificadoDeOverride 
 * Uma referencia que indica a sobrescrita de m�todo herdado de
 * uma super classe, caso edite o nome da assinatura da classe 
 * ela perde a refer�ncia.
 */
public class Facade {
	private BancoDeDados bancoDeDados;
	//private CarrinhoDeCompras carrinho;
	private Cliente cliente;
	private Produto produto;
	
	//Liga��o ao banco de dados
	public Facade() {
		bancoDeDados = new BancoDeDados();
	}
	
	//Cria��o do cliente associado a um carrinho de compras e ao banco de dados
	public void registroCliente( int id, String nome) {
		cliente = new Cliente(id, nome);
		//carrinho = new CarrinhoDeCompras(); - na classe cliente foi criado no construtor
		//cliente.setCarrinhoDeCompras(carrinho); - na classe cliente foi passado pelo construtor 
		bancoDeDados.addCliente(cliente);
	}
	
	//Comprar produto
	public void compraIniciada(int idProduto, int idCliente) {
		cliente = bancoDeDados.selecionarCliente(idCliente);
		produto = bancoDeDados.selecionarProduto(idProduto);
		cliente.getCarrinhoDeCompras().addProduto(produto);
	}
	
	//Finaliza��o do pagamento
	public void finalizandoCompra(int idCliente) {
		cliente = bancoDeDados.selecionarCliente(idCliente);
		double total = cliente.calcularTotal();
		bancoDeDados.processoDePagamento(cliente, total);
	}
	
	

}
