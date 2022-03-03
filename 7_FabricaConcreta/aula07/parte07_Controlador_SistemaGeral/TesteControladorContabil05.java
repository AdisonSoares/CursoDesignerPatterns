package aula07.parte07_Controlador_SistemaGeral;

public class TesteControladorContabil05 {
	public static void testeSistemaContabilControlador() {
		System.out.println("Controlador contabil criado\n");
		Controlador_SistemaContabil controladorSistemaContabil;
		controladorSistemaContabil = new Controlador_SistemaContabil();
		
		System.out.println("Testando a integração do sistema contabil ItauTec");
		controladorSistemaContabil.criacaoAdapterSistemaContabil("ItauTec");
		controladorSistemaContabil.calculoImpostoControlador();
		
		
		System.out.println("Testando a integração do sistema contabil IBM");
		controladorSistemaContabil.criacaoAdapterSistemaContabil("IBM");
		controladorSistemaContabil.calculoImpostoControlador();
		
		System.out.println("Testando a integração do sistema contabil SAP");
		controladorSistemaContabil.criacaoAdapterSistemaContabil("SAP");
		controladorSistemaContabil.calculoImpostoControlador();

	}
	
	public static void main(String[] args) {
		testeSistemaContabilControlador();
	}
}
















