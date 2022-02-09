package aula07.parte04_Controlador_SistemaEstoque;

public class TesteControladorEstoque02__ {
	public static void testeSistemaEstoqueControlador() {
	
		Controlador_SistemaEstoque__ controladorSistemaEstoque;
		controladorSistemaEstoque = new Controlador_SistemaEstoque__();
		
		System.out.println("Testando a integração do sistema estoque ItauTec");
		controladorSistemaEstoque.criacaoAdapterSistemaEstoque("ItauTec");
		controladorSistemaEstoque.atualizarEstoque();
		
		
		System.out.println("Testando a integração do sistema estoque IBM");
		controladorSistemaEstoque.criacaoAdapterSistemaEstoque("IBM");
		controladorSistemaEstoque.atualizarEstoque();

	}
	
	public static void main(String[] args) {
		testeSistemaEstoqueControlador();
	}
}
















