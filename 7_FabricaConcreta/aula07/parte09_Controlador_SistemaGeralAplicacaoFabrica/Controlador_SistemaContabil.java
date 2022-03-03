package aula07.parte09_Controlador_SistemaGeralAplicacaoFabrica;

import aula07.parte06_Adapter_SistemaGeral.Adapter_SistemaContabil_IBM_Adaptee;
import aula07.parte06_Adapter_SistemaGeral.Adapter_SistemaContabil_ItauTec_Adaptee;
import aula07.parte06_Adapter_SistemaGeral.Adapter_SistemaContabil_SAP_Adaptee;

/**
 * @Problema_fabrica_concreta
 * Ao iterar um novo sistema adaptee é preciso atualizar
 * sempre os controladores não se consegue desacoplar as 
 * variaçoes da criação de objetos para resolver isso
 * é preciso usar a fabrica concreta.
 */
public class Controlador_SistemaContabil {
	private Adapter_SistemaContabil_IBM_Adaptee adapterSistemaContabilIBM;
	private Adapter_SistemaContabil_ItauTec_Adaptee adapterSistemaContabilItauTec;
	private Adapter_SistemaContabil_SAP_Adaptee adapterSistemaContabilSAP;

	@SuppressWarnings("unused")
	private void adapterSistemaContabil() {
		System.out.println("Adapter do sistema contabil criado");
	}

	// Objeto externo - IBM, ItauTec ou SAP
	public void criacaoAdapterSistemaContabil(String nome) {
		if (nome.equals("IBM")) {
			adapterSistemaContabilIBM = new Adapter_SistemaContabil_IBM_Adaptee();
		} else if (nome.equals("ItauTec")) {
			adapterSistemaContabilItauTec = new Adapter_SistemaContabil_ItauTec_Adaptee();
		} else if (nome.equals("SAP")) {
			adapterSistemaContabilSAP = new Adapter_SistemaContabil_SAP_Adaptee();
		}
	}

	// Calculo no sistema externo delegando ao adaptador
	public void calculoImpostoControlador() {
		adapterSistemaContabilIBM.registrarImposto();
		adapterSistemaContabilItauTec.registrarImposto();
		adapterSistemaContabilSAP.registrarImposto();
		
	}
}
