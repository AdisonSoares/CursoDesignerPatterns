package Aula04.parte01ClasseAbstrata_Conceito;

/**
 * @ClasseAbstrata em java pode ter qualquer vari�vel e qualquer modificador de acesso
 * dosponivel sem nenhuma restri��o, podem ter construtores que n�o podem ser 
 * instanciados diretamente, mas podem ser reaproveitadas por subclasses 
 * concretas da super classe abstrata.
 * 
 * @Caracteristicas_de_classes_abstratas em java � que caso n�o queira ou n�o precise
 * implementar todos os metodos das classes abstratas ou interfaces herdadas, 
 * pode-se ignorar a implementa��o transformando a classe simples
 * em uma classe abstrata.
 * 
 * @Regras_adicionais_classes_abstratas 
 * Uma classe abstrata pode ter tanto os m�todos abstratos quanto m�todos concretos sendo
 * de qualquer tipo n�o apenas publico, pode implementar qualquer quantidade de 
 * interfaces mas herda somente de uma classe concreta por meio de heran�a simples em java.
 * Podem ter construtores mas n�o podem ser instanciados diretamente, tendo essa fun�ao 
 * executada por suas classes filhas.
 * 
 * @Interfaces_e_ClassesAbstratas simplificam e tornam os designers mais fortes, ambas
 * podem ser instanciadas diretamente por outras classes.
 *
 * @Interface_de_uma_classe � o conjunto de m�todos e atributos que a classe, 
 * seja interface ou abstrata, permite que objetos de outras classes acessem.
 * 
 * @Programar_para_interface em java, significa tanto programar para uma interface quanto
 * para uma classe abstrata.
 * 
 * @InterfaceRepresenta um compromisso de que os m�todos executar�o as opera�oes impostas
 * por seus nomes, implementa��o � o c�digo que reside dentro desses m�todos.
 * 
 * @Entendimento_de_uma_interface, em java, se d� por meio de uma abstra��o,
 * separando o que ela deve fazer de sua implementa��o, como o objeto deve fazer.
 * 
 * @M�todoConcreto possui implementa��o.
 * 
 * @M�todoAbstrato n�o possui implementa��o.
 */
public abstract class ClasseAbstrata01 extends Super_ClasseAbstrata implements Interface01{
	public ClasseAbstrata01(String nome) {
		super(nome);
	}
}
