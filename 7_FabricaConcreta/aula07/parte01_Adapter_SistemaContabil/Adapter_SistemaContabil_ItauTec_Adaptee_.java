package aula07.parte01_Adapter_SistemaContabil;

import aula07.parte01_Adaptee_SistemaContabil.SistemaContabilAdaptee;

public class Adapter_SistemaContabil_ItauTec_Adaptee_ implements IAdapter_SistemaContabil__{
	private SistemaContabilAdaptee sistemaContabilAdaptee;
	
	
	public Adapter_SistemaContabil_ItauTec_Adaptee_() {
		sistemaContabilAdaptee= new SistemaContabilAdaptee("ItauTec");
	}
	
	@Override
	public void finalizarVenda() {
		sistemaContabilAdaptee.registroVenda();
	}

	@Override
	public void registrarImposto() {
		sistemaContabilAdaptee.calculoImposto();
		
	}

}
