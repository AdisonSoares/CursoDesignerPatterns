package Aula04.parte06AdapterClass_Propriedades;

public class Pistola implements Arma_Target {

	@Override
	public void carregar() {
		System.out.println("Carregando a pistola");
		System.out.println();
	}

	@Override
	public void atirar() {
		System.out.println("Atirando com a pistola");
		System.out.println();
	}

	@Override
	public void mirar() {
		System.out.println("Mirando com a pistola");
		System.out.println();
	}

}
