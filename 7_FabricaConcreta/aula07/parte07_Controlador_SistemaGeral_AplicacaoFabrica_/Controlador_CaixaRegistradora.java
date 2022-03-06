package aula07.parte07_Controlador_SistemaGeral_AplicacaoFabrica_;

import aula07.parte06_Adapter_SistemaGeral_AplicacaoFabrica.Adapter_Fabrica;
import aula07.parte06_Adapter_SistemaGeral_AplicacaoFabrica.Adapter_SistemaContabil;
import aula07.parte06_Adapter_SistemaGeral_AplicacaoFabrica.Adapter_SistemaEstoque;

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

	// Teste de integração com os dois sistemas adaptee
	// Estoque
	public void diminuirEstoque() {
		adapterSistemaEstoque.diminuirItem();
	}

	// Contabil
	public void registroVendaSistemaContabil() {
		adapterSistemaContabil.finalizarVenda();
	}
}
