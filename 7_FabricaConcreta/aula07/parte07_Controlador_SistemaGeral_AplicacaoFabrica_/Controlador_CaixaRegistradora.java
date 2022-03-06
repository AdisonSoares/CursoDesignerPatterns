package aula07.parte07_Controlador_SistemaGeral_AplicacaoFabrica_;

import aula07.parte06_Adapter_SistemaGeral_AplicacaoFabrica.Adapter_Fabrica;
import aula07.parte06_Adapter_SistemaGeral_AplicacaoFabrica.Adapter_SistemaContabil;
import aula07.parte06_Adapter_SistemaGeral_AplicacaoFabrica.Adapter_SistemaEstoque;

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
 * 
 * @Solu��o_Adapter_Fabrica
 */
public class Controlador_CaixaRegistradora {
	private Adapter_SistemaContabil adapterSistemaContabil;
	private Adapter_SistemaEstoque adapterSistemaEstoque;
	private Adapter_Fabrica adapterFabrica;

	public Controlador_CaixaRegistradora() {
		System.out.println("Controlador caixa registradora criado\n");
		adapterFabrica = new Adapter_Fabrica();
	}

	public void criacaoAdapterSistemaCaixaRegistradoraContabil(String nome){
		adapterSistemaContabil = adapterFabrica.criacaoAdapterSistemaContabil(nome);
	}

	public void criacaoAdapterSistemaCaixaRegistradoraEstoque(String nome) {
		adapterSistemaEstoque = adapterFabrica.criacaoAdapterSistemaEstoque(nome);
	}

	// Teste de integra��o com os dois sistemas adaptee
	// Estoque
	public void diminuirEstoque() {
		adapterSistemaEstoque.diminuirItem();
	}

	// Contabil
	public void registroVendaSistemaContabil() {
		adapterSistemaContabil.finalizarVenda();
	}
}
