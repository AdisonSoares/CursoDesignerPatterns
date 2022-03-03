package aula07.parte04_Controlador_SistemaEstoque_;

import aula07.parte03_Adapter_SistemaEstoque.Adapter_SistemaEstoque_IBM_Adaptee;
import aula07.parte03_Adapter_SistemaEstoque.Adapter_SistemaEstoque_ItauTec_Adaptee;
import aula07.parte03_Adapter_SistemaEstoque.Adapter_SistemaEstoque_SAP_Adaptee;
import aula07.parte03_Adapter_SistemaEstoque.IAdapter_SistemaEstoque;

public class Controlador_SistemaEstoque {
	private IAdapter_SistemaEstoque adapterSistemaEstoque;

	public Controlador_SistemaEstoque() {
		System.out.println("Controlador de estoque criado\n");
	}

	// Objeto externo - IBM ou ItauTec
	public void criacaoAdapterSistemaEstoque(String nome) {
		if (nome.equals("IBM")) {
			adapterSistemaEstoque = new Adapter_SistemaEstoque_IBM_Adaptee();
		} else if (nome.equals("ItauTec")) {
			adapterSistemaEstoque = new Adapter_SistemaEstoque_ItauTec_Adaptee();
		} else if (nome.equals("SAP")) {
			adapterSistemaEstoque = new Adapter_SistemaEstoque_SAP_Adaptee();
		}
	}

	// Controle de fluxo da aplicação do usuario
	public void atualizarEstoque() {
		adapterSistemaEstoque.atualizarItem();
	}
}
