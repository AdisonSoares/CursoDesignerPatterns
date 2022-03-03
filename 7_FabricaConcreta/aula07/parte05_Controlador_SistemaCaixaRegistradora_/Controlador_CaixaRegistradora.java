package aula07.parte05_Controlador_SistemaCaixaRegistradora_;

import aula07.parte01_Adapter_SistemaContabil.Adapter_SistemaContabil_IBM_Adaptee;
import aula07.parte01_Adapter_SistemaContabil.Adapter_SistemaContabil_ItauTec_Adaptee;
import aula07.parte01_Adapter_SistemaContabil.Adapter_SistemaContabil_SAP_Adaptee;
import aula07.parte01_Adapter_SistemaContabil.IAdapter_SistemaContabil;
import aula07.parte03_Adapter_SistemaEstoque_.Adapter_SistemaEstoque_IBM_Adaptee;
import aula07.parte03_Adapter_SistemaEstoque_.Adapter_SistemaEstoque_ItauTec_Adaptee;
import aula07.parte03_Adapter_SistemaEstoque_.Adapter_SistemaEstoque_SAP_Adaptee;
import aula07.parte03_Adapter_SistemaEstoque_.IAdapter_SistemaEstoque;

public class Controlador_CaixaRegistradora {
	private IAdapter_SistemaContabil adapterSistemaContabil;
	private IAdapter_SistemaEstoque adapterSistemaEstoque;

	public Controlador_CaixaRegistradora() {
		System.out.println("Controlador caixa registradora criado\n");
	}

	public void criacaoAdapterSistemaCaixaRegistradoraContabil(String nome) {
		if (nome.equals("IBM")) {
			adapterSistemaContabil = new Adapter_SistemaContabil_IBM_Adaptee();
		} else if (nome.equals("ItauTec")) {
			adapterSistemaContabil = new Adapter_SistemaContabil_ItauTec_Adaptee();
		}else if (nome.equals("SAP")) {
			adapterSistemaContabil = new Adapter_SistemaContabil_SAP_Adaptee();
		}
	}

	public void criacaoAdapterSistemaCaixaRegistradoraEstoque(String nome) {
		if (nome.equals("IBM")) {
			adapterSistemaEstoque = new Adapter_SistemaEstoque_IBM_Adaptee();
		} else if (nome.equals("ItauTec")) {
			adapterSistemaEstoque = new Adapter_SistemaEstoque_ItauTec_Adaptee();
		}else if (nome.equals("SAP")) {
			adapterSistemaEstoque = new Adapter_SistemaEstoque_SAP_Adaptee();
		}
	}

	// Teste de integração com os dois sistemas adaptee
	// Estoque
	public void diminuirEstoque() {
		adapterSistemaEstoque.diminuirItem();
	}
	
	// Contabil
	public void registroVendaSistemaContabil() {
		adapterSistemaContabil.finalizarVenda();
	}

}
