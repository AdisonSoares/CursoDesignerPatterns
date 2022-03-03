package aula07.parte06_Adapter_SistemaGeral_;

import aula07.parte01_Adaptee_SistemaEstoque.SistemaEstoqueAdaptee;

/**
 * @Objetivo é refatorando a hierarquia de adaptadores de contabilidade
 * e estoque para ter um melhor uso de código eliminando duplicação.
 * Um problema é a constante alteração nos controladores ao fazer a inclusão
 * de um novo servidor, sendo que cada classe utiliza basicamente as mesmas
 * funcionalidades podendo ser melhor reutilizada para não haver repetiçao.
 */
public class Adapter_SistemaEstoque_SAP_Adaptee extends Adapter_SistemaEstoqueGeral{
	
	public Adapter_SistemaEstoque_SAP_Adaptee() {
		this.sistemaEstoqueAdaptee = new SistemaEstoqueAdaptee("SAP");
	}

}
