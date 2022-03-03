package aula07.parte07_Controlador_SistemaGeral_;

import aula07.parte01_Adapter_SistemaContabil_.Adapter_SistemaContabil_IBM_Adaptee;
import aula07.parte01_Adapter_SistemaContabil_.Adapter_SistemaContabil_ItauTec_Adaptee;
import aula07.parte01_Adapter_SistemaContabil_.Adapter_SistemaContabil_SAP_Adaptee;
import aula07.parte01_Adapter_SistemaContabil_.IAdapter_SistemaContabil;

/**
 * @Problema_fabrica_concreta
 * Ao iterar um novo sistema adaptee é preciso atualizar
 * sempre os controladores não se consegue desacoplar as 
 * variaçoes da criação de objetos para resolver isso
 * é preciso usar a fabrica concreta.
 */
public class Controlador_SistemaContabil {
	private IAdapter_SistemaContabil adapterSistemaContabil;

	@SuppressWarnings("unused")
	private void adapterSistemaContabil() {
		System.out.println("Adapter do sistema contabil criado");
	}

	// Objeto externo - IBM, ItauTec ou SAP
	public void criacaoAdapterSistemaContabil(String nome) {
		if (nome.equals("IBM")) {
			adapterSistemaContabil = new Adapter_SistemaContabil_IBM_Adaptee();
		} else if (nome.equals("ItauTec")) {
			adapterSistemaContabil = new Adapter_SistemaContabil_ItauTec_Adaptee();
		} else if (nome.equals("SAP")) {
			adapterSistemaContabil = new Adapter_SistemaContabil_SAP_Adaptee();
		}
	}

	// Calculo no sistema externo delegando ao adaptador
	public void calculoImpostoControlador() {
		adapterSistemaContabil.registrarImposto();
	}
}
