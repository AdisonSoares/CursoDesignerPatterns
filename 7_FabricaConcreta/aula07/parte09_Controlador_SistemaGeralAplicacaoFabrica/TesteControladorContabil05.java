package aula07.parte09_Controlador_SistemaGeralAplicacaoFabrica;

public class TesteControladorContabil05 {
	public static void testeSistemaContabilControlador() {
		System.out.println("Controlador contabil criado\n");
		Controlador_SistemaContabil controladorSistemaContabil;
		controladorSistemaContabil = new Controlador_SistemaContabil();
		
		System.out.println("Testando a integração do sistema contabil ItauTec");
		controladorSistemaContabil.criacaoAdapterSistemaContabil("ItauTec");
		//controladorSistemaContabil.calculoImpostoControlador();
		
		
		System.out.println("Testando a integração do sistema contabil IBM");
		controladorSistemaContabil.criacaoAdapterSistemaContabil("IBM");
		//controladorSistemaContabil.calculoImpostoControlador();
		
		System.out.println("Testando a integração do sistema contabil SAP");
		controladorSistemaContabil.criacaoAdapterSistemaContabil("SAP");
		//controladorSistemaContabil.calculoImpostoControlador();
		
		//Exibir
		controladorSistemaContabil.calculoImpostoControlador();

	}
	
	public static void main(String[] args) {
		testeSistemaContabilControlador();
	}
}
















