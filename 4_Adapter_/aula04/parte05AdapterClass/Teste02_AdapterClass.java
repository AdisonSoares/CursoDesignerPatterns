package aula04.parte05AdapterClass;

public class Teste02_AdapterClass {
	public static void main(String[] args) {
		// Declarando os objetos
		IArma revolver, pistola, rifle, armaGenerica;
		Personagem rambo;
		
		// Inicializando o objeto arma
		armaGenerica = new ArmaGenerica();
		revolver = new Revolver();
		pistola = new Pistola();
		rifle = new Rifle();
		
		//Inicializando o objeto personagem
		rambo = new Personagem("Rambo", armaGenerica);

		// Inicializando o objeto personagem com uma arma especifica
		rambo.setArma(revolver);
		System.out.println("-----" + rambo.getNome() + " usando o revolver -----");
		System.out.println();

		// Métodos da classe revolver do personagem criado
		rambo.carregarArma();
		rambo.mirarArma();
		rambo.usarArma();
		System.out.println();

		// Inicializando o objeto personagem com uma arma especifica
		rambo.setArma(pistola);
		System.out.println("-----" + rambo.getNome() + " usando a pistola -----");
		System.out.println();

		// Métodos da classe revolver do personagem criado
		rambo.carregarArma();
		rambo.mirarArma();
		rambo.usarArma();
		System.out.println();

		// Inicializando o objeto personagem com uma arma especifica
		rambo.setArma(rifle);
		System.out.println("-----" + rambo.getNome() + " usando o rifle -----");
		System.out.println();

		// Métodos da classe revolver do personagem criado
		rambo.carregarArma();
		rambo.mirarArma();
		rambo.usarArma();

	}
}
