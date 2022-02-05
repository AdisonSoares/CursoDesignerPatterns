package Aula06.parte02_Singleton_Aplicacao_Solucao;


/**
 * @SegredoDoSingleton é criar métodos e variaveis que vão controlar
 * o acesso a instancia unica do objeto, ou seja, métodos estáticos que pertencem
 * somente a classe e não ao objeto que pode ser instanciado em outra classe.
 *
 * @GarantiaDeExclusividade
 * Para isso a classe singleton será estática, acessado somente pela própria classe
 * e não pelo objeto, e principalmente terá um construtor privado para impedir que
 * mais de uma instancia seja criada a partir dessa classe.  
 *
 * @Thread significa fio.
 * Uma pequena parte do programa que pode ser executado de forma independente
 * do programa principal, sendo uma forma de um processo se autodividir em duas
 * ou mais tarefas. É o termo em inglês para Linha ou Encadeamento de Execução.
 * Essas tarefas múltiplas podem ser executadas simultaneamente para rodar
 * mais rápido do que um programa em um único bloco ou praticamente juntas,
 * mas que são tão rápidas que parecem estar trabalhando em conjunto ao mesmo tempo.
 *
 * @DesvantagemThread
 * Uma das desvantagens é que com vários threads o trabalho fica mais complexo, 
 * justamente por causa da interação que ocorre entre eles.
 *
 * @SistemaDecolagem
 * Funciona no controle de pouso e decolagem de aviões, sendo que ao se permitir o
 * pouso de um avião não se pode permitir a decolagem, sendo que ao permitir a 
 * decolagem de outro avião não se pode permitir o pouso de outro, sendo feito
 * por apenas um controlador para unificar as respostas.
 *
 * @Problemática
 * O sistema não deveria permitir o pouso de um avião e depois o pouso de outro
 * ao mesmo tempo, pela lógica criada caso um avião tivesse a permissão para pousar
 * outro avião não teria permissão para pousar apenas para decolar, e caso um avião
 * tivesse a permissão para decolar outro avião não poderia ter permissão para decolar
 * em seguida apenas se poderia dar permissão para pousar, mas ao rodar o programa a 
 * lógica contraria do if é validade mas do else não é validada.
 *
 * @MaisDeUmControlador ao instanciar mais de um objeto é criado dois controladores 
 * independentes que não agem em conjunto trazendo um grande problema da falta de
 * comunicação do sistema.
 *
 * @Solucao
 * O sistema de controle é unico e permite um ponto de acesso global, todos que 
 * precisam de permissao devem contactar um objeto unico e centralizado de
 * fácil acesso.
 *
 * @Objetivo_do_singleton é ter uma instancia unica de uma classe e fornecer um 
 * ponto de acesso global a essa instancia.
 * 
 * 
 * @Variavel criada "private ControleAeroporto instance" para dar usar um new,
 * chamada estratégia eager, como o construtor é privado preciso instanciar o
 * objeto dentro da propria classe onde é definido
 * esse construtor.
 * 
 * @Objetivo_de_criar_um_objeto
 * Se o objetivo é ter apenas um objeto o melhor é dizer que a variavel é estatica,
 * ou seja, que pertence apenas a essa classe e não a determinada instância dessa classe.
 * 
 * @Variaveis_estaticas so podem ser acessados por contextos estaticos, ou 
 * métodos estaticos, quando se precisar de uma instância não será preciso 
 * usar o new + classe acessada, criando um novo objeto, e sim acessar por 
 * meio de um método estatico de retorno do objeto criado na classe de 
 * controle central, ou seja, instanciado na classe controle central e não na 
 * classe cliente.
 * 
 * @Para_acessar_a_classe_estatica que retorna o proprio objeto não é preciso 
 * usar o new, dentro da classe estatica, no lugar do new colocar o nome da
 * classe + .getInstancia(); método estatico dessa forma ambos vão apontar
 * ao mesmo objeto, agindo de forma sincronada. 
 */
public class Singleton_Simples {
	public static void main(String[] args) {
		
	}
	private Singleton_Simples() {
		
	}
	
	public static Singleton_Simples getInstancia() {
		return new Singleton_Simples();
	}
}
