package Aula04.parte02Interface_Conceito;

/**
 * @ClasseAbstrata em java pode ter qualquer variável e qualquer modificador de acesso
 * dosponivel sem nenhuma restrição, podem ter construtores que não podem ser 
 * instanciados diretamente, mas podem ser reaproveitadas por subclasses 
 * concretas da super classe abstrata.
 * 
 * @Caracteristicas_de_classes_abstratas em java é que caso não queira ou não precise
 * implementar todos os metodos das classes abstratas ou interfaces herdadas, 
 * pode-se ignorar a implementação transformando a classe simples
 * em uma classe abstrata.
 * 
 * @Regras_adicionais_classes_abstratas 
 * Uma classe abstrata pode ter tanto os métodos abstratos quanto métodos concretos sendo
 * de qualquer tipo não apenas publico, pode implementar qualquer quantidade de 
 * interfaces mas herda somente de uma classe concreta por meio de herança simples em java.
 * Podem ter construtores mas não podem ser instanciados diretamente, tendo essa funçao 
 * executada por suas classes filhas.
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
 * @MétodoConcreto possui implementação.
 * 
 * @MétodoAbstrato não possui implementação.
 */
public class ClasseConcreta extends Super_ClasseAbstrata implements Interface01 {

	public ClasseConcreta(String nome) {
		super(nome);
	}
	
	@Override
	public void metodoSuperInterface01() {
		System.out.println("metodoSuperInterface01");
		
	}

	@Override
	public void metodoSuperInterface02() {
		System.out.println("metodoSuperInterface02");
		
	}

	@Override
	public void metodo01Interface01() {
		System.out.println("metodo01Interface01");
		
	}

	@Override
	public void metodo02Interface01() {
		System.out.println("metodo02Interface01");
		
	}

	@Override
	public void metodo03Interface01() {
		System.out.println("metodo03Interface01");
		
	}

	@Override
	public void metodo04Interface01() {
		System.out.println("metodo04Interface01");
		
	}

	@Override
	public void metodo05Interface01() {
		System.out.println("metodo05Interface01");
		
	}

	@Override
	public void metodoAbstrato() {
		System.out.println("metodoAbstrato");
		
	}

}
