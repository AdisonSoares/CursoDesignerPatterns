package Aula06.parte05_Singleton_Aplicacao_LazySingleton_MultiThread_Solucao;


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
 */
public class Teste_LazySingletonMultiThread_Solucao05 {
	public static void main(String[] args) {
		LazySingleton_MultiThread_Solucao lazySingleton01 = LazySingleton_MultiThread_Solucao.getInstancia();
		LazySingleton_MultiThread_Solucao lazySingleton02 = LazySingleton_MultiThread_Solucao.getInstancia();
		
		//Operador ternario para o teste
		System.out.println(lazySingleton01==lazySingleton02 ? "Instancias/objetos iguais" : "Instancias/objetos diferentes");
	}
}
