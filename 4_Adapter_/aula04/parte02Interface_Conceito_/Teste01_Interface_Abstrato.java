package aula04.parte02Interface_Conceito_;

/**
 * 
 * @Não_é_possível_instanciar classe abstrata ou interface, mesmo possuindo
 * construtores.
 * 
 * @É_possível_invocar o construtor de uma classe concreta, que é uma 
 * classe simples que implementa classes abstratas e interfaces.
 *
 * @Uso_de_implementação concreta é aconselhável, pois é a melhor 
 * escolha para se aproveitar o polimorfismo, pelo principio de 
 * se programar para interface.
 * 
 * @TratarObjeto a partir de uma referencia de super classe caracteriza
 * o polimorfismo,"Super_ClasseAbstrata superClasseAbstrata(super classe) =
 * new ClasseConcreta01("Nome02");(objeto)". O mesmo efeito pode
 * ser alcançado por meio de uma interface.
 * 
 * @Constantes definidas nas interfaces podem ser acessadas por serem públicas.                                   
 *
 */
public class Teste01_Interface_Abstrato {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//Instanciando classes concretas por meio de polimorfismo
		ClasseConcreta classeConcreta01 = new ClasseConcreta("Nome01");
		ClasseConcreta classeConcreta02 = new ClasseConcreta("Nome02");
		Super_ClasseAbstrata superClasseAbstrata = new ClasseConcreta("Nome03");
		ISuperInterface01 superInterface01 = new ClasseConcreta("Nome04"); 
		
		//Acessando as constantes de intefaces
		System.out.println("Valor constante Interface01: "+IInterface01.CONSTANTE01);
		System.out.println("Valor 01 constante Interface02: "+IInterface02.CONSTANTE02);
		System.out.println("Valor 02 constante Interface02: "+IInterface02.CONSTANTE03);
		System.out.println();
		
		//Acessando os métodos das classes abstratas e interfaces a partir de um objeto concreto
		classeConcreta01.metodo01Interface01();
		classeConcreta01.metodo02Interface01();
		classeConcreta01.metodo03Interface01();
		classeConcreta01.metodo04Interface01();
		classeConcreta01.metodo05Interface01();
		System.out.println();
		
		classeConcreta01.metodoSuperInterface01();
		classeConcreta01.metodoSuperInterface02();
		System.out.println();
		
		classeConcreta01.metodoAbstrato();
		classeConcreta01.metodoConcreto();
		System.out.println();
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
