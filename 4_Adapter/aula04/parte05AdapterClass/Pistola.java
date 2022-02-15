package aula04.parte05AdapterClass;

public class Pistola implements IArma {

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
