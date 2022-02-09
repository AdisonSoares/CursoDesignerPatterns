package aula07.parte04_Controlador_SistemaEstoque;
import aula07.parte03_Adapter_SistemaEstoque.Adapter_SistemaEstoque_IBM_Adaptee_;
import aula07.parte03_Adapter_SistemaEstoque.Adapter_SistemaEstoque_ItauTec_Adaptee_;
import aula07.parte03_Adapter_SistemaEstoque.IAdapter_SistemaEstoque__;

public class Controlador_SistemaEstoque__ {
	private IAdapter_SistemaEstoque__ adapterSistemaEstoque;
	
	public Controlador_SistemaEstoque__() {
		System.out.println("Controlador de estoque criado\n");
	}

	// Objeto externo - IBM ou ItauTec
	public void criacaoAdapterSistemaEstoque(String nome) {
		if (nome.equals("IBM")) {
			adapterSistemaEstoque = new Adapter_SistemaEstoque_IBM_Adaptee_();
		} else if (nome.equals("ItauTec")) {
			adapterSistemaEstoque = new Adapter_SistemaEstoque_ItauTec_Adaptee_();
		}
	}
	
	// Controle de fluxo da aplicação do usuario
	public void atualizarEstoque() {
		adapterSistemaEstoque.atualizarItem();
	}
}
