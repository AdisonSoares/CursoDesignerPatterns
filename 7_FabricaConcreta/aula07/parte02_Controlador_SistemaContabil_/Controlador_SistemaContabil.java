package aula07.parte02_Controlador_SistemaContabil_;
import aula07.parte01_Adapter_SistemaContabil_.Adapter_SistemaContabil_IBM_Adaptee;
import aula07.parte01_Adapter_SistemaContabil_.Adapter_SistemaContabil_ItauTec_Adaptee;
import aula07.parte01_Adapter_SistemaContabil_.IAdapter_SistemaContabil;

public class Controlador_SistemaContabil {
	private IAdapter_SistemaContabil adapterSistemaContabil;

	@SuppressWarnings("unused")
	private void adapterSistemaContabil() {
		System.out.println("Adapter do sistema contabil criado");
	}

	// Objeto externo - IBM ou ItauTec
	public void criacaoAdapterSistemaContabil(String nome) {
		if (nome.equals("IBM")) {
			adapterSistemaContabil = new Adapter_SistemaContabil_IBM_Adaptee();
		} else if (nome.equals("ItauTec")) {
			adapterSistemaContabil = new Adapter_SistemaContabil_ItauTec_Adaptee();
		}
	}

	// Calculo no sistema externo delegando ao adaptador
	public void calculoImpostoControlador() {
		adapterSistemaContabil.registrarImposto();
	}
}
