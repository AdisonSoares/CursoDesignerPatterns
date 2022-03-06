package aula07.parte06_Adapter_SistemaGeral_AplicacaoFabrica_;

import aula07.parte01_Adaptee_SistemaEstoque.SistemaEstoqueAdaptee;

/**
 * @Objetivo � refatorando a hierarquia de adaptadores de contabilidade
 * e estoque para ter um melhor uso de c�digo eliminando duplica��o.
 * Um problema � a constante altera��o nos controladores ao fazer a inclus�o
 * de um novo servidor, sendo que cada classe utiliza basicamente as mesmas
 * funcionalidades podendo ser melhor reutilizada para n�o haver repeti�ao.
 */
public class Adapter_SistemaEstoque_IBM_Adaptee extends Adapter_SistemaEstoque{
	public Adapter_SistemaEstoque_IBM_Adaptee() {
		sistemaEstoqueAdaptee = new SistemaEstoqueAdaptee("IBM");
	}
}
