package Aula06.parte03_Singleton_Aplicacao_LazySingleton_Problema;

/**
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
 */
public class Teste_SingletonSimplesProblematica03 {
	public static void main(String[] args) {
		SingletonSimples_Problematica singletonSimples_Problematica01 = SingletonSimples_Problematica.getInstancia();
		SingletonSimples_Problematica singletonSimples_Problematica02 = SingletonSimples_Problematica.getInstancia();
		
		//Operador ternario para o teste
		System.out.println(singletonSimples_Problematica01==singletonSimples_Problematica02 ? "Instancias/objetos iguais" : "Instancias/objetos diferentes");
	}
}
