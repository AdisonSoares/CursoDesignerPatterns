package aula07.parte07_Controlador_SistemaGeral_AplicacaoFabrica;

import aula07.parte06_Adapter_SistemaGeral_AplicacaoFabrica.Adapter_Fabrica;
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
public class Controlador_SistemaEstoque {
	private Adapter_SistemaEstoque adapterSistemaEstoque;
	private Adapter_Fabrica adapterFabrica;

	public Controlador_SistemaEstoque() {
		System.out.println("Controlador de estoque criado\n");
		adapterFabrica = new Adapter_Fabrica();
	}

	// Objeto externo - IBM ou ItauTec
	public void criacaoAdapterSistemaEstoque(String nome) {
		adapterSistemaEstoque = adapterFabrica.criacaoAdapterSistemaEstoque(nome);
	}

	// Controle de fluxo da aplicação do usuario
	public void atualizarEstoque() {
		adapterSistemaEstoque.atualizarItem();
	}
}
