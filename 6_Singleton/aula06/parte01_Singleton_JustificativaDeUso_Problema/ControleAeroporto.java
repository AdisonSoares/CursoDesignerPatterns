package aula06.parte01_Singleton_JustificativaDeUso_Problema;
//Pattern atual Fábrica Concreta.

/**
 * @SegredoDoSingleton é criar métodos e variaveis estaticas que vão controlar
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
			System.out.println("Permissão para outro avião pousar negada!");
		}
	}
	
	public void solicitarPermissaoDecolar() {
		if (permissaoDecolar) {
			System.out.println("Permitida a decolagem!");
			permissaoDecolar = false;
			permissaoPousar = true;
		} else {
			System.out.println("Permissão para outro avião decolar negada!");
		}
	}
}
