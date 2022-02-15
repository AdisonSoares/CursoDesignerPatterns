package aula06.parte01_Singleton_JustificativaDeUso_Problema;
//Pattern atual F�brica Concreta.

/**
 * @SegredoDoSingleton � criar m�todos e variaveis estaticas que v�o controlar
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
 */
public class ControleAeroporto {
	private boolean permissaoPousar;//ToLand
	private boolean permissaoDecolar;//ToDeparture
	
	public ControleAeroporto() {
		permissaoPousar = false;
		permissaoDecolar = true;
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
