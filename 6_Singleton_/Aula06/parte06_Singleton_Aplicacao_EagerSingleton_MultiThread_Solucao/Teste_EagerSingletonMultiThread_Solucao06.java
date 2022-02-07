package Aula06.parte06_Singleton_Aplicacao_EagerSingleton_MultiThread_Solucao;


/**
 * @SolucaoLazySingleton
 * Instanciar o singleton quando for necess�rio
 *
 * @Aplicacao_da_solucao
 * � feito um teste condicional, caso seja a primeira vez que se esteja 
 * fazendo uma instancia por meio do getInstancia o retorno ser�
 * a cria��o da instancia, mas caso n�o seja a primeira vez
 * o get n�o vai fazer uma nova instancia mas retornar
 * a instancia criada anteriormente. 
 * 
 * @Condicao_da_solucaoLazySingleton
 * S� pode ser aplicado dentro de um ambiente que s� tenha uma thread
 * de execu��o, caso o ambiente de execu��o seja multithread, existe
 * o risco de retornar mais de uma instancia do objeto caso mais
 * de uma instancia seja criada, quebrando a regra principal do pattern.
 * 
 * @ProblemaLazySingleton de quebra do principio em ambientes multiThread,
 * pois cada thread vai processar o retorno getInstancia de forma autonoma
 * gerando em cada ciclo um objeto diferente na classe de controle singleton.
 * 
 * @SolucaoProblemaLazySingletonMultiThread
 * Adicionar a palavra reservada synchronized na assinatura do m�todo que 
 * retorna a instancia unica do singleton, para prevenir que multiplas 
 * threads n�o criem mais de uma instancia do singleton.
 * 
 * @Synchronized � o m�todo em java para n�o duplicar a a��o de um singleton
 * por outras threads, agindo como um mecanismo de trava, para n�o ter o 
 * risco do retorno de mais de um objetos para cada thread.
 * 
 * @ProblemaSynchronized
 * Acontece uma queda de desempenho na aplica��o, o unico momento que  se precisa da
 * sincroniza��o � quando entra pela primeira vez no m�todo.
 * O m�todo sincronizado continua sendo usado nas outras chamadas do m�todo
 * mesmo n�o precisando.
 * 
 * @SolucaoContinuarSynchronized caso a performance do sistema n�o seja problema.
 *
 * @SolucaoUsarSingletonEager(Contrario de pregui�oso) caso o comprometimento da performance tenha peso,
 * deixando a estrat�gia lazy.
 * 
 * @EagerSingleton j� atribui uma instancia do objeto dentro
 * da classe controle que retorna a instancia, n�o precisando
 * fazer o teste se � a primeira vez que a instancia � retornada
 * por meio do getInstancia, pois o mesmo ser� iniciada
 * pela primeira vez.
 */
public class Teste_EagerSingletonMultiThread_Solucao06 {
	public static void main(String[] args) {
		EagerSingleton_MultiThread_Solucao eagerSingleton01 = EagerSingleton_MultiThread_Solucao.getInstancia();
		EagerSingleton_MultiThread_Solucao eagerSingleton02 = EagerSingleton_MultiThread_Solucao.getInstancia();
		
		//Operador ternario para o teste
		System.out.println(eagerSingleton01==eagerSingleton02 ? "Instancias/objetos iguais" : "Instancias/objetos diferentes");
	}
}
