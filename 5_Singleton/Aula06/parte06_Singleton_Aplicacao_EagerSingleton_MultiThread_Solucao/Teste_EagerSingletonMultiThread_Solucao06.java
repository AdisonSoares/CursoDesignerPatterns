package Aula06.parte06_Singleton_Aplicacao_EagerSingleton_MultiThread_Solucao;


/**
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
 * 
 * @SolucaoProblemaLazySingletonMultiThread
 * Adicionar a palavra reservada synchronized na assinatura do método que 
 * retorna a instancia unica do singleton, para prevenir que multiplas 
 * threads não criem mais de uma instancia do singleton.
 * 
 * @Synchronized é o método em java para não duplicar a ação de um singleton
 * por outras threads, agindo como um mecanismo de trava, para não ter o 
 * risco do retorno de mais de um objetos para cada thread.
 * 
 * @ProblemaSynchronized
 * Acontece uma queda de desempenho na aplicação, o unico momento que  se precisa da
 * sincronização é quando entra pela primeira vez no método.
 * O método sincronizado continua sendo usado nas outras chamadas do método
 * mesmo não precisando.
 * 
 * @SolucaoContinuarSynchronized caso a performance do sistema não seja problema.
 *
 * @SolucaoUsarSingletonEager(Contrario de preguiçoso) caso o comprometimento da performance tenha peso,
 * deixando a estratégia lazy.
 * 
 * @EagerSingleton já atribui uma instancia do objeto dentro
 * da classe controle que retorna a instancia, não precisando
 * fazer o teste se é a primeira vez que a instancia é retornada
 * por meio do getInstancia, pois o mesmo será iniciada
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
