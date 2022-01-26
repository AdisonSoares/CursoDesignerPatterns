package Aula04.parte01ClasseAbstrata_Conceito;

/**
 * @PrimeiraRegraInterfaces n�o se pode ter construtores, todos os m�todos s�o
 * abstratos por padr�o, por esse motivo n�o possuem implementa��o.
 * 
 * @Heran�a_em_interface, acontece quando se herda as assinaturas dos m�todos 
 * definidos na super interface.
 * 
 * @Vari�veis_em_interface podem ser apenas constantes.
 * 
 * @M�todos s�o publicos e abstratos mesmo que n�o sejam 
 * assim declarados explicitamente.
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
 * @Regras_adicionais_interface
 * Deve-se usar interfaces para declarar m�todos que uma ou mais classes devem
 * implementar e para exibi��o da inteface do objeto sem revelar o conteudo 
 * da classe, um interface tamb�m serve para capturar as semelhan�as entre classes
 * que n�o s�o relacionadas, e para simular heran�a multipla em java declarando 
 * que uma classe herda de uma super classe e implementa diversas interfaces 
 * tornando essa simula��o possivel.
 * 
 * @M�todoConcreto possui implementa��o.
 * 
 * @M�todoAbstrato n�o possui implementa��o.
 */
public interface Interface02 {
	public static final int CONSTANTE02 = 2;
	public int CONSTANTE03 = 3;
	
	void metodo01Interface02();
	public void metodo02Interface02();
}
