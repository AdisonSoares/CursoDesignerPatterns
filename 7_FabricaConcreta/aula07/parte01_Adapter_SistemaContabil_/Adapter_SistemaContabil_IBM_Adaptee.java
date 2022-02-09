package aula07.parte01_Adapter_SistemaContabil_;
import aula07.parte01_Adaptee_SistemaContabil.SistemaContabilAdaptee;
  
public class Adapter_SistemaContabil_IBM_Adaptee implements IAdapter_SistemaContabil{
	private SistemaContabilAdaptee sistemaContabilAdaptee;
	
	public Adapter_SistemaContabil_IBM_Adaptee() {
		sistemaContabilAdaptee= new SistemaContabilAdaptee("IBM");
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
