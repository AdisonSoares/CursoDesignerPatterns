package Aula04.parte06AdapterClass_Propriedades;

public class Teste03_AdapterClass_Propriedades {
	public static void main(String[] args) {
		// Declarando os objetos
		Arma_Target revolver, pistola, rifle, espingardaAdapter;
		Arma_Target armaGenerica;
		Personagem_Cliente rambo;

		// Inicializando o objeto arma
		armaGenerica = new ArmaGenerica();
		revolver = new Revolver();
		pistola = new Pistola();
		rifle = new Rifle();
		espingardaAdapter = new Espingarda_Adapter();

		// Inicializando o objeto personagem
		rambo = new Personagem_Cliente("Rambo", armaGenerica);

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

		// Inicializando o objeto personagem com uma arma especifica Adapter
		rambo.setArma(espingardaAdapter);
		System.out.println("-----" + rambo.getNome() + " usando a espingarda -----");
		System.out.println();

		// Métodos da classe revolver do personagem criado
		rambo.carregarArma();
		rambo.mirarArma();
		rambo.usarArma();
		System.out.println();

	}
}
