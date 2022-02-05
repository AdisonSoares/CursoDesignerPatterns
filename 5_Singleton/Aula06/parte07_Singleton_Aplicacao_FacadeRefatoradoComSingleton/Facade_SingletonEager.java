package Aula06.parte07_Singleton_Aplicacao_FacadeRefatoradoComSingleton;

/**
 * @Principio_Aplicado na classe facade, no acoplamento ao 
 * carrinho de compras, está sendo acoplado mais de um método,
 * para resolver isso é preciso deixar a criação do carrinho 
 * de compras para o cliente, objetivo é reduzir o acoplamento.
 * 
 * @Facade vem de fachada, uma interface que unifica
 * um conjunto de interfaces ou subsistemas, define
 * uma interface de nível mais alto, tornando o 
 * subsistema mais fácil de ser utilizado por um cliente,
 * é criado  para simplificar o uso das classes, a façade 
 * referencia todo o subsitema.
 *
 * @Objetivo desse designe pattern é facilitar o uso dos 
 * subsistemas interligados com o cliente, ou seja, 
 * deixar a ligação do cliente com as classes dependetes 
 * mais flexivel criando uma classe intermediaria entre
 * o cliente e o subsitema de classes que é o façade que
 * vai agregar todos os comportamentos do subsistema, 
 * tendo uma comunicação apenas com a inteface cliente por
 * meio de delegação.
 *
 * @AcoplamentoFraco
 * O façade facilita o uso de toda a interface, tornando o 
 * acomplamento, de todos os codigos clientes com o subsistema,
 * mais fraco. Fraco acoplamento é um dos principios de bons 
 * projetos de desenvolvimento principalmente
 * para reuso de classes e ter uma melhor manutenção.
 *
 * @ConhecimentoMinimo lei de Demétrio ou não fale com estranhos
 * previne a criação de designers que possuem um grande número 
 * de classes acopladas dessa forma mudanças em uma parte 
 * do sistema não é refletido para outras partes.
 *
 * @ConsideracoesDoPrincipio
 * Dado um objeto a partir de qualquer metodo desse objeto devemos 
 * invocar metodos que pertençam apenas ao proprio objeto, diminuindo a
 * quantidade de classes envolvidas. Ao fazer a manutenção ou mudança
 * não gera o efeito de cascateamento, afetando outras classes ou métodos.
 * 
 * @Ideal é usar esse principio do conhecimento minimo em interfaces
 * instáveis, quando tenho uma grande probabilidade de mudanças.
 *
 * @SignificadoDeOverride 
 * Uma referencia que indica a sobrescrita de método herdado de
 * uma super classe, caso edite o nome da assinatura da classe 
 * ela perde a referência.
 * 
 * @Refatorar_o_facade
 * É comum usar o facade junto com singleton, melhorando o desempenho
 * tendo apenas um objeto do tipo facade estanciado, sendo compartilhado
 * pelos clientes do sistema.
 * 
 * @ObjetivoDaJunção
 * Transformar a facade criada em um singleton usando a estrategia eager.
 */
public class Facade_SingletonEager {
	private BancoDeDados bancoDeDados;
	//private CarrinhoDeCompras carrinho;
	private Cliente cliente;
	private Produto produto;
	
	//Criação do singleton eager
	private static Facade_SingletonEager instancia = new Facade_SingletonEager();
	
	
	//Criação do singleton eager
	//Ligação ao banco de dados
	private Facade_SingletonEager() {
		bancoDeDados = new BancoDeDados();
	}
	
	//Criação do singleton eager
	public static Facade_SingletonEager getInstancia() {
		return instancia;
	}
	
	//Criação do cliente associado a um carrinho de compras e ao banco de dados
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
	
	//Finalização do pagamento
	public void finalizandoCompra(int idCliente) {
		cliente = bancoDeDados.selecionarCliente(idCliente);
		double total = cliente.calcularTotal();
		bancoDeDados.processoDePagamento(cliente, total);
	}
	
	

}
