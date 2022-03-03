package aula07.parte07_Controlador_SistemaGeral_;

import aula07.parte01_Adapter_SistemaContabil_.Adapter_SistemaContabil_IBM_Adaptee;
import aula07.parte01_Adapter_SistemaContabil_.Adapter_SistemaContabil_ItauTec_Adaptee;
import aula07.parte01_Adapter_SistemaContabil_.Adapter_SistemaContabil_SAP_Adaptee;
import aula07.parte01_Adapter_SistemaContabil_.IAdapter_SistemaContabil;
import aula07.parte03_Adapter_SistemaEstoque_.Adapter_SistemaEstoque_IBM_Adaptee;
import aula07.parte03_Adapter_SistemaEstoque_.Adapter_SistemaEstoque_ItauTec_Adaptee;
import aula07.parte03_Adapter_SistemaEstoque_.Adapter_SistemaEstoque_SAP_Adaptee;
import aula07.parte03_Adapter_SistemaEstoque_.IAdapter_SistemaEstoque;

/**
 * @Problema_fabrica_concreta
 * Ao iterar um novo sistema adaptee � preciso atualizar
 * sempre os controladores n�o se consegue desacoplar as 
 * varia�oes da cria��o de objetos para resolver isso
 * � preciso usar a fabrica concreta.
 */
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

	// Teste de integra��o com os dois sistemas adaptee
	// Estoque
	public void diminuirEstoque() {
		adapterSistemaEstoque.diminuirItem();
	}
	
	// Contabil
	public void registroVendaSistemaContabil() {
		adapterSistemaContabil.finalizarVenda();
	}

}
