package aula04.parte06AdapterClass_Propriedades_;

public class Pistola implements IArma_Target {

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
