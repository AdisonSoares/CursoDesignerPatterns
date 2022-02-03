package Aula04.parte01ClasseAbstrata_Conceito;

/**
 * @PrimeiraRegraInterfaces não se pode ter construtores, todos os métodos são
 * abstratos por padrão, por esse motivo não possuem implementação.
 * 
 * @Herança_em_interface, acontece quando se herda as assinaturas dos métodos 
 * definidos na super interface.
 * 
 * @Variáveis_em_interface podem ser apenas constantes.
 * 
 * @Métodos são publicos e abstratos mesmo que não sejam 
 * assim declarados explicitamente.
 * 
 * @Interfaces_e_ClassesAbstratas simplificam e tornam os designers mais fortes, ambas
 * podem ser instanciadas diretamente por outras classes.
 *
 * @Interface_de_uma_classe é o conjunto de métodos e atributos que a classe, 
 * seja interface ou abstrata, permite que objetos de outras classes acessem.
 * 
 * @Programar_para_interface em java, significa tanto programar para uma interface quanto
 * para uma classe abstrata.
 * 
 * @InterfaceRepresenta um compromisso de que os métodos executarão as operaçoes impostas
 * por seus nomes, implementação é o código que reside dentro desses métodos.
 * 
 * @Entendimento_de_uma_interface, em java, se dá por meio de uma abstração,
 * separando o que ela deve fazer de sua implementação, como o objeto deve fazer.
 * 
 * @Regras_adicionais_interface
 * Deve-se usar interfaces para declarar métodos que uma ou mais classes devem
 * implementar e para exibição da inteface do objeto sem revelar o conteudo 
 * da classe, um interface também serve para capturar as semelhanças entre classes
 * que não são relacionadas, e para simular herança multipla em java declarando 
 * que uma classe herda de uma super classe e implementa diversas interfaces 
 * tornando essa simulação possivel.
 * 
 * @MétodoConcreto possui implementação.
 * 
 * @MétodoAbstrato não possui implementação.
 */
public interface Interface02 {
	public static final int CONSTANTE02 = 2;
	public int CONSTANTE03 = 3;
	
	void metodo01Interface02();
	public void metodo02Interface02();
}
