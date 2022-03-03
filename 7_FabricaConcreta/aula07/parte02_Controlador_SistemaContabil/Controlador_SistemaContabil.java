package aula07.parte02_Controlador_SistemaContabil;

import aula07.parte01_Adapter_SistemaContabil.Adapter_SistemaContabil_IBM_Adaptee;
import aula07.parte01_Adapter_SistemaContabil.Adapter_SistemaContabil_ItauTec_Adaptee;
import aula07.parte01_Adapter_SistemaContabil.Adapter_SistemaContabil_SAP_Adaptee;
import aula07.parte01_Adapter_SistemaContabil.IAdapter_SistemaContabil;

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
