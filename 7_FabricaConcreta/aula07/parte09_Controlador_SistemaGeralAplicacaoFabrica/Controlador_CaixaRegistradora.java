package aula07.parte09_Controlador_SistemaGeralAplicacaoFabrica;

import aula07.parte01_Adapter_SistemaContabil.Adapter_SistemaContabil_IBM_Adaptee;
import aula07.parte01_Adapter_SistemaContabil.Adapter_SistemaContabil_ItauTec_Adaptee;
import aula07.parte01_Adapter_SistemaContabil.Adapter_SistemaContabil_SAP_Adaptee;
import aula07.parte03_Adapter_SistemaEstoque.Adapter_SistemaEstoque_IBM_Adaptee;
import aula07.parte03_Adapter_SistemaEstoque.Adapter_SistemaEstoque_ItauTec_Adaptee;
import aula07.parte03_Adapter_SistemaEstoque.Adapter_SistemaEstoque_SAP_Adaptee;

/**
 * @Problema_fabrica_concreta
 * Ao iterar um novo sistema adaptee � preciso atualizar
 * sempre os controladores n�o se consegue desacoplar as 
 * varia�oes da cria��o de objetos para resolver isso
 * � preciso usar a fabrica concreta.
 * 
 * @Duplicacao_de_codigo
 * Os tr�s controladores est�o duplicando o teste para cria��o 
 * dos adapters externos.
 */
public class Controlador_CaixaRegistradora {
	private Adapter_SistemaContabil_IBM_Adaptee adapterSistemaContabilIBM;
	private Adapter_SistemaContabil_ItauTec_Adaptee adapterSistemaContabilItauTec;
	private Adapter_SistemaContabil_SAP_Adaptee adapterSistemaContabilSAP;
	
	private Adapter_SistemaEstoque_IBM_Adaptee adapterSistemaEstoqueIBM;
	private Adapter_SistemaEstoque_ItauTec_Adaptee adapterSistemaEstoqueItauTec;
	private Adapter_SistemaEstoque_SAP_Adaptee adapterSistemaEstoqueSAP;

	public Controlador_CaixaRegistradora() {
		System.out.println("Controlador caixa registradora criado\n");
	}

	public void criacaoAdapterSistemaCaixaRegistradoraContabil(String nome) {
		if (nome.equals("IBM")) {
			adapterSistemaContabilIBM = new Adapter_SistemaContabil_IBM_Adaptee();
		} else if (nome.equals("ItauTec")) {
			adapterSistemaContabilItauTec = new Adapter_SistemaContabil_ItauTec_Adaptee();
		}else if (nome.equals("SAP")) {
			adapterSistemaContabilSAP = new Adapter_SistemaContabil_SAP_Adaptee();
		}
	}

	public void criacaoAdapterSistemaCaixaRegistradoraEstoque(String nome) {
		if (nome.equals("IBM")) {
			adapterSistemaEstoqueIBM = new Adapter_SistemaEstoque_IBM_Adaptee();
		} else if (nome.equals("ItauTec")) {
			adapterSistemaEstoqueItauTec = new Adapter_SistemaEstoque_ItauTec_Adaptee();
		}else if (nome.equals("SAP")) {
			adapterSistemaEstoqueSAP = new Adapter_SistemaEstoque_SAP_Adaptee();
		}
	}

	// Teste de integra��o com os dois sistemas adaptee
	// Estoque
	public void diminuirEstoque() {
		adapterSistemaEstoqueIBM.diminuirItem();
		adapterSistemaEstoqueItauTec.diminuirItem();
		adapterSistemaEstoqueSAP.diminuirItem();
	}
	
	// Contabil
	public void registroVendaSistemaContabil() {
		adapterSistemaContabilIBM.finalizarVenda();
		adapterSistemaContabilItauTec.finalizarVenda();
		adapterSistemaContabilSAP.finalizarVenda();
	}

}
