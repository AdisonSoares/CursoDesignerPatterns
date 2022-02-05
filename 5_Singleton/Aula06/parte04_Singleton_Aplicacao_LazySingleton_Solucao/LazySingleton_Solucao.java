 package Aula06.parte04_Singleton_Aplicacao_LazySingleton_Solucao;

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
 * @Objetivo_do_singleton é ter uma instancia unica de uma classe e fornecer um 
 * ponto de acesso global a essa instancia.
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
 * 
 * @LazySingleton - Singleton preguiçoso
 *
 * @Teste para ver se as duas instancias criadas apontam para o mesmo
 * objeto, quando se colocar duas igualdades será verdadeiro se ambas
 * as referencias comparadas apontarem para o mesmo objeto. 
 *
 * @Problematica
 * O resultado do teste mostra que as duas instâncias são diferentes
 * quebrando o principio do designer de se ter apenas um objeto sendo
 * manipulado dentro de sua classe de controle e não fora.
 *
 * @Motivo_da_falha
 * Mesmo não instanciando diretamente um objeto usando o new e sim
 * o getInstancia, existe a criação de um novo objeto dentro da classe,
 * pois cada vez se instancia a função getInstancia, na classe de
 * controle é feito um new instancia criando um novo objeto,
 * por esse motivo o teste de comparação de objetos foi falho.
 * 
 * @SolucaoLazySingleton
 * Instanciar o singleton quando for necessário
 *
 * @Aplicacao_da_solucao
 * É feito um teste condicional, caso seja a primeira vez que se esteja 
 * fazendo uma instancia por meio do getInstancia o retorno será
 * a criação da instancia, mas caso não seja a primeira vez
 * o get não vai fazer uma nova instancia mas retornar
 * a instancia criada anteriormente. 
 * 
 * @Condicao_da_solucaoLazySingleton
 * Só pode ser aplicado dentro de um ambiente que só tenha uma thread
 * de execução, caso o ambiente de execução seja multithread, existe
 * o risco de retornar mais de uma instancia do objeto caso mais
 * de uma instancia seja criada, quebrando a regra principal do pattern.
 * 
 * @ProblemaLazySingleton de quebra do principio em ambientes multiThread,
 * pois cada thread vai processar o retorno getInstancia de forma autonoma
 * gerando em cada ciclo um objeto diferente na classe de controle singleton. 
 */
public class LazySingleton_Solucao {
	private static LazySingleton_Solucao instancia;
		
	private LazySingleton_Solucao() {
	}
	
	public static LazySingleton_Solucao getInstancia() {
		if(instancia == null) {
			instancia = new LazySingleton_Solucao();
		}		
		return instancia;
	}
}	
