package aula04.parte01ClasseAbstrata_Conceito_;

/**
 * @ClasseAbstrata em java pode ter qualquer vari�vel e qualquer modificador
 * de acesso disponivel sem nenhuma restri��o, podem ter construtores que
 * n�o podem ser instanciados diretamente, mas podem ser reaproveitadas
 * por subclasses concretas da super classe abstrata.
 * 
 * @Caracteristicas_de_classes_abstratas em java � que caso n�o queira ou
 * n�o precise implementar todos os metodos das classes abstratas ou 
 * interfaces herdadas, pode-se ignorar a implementa��o transformando 
 * a classe simples em uma classe abstrata.
 * 
 * @Interfaces_e_ClassesAbstratas simplificam e tornam os designers mais
 * fortes, ambas podem ser instanciadas diretamente por outras classes.
 *
 * @Interface_de_uma_classe � o conjunto de m�todos e atributos que a classe, 
 * seja interface ou abstrata, permite que objetos de outras classes acessem.
 * 
 * @Programar_para_interface em java, significa tanto programar para uma
 * interface quanto para uma classe abstrata.
 * 
 * @InterfaceRepresenta um compromisso de que os m�todos executar�o as 
 * opera�oes impostas por seus nomes, implementa��o � o c�digo que
 * reside dentro desses m�todos.
 * 
 * @Entendimento_de_uma_interface, em java, se d� por meio de uma abstra��o,
 * separando o que ela deve fazer de sua implementa��o, como o objeto deve 
 * fazer.
 * 
 * @M�todoConcreto possui implementa��o.
 * 
 * @M�todoAbstrato n�o possui implementa��o.
 */
public class ClasseConcreta01 extends Super_ClasseAbstrata implements Interface01 {

	public ClasseConcreta01(String nome) {
		super(nome);
	}
	
	@Override
	public void metodoSuperInterface01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodoSuperInterface02() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodo01Interface01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodo02Interface01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodo03Interface01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodo04Interface01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodo05Interface01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodoAbstrato() {
		// TODO Auto-generated method stub
		
	}

}
