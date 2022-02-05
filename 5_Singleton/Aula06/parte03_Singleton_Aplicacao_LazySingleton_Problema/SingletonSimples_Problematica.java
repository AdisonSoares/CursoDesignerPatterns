 package Aula06.parte03_Singleton_Aplicacao_LazySingleton_Problema;

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
 * @Objetivo_do_singleton � ter uma instancia unica de uma classe e fornecer um 
 * ponto de acesso global a essa instancia.
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
 * 
 * @LazySingleton - Singleton pregui�oso
 *
 * @Teste para ver se as duas instancias criadas apontam para o mesmo
 * objeto, quando se colocar duas igualdades ser� verdadeiro se ambas
 * as referencias comparadas apontarem para o mesmo objeto. 
 *
 * @Problematica
 * O resultado do teste mostra que as duas inst�ncias s�o diferentes
 * quebrando o principio do designer de se ter apenas um objeto sendo
 * manipulado dentro de sua classe de controle e n�o fora.
 *
 * @Motivo_da_falha
 * Mesmo n�o instanciando diretamente um objeto usando o new e sim
 * o getInstancia, existe a cria��o de um novo objeto dentro da classe,
 * pois cada vez se instancia a fun��o getInstancia, na classe de
 * controle � feito um new instancia criando um novo objeto,
 * por esse motivo o teste de compara��o de objetos foi falho. 
 */
public class SingletonSimples_Problematica {
	private SingletonSimples_Problematica() {
		
	}
	
	public static SingletonSimples_Problematica getInstancia() {
		return new SingletonSimples_Problematica();
	}
}
