package aula07.parte07_Controlador_SistemaGeral;

import aula07.parte03_Adapter_SistemaEstoque.Adapter_SistemaEstoque_IBM_Adaptee;
import aula07.parte03_Adapter_SistemaEstoque.Adapter_SistemaEstoque_ItauTec_Adaptee;
import aula07.parte06_Adapter_SistemaGeral.Adapter_SistemaEstoque_SAP_Adaptee;

/**
 * @Problema_fabrica_concreta
 * Ao iterar um novo sistema adaptee é preciso atualizar
 * sempre os controladores não se consegue desacoplar as 
 * variaçoes da criação de objetos para resolver isso
 * é preciso usar a fabrica concreta.
 */
public class Controlador_SistemaEstoque {
	private Adapter_SistemaEstoque_IBM_Adaptee adapterSistemaEstoqueIBM;
	private Adapter_SistemaEstoque_ItauTec_Adaptee adapterSistemaEstoqueItauTec;
	private Adapter_SistemaEstoque_SAP_Adaptee adapterSistemaEstoqueSAP;

	public Controlador_SistemaEstoque() {
		System.out.println("Controlador de estoque criado\n");
	}

	// Objeto externo - IBM ou ItauTec
	public void criacaoAdapterSistemaEstoque(String nome) {
		if (nome.equals("IBM")) {
			adapterSistemaEstoqueIBM = new Adapter_SistemaEstoque_IBM_Adaptee();
		} else if (nome.equals("ItauTec")) {
			adapterSistemaEstoqueItauTec = new Adapter_SistemaEstoque_ItauTec_Adaptee();
		} else if (nome.equals("SAP")) {
			adapterSistemaEstoqueSAP = new Adapter_SistemaEstoque_SAP_Adaptee();
		}
	}

	// Controle de fluxo da aplicação do usuario
	public void atualizarEstoque() {
		adapterSistemaEstoqueIBM.atualizarItem();
		adapterSistemaEstoqueItauTec.atualizarItem();
		adapterSistemaEstoqueSAP.atualizarItem();
	}
}
