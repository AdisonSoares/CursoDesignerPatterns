package aula06.parte04_Singleton_Aplicacao_LazySingleton_Solucao_;


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
 */
public class Teste_LazySingletonSolucao04 {
	public static void main(String[] args) {
		LazySingleton_Solucao lazySingleton01 = LazySingleton_Solucao.getInstancia();
		LazySingleton_Solucao lazySingleton02 = LazySingleton_Solucao.getInstancia();
		
		//Operador ternario para o teste
		System.out.println(lazySingleton01==lazySingleton02 ? "Instancias/objetos iguais" : "Instancias/objetos diferentes");
	}
}
