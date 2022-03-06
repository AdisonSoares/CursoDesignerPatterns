package aula07.parte07_Controlador_SistemaGeral_AplicacaoFabrica;

import aula07.parte06_Adapter_SistemaGeral_AplicacaoFabrica.Adapter_Fabrica;
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

	// Controle de fluxo da aplica��o do usuario
	public void atualizarEstoque() {
		adapterSistemaEstoque.atualizarItem();
	}
}
