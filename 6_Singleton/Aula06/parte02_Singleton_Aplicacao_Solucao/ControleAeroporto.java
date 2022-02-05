package Aula06.parte02_Singleton_Aplicacao_Solucao;

/**
 * @SegredoDoSingleton � criar m�todos e variaveis que v�o controlar
 * o acesso a instancia unica do objeto, ou seja, m�todos est�ticos que pertencem
 * somente a classe e n�o ao objeto que pode ser instanciado em outra classe.
 *
 * @GarantiaDeExclusividade
 * Para isso a classe singleton ser� est�tica, acessado somente pela pr�pria classe
 * e n�o pelo objeto, e principalmente ter� um construtor privado para impedir que
 * mais de uma instancia seja criada a partir dessa classe.  
 *
 * @Thread significa fio.
 * Uma pequena parte do programa que pode ser executado de forma independente
 * do programa principal, sendo uma forma de um processo se autodividir em duas
 * ou mais tarefas. � o termo em ingl�s para Linha ou Encadeamento de Execu��o.
 * Essas tarefas m�ltiplas podem ser executadas simultaneamente para rodar
 * mais r�pido do que um programa em um �nico bloco ou praticamente juntas,
 * mas que s�o t�o r�pidas que parecem estar trabalhando em conjunto ao mesmo tempo.
 *
 * @DesvantagemThread
 * Uma das desvantagens � que com v�rios threads o trabalho fica mais complexo, 
 * justamente por causa da intera��o que ocorre entre eles.
 *
 * @SistemaDecolagem
 * Funciona no controle de pouso e decolagem de avi�es, sendo que ao se permitir o
 * pouso de um avi�o n�o se pode permitir a decolagem, sendo que ao permitir a 
 * decolagem de outro avi�o n�o se pode permitir o pouso de outro, sendo feito
 * por apenas um controlador para unificar as respostas.
 *
 * @Problem�tica
 * O sistema n�o deveria permitir o pouso de um avi�o e depois o pouso de outro
 * ao mesmo tempo, pela l�gica criada caso um avi�o tivesse a permiss�o para pousar
 * outro avi�o n�o teria permiss�o para pousar apenas para decolar, e caso um avi�o
 * tivesse a permiss�o para decolar outro avi�o n�o poderia ter permiss�o para decolar
 * em seguida apenas se poderia dar permiss�o para pousar, mas ao rodar o programa a 
 * l�gica contraria do if � validade mas do else n�o � validada.
 *
 * @MaisDeUmControlador ao instanciar mais de um objeto � criado dois controladores 
 * independentes que n�o agem em conjunto trazendo um grande problema da falta de
 * comunica��o do sistema.
 *
 * @Solucao
 * O sistema de controle � unico e permite um ponto de acesso global, todos que 
 * precisam de permissao devem contactar um objeto unico e centralizado de
 * f�cil acesso.
 *
 * @Objetivo_do_singleton � ter uma instancia unica de uma classe e fornecer um 
 * ponto de acesso global a essa instancia.
 * 
 * 
 * @Variavel criada "private ControleAeroporto instance" para dar usar um new,
 * chamada estrat�gia eager, como o construtor � privado preciso instanciar o
 * objeto dentro da propria classe onde � definido
 * esse construtor.
 * 
 * @Objetivo_de_criar_um_objeto
 * Se o objetivo � ter apenas um objeto o melhor � dizer que a variavel � estatica,
 * ou seja, que pertence apenas a essa classe e n�o a determinada inst�ncia dessa classe.
 * 
 * @Variaveis_estaticas so podem ser acessados por contextos estaticos, ou 
 * m�todos estaticos, quando se precisar de uma inst�ncia n�o ser� preciso 
 * usar o new + classe acessada, criando um novo objeto, e sim acessar por 
 * meio de um m�todo estatico de retorno do objeto criado na classe de 
 * controle central, ou seja, instanciado na classe controle central e n�o na 
 * classe cliente.
 * 
 * @Para_acessar_a_classe_estatica que retorna o proprio objeto n�o � preciso 
 * usar o new, dentro da classe estatica, no lugar do new colocar o nome da
 * classe + .getInstancia(); m�todo estatico dessa forma ambos v�o apontar
 * ao mesmo objeto, agindo de forma sincronada. 
 */
public class ControleAeroporto {
	private boolean permissaoPousar;//ToLand
	private boolean permissaoDecolar;//ToDeparture
	private static ControleAeroporto instancia = new ControleAeroporto();
	
	private ControleAeroporto() {
		permissaoPousar = false;
		permissaoDecolar = true;
	}
	
	//Comunica��o do objeto para outras classes, sem precisar instanciar com new
	public static ControleAeroporto getInstancia() {
		return instancia;
	}
	
	public void solicitarPermissaoPousa() {
		if (permissaoPousar) {
			System.out.println("Permitido o pouso!");
			permissaoPousar = false;
			permissaoDecolar = true;
		} else {
			System.out.println("Permiss�o para outro avi�o pousar negada!");
		}
	}
	
	public void solicitarPermissaoDecolar() {
		if (permissaoDecolar) {
			System.out.println("Permitida a decolagem!");
			permissaoDecolar = false;
			permissaoPousar = true;
		} else {
			System.out.println("Permiss�o para outro avi�o decolar negada!");
		}
	}
}
