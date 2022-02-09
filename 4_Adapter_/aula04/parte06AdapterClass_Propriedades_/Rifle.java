package aula04.parte06AdapterClass_Propriedades_;

public class Rifle implements IArma_Target {

	@Override
	public void carregar() {
		System.out.println("Carregando o rifle");
		System.out.println();
	}

	@Override
	public void atirar() {
		System.out.println("Atirando com o rifle");
		System.out.println();
	}

	@Override
	public void mirar() {
		System.out.println("Mirando com o rifle");
		System.out.println();
	}

}
