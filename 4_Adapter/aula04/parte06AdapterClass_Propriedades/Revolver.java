package aula04.parte06AdapterClass_Propriedades;

public class Revolver implements IArma_Target {

	@Override
	public void carregar() {
		System.out.println("Carregando o revolver");
		System.out.println();
	}

	@Override
	public void atirar() {
		System.out.println("Atirando com o revolver");
		System.out.println();
	}

	@Override
	public void mirar() {
		System.out.println("Mirando com o revolver");
		System.out.println();
	}

}
