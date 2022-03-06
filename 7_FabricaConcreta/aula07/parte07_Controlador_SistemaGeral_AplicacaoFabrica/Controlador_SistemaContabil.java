package aula07.parte07_Controlador_SistemaGeral_AplicacaoFabrica;

import aula07.parte06_Adapter_SistemaGeral_AplicacaoFabrica.Adapter_Fabrica;
import aula07.parte06_Adapter_SistemaGeral_AplicacaoFabrica.Adapter_SistemaContabil;

/**
 * @Problema_fabrica_concreta
 * Ao iterar um novo sistema adaptee é preciso atualizar
 * sempre os controladores não se consegue desacoplar as 
 * variaçoes da criação de objetos para resolver isso
 * é preciso usar a fabrica concreta.
 * 
 * @Duplicacao_de_codigo
 * Os três controladores estão duplicando o teste para criação 
 * dos adapters externos.
 * 
 * @Solução_Adapter_Fabrica
 */
public class Controlador_SistemaContabil {
	private Adapter_SistemaContabil adapterSistemaContabil;
	private Adapter_Fabrica adapterFabrica;
	
	public Controlador_SistemaContabil() {
		adapterFabrica = new Adapter_Fabrica();
	}

	@SuppressWarnings("unused")
	private void adapterSistemaContabil() {
		System.out.println("Adapter do sistema contabil criado");
	}

	// Objeto externo - IBM, ItauTec ou SAP
	public void criacaoAdapterSistemaContabil(String nome) {
		adapterSistemaContabil = adapterFabrica.criacaoAdapterSistemaContabil(nome);
	}

	// Calculo no sistema externo delegando ao adaptador
	public void calculoImpostoControlador() {
		adapterSistemaContabil.registrarImposto();
	}
}
