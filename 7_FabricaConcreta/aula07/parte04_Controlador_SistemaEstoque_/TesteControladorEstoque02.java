package aula07.parte04_Controlador_SistemaEstoque_;

public class TesteControladorEstoque02 {
	public static void testeSistemaEstoqueControlador() {
	
		Controlador_SistemaEstoque controladorSistemaEstoque;
		controladorSistemaEstoque = new Controlador_SistemaEstoque();
		
		System.out.println("Testando a integração do sistema estoque ItauTec");
		controladorSistemaEstoque.criacaoAdapterSistemaEstoque("ItauTec");
		controladorSistemaEstoque.atualizarEstoque();
		
		
		System.out.println("Testando a integração do sistema estoque IBM");
		controladorSistemaEstoque.criacaoAdapterSistemaEstoque("IBM");
		controladorSistemaEstoque.atualizarEstoque();
		
		System.out.println("Testando a integração do sistema estoque SAP");
		controladorSistemaEstoque.criacaoAdapterSistemaEstoque("SAP");
		controladorSistemaEstoque.atualizarEstoque();

	}
	
	public static void main(String[] args) {
		testeSistemaEstoqueControlador();
	}
}
















