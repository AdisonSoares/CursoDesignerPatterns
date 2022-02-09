package aula07.parte02_Controlador_SistemaContabil;

public class TesteControladorContabil01__ {
	public static void testeSistemaContabilControlador() {
		System.out.println("Controlador contabil criado\n");
		Controlador_SistemaContabil__ controladorSistemaContabil;
		controladorSistemaContabil = new Controlador_SistemaContabil__();
		
		System.out.println("Testando a integração do sistema contabil ItauTec");
		controladorSistemaContabil.criacaoAdapterSistemaContabil("ItauTec");
		controladorSistemaContabil.calculoImpostoControlador();
		
		
		System.out.println("Testando a integração do sistema contabil IBM");
		controladorSistemaContabil.criacaoAdapterSistemaContabil("IBM");
		controladorSistemaContabil.calculoImpostoControlador();

	}
	
	public static void main(String[] args) {
		testeSistemaContabilControlador();
	}
}
















