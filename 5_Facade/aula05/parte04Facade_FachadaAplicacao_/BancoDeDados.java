package aula05.parte04Facade_FachadaAplicacao_;
import java.util.ArrayList;
import java.util.List;

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
public class BancoDeDados {
	private List<Cliente> clientes;
	private List<Produto> produtos;
	
	public BancoDeDados() {
		clientes = new ArrayList<Cliente>();
		produtos = new ArrayList<Produto>();
		produtos.add(new Produto(2,"Notebook", 1200.50));
		produtos.add(new Produto(3,"Mouse", 14.50));
	}
	
	public Cliente selecionarCliente(int id) {
		for (Cliente cliente : clientes) {
			if(cliente.getId() == id) {
				return cliente;
			}
		}
		return null;
	}
	
	public Produto selecionarProduto(int id) {
		for (Produto produto : produtos) {
			if(produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}
	
	public void processoDePagamento(Cliente cliente, double total) {
		System.out.println("Processando o pagamento do cliente \n"+cliente);
		System.out.println("Pagamento aceito no Total de R$ "+total);
	}
	
	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}
	
}
