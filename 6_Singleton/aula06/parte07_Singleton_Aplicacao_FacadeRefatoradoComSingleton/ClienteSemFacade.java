package aula06.parte07_Singleton_Aplicacao_FacadeRefatoradoComSingleton;

/**
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
 */
public class ClienteSemFacade {
	public static void main(String[] args) {

		BancoDeDados bancoDeDados = new BancoDeDados();

		Cliente paiva = new Cliente(01, "Paiva");
		
		bancoDeDados.addCliente(paiva);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		paiva.setCarrinhoDeCompras(carrinho);
		
	
		Produto notebook = bancoDeDados.selecionarProduto(2);
		Produto mouse = bancoDeDados.selecionarProduto(3);

		paiva.getCarrinhoDeCompras().addProduto(notebook);
		paiva.getCarrinhoDeCompras().addProduto(mouse);
	
		
		double total = paiva.getCarrinhoDeCompras().getTotal();
		bancoDeDados.processoDePagamento(paiva, total);
	}
}
