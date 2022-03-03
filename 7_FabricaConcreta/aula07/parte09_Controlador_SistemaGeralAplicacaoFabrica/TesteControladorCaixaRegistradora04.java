package aula07.parte09_Controlador_SistemaGeralAplicacaoFabrica;

public class TesteControladorCaixaRegistradora04 {
	public static void testeSistemaCaixaControlador() {
	
		Controlador_CaixaRegistradora controladorSistemaCaixaRegistradora;
		controladorSistemaCaixaRegistradora = new Controlador_CaixaRegistradora();
		
		System.out.println("Testando a integração do sistema estoque ItauTec");
		controladorSistemaCaixaRegistradora.criacaoAdapterSistemaCaixaRegistradoraEstoque("ItauTec");
		//controladorSistemaCaixaRegistradora.diminuirEstoque();
		
		
		System.out.println("Testando a integração do sistema estoque IBM");
		controladorSistemaCaixaRegistradora.criacaoAdapterSistemaCaixaRegistradoraEstoque("IBM");
		//controladorSistemaCaixaRegistradora.diminuirEstoque();
		
		System.out.println("Testando a integração do sistema estoque SAP");
		controladorSistemaCaixaRegistradora.criacaoAdapterSistemaCaixaRegistradoraEstoque("SAP");
		//controladorSistemaCaixaRegistradora.diminuirEstoque();
		
		System.out.println("Testando a integração do sistema contabil ItauTec");
		controladorSistemaCaixaRegistradora.criacaoAdapterSistemaCaixaRegistradoraContabil("ItauTec");
		//controladorSistemaCaixaRegistradora.registroVendaSistemaContabil();
		
		
		System.out.println("Testando a integração do sistema contabil IBM");
		controladorSistemaCaixaRegistradora.criacaoAdapterSistemaCaixaRegistradoraContabil("IBM");
		//controladorSistemaCaixaRegistradora.registroVendaSistemaContabil();
		
		System.out.println("Testando a integração do sistema contabil SAP");
		controladorSistemaCaixaRegistradora.criacaoAdapterSistemaCaixaRegistradoraContabil("SAP");
		//controladorSistemaCaixaRegistradora.registroVendaSistemaContabil();
		
		//Exibir
		controladorSistemaCaixaRegistradora.registroVendaSistemaContabil();
		controladorSistemaCaixaRegistradora.diminuirEstoque();
	}
	
	public static void main(String[] args) {
		testeSistemaCaixaControlador();
	}
}
















