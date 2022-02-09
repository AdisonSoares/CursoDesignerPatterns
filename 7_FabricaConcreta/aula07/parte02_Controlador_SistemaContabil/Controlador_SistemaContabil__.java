package aula07.parte02_Controlador_SistemaContabil;
import aula07.parte01_Adapter_SistemaContabil.Adapter_SistemaContabil_IBM_Adaptee_;
import aula07.parte01_Adapter_SistemaContabil.Adapter_SistemaContabil_ItauTec_Adaptee_;
import aula07.parte01_Adapter_SistemaContabil.IAdapter_SistemaContabil__;

public class Controlador_SistemaContabil__ {
	private IAdapter_SistemaContabil__ adapterSistemaContabil;

	@SuppressWarnings("unused")
	private void adapterSistemaContabil() {
		System.out.println("Adapter do sistema contabil criado");
	}

	// Objeto externo - IBM ou ItauTec
	public void criacaoAdapterSistemaContabil(String nome) {
		if (nome.equals("IBM")) {
			adapterSistemaContabil = new Adapter_SistemaContabil_IBM_Adaptee_();
		} else if (nome.equals("ItauTec")) {
			adapterSistemaContabil = new Adapter_SistemaContabil_ItauTec_Adaptee_();
		}
	}

	// Calculo no sistema externo delegando ao adaptador
	public void calculoImpostoControlador() {
		adapterSistemaContabil.registrarImposto();
	}
}
