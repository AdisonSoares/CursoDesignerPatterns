package aula07.parte06_Adapter_SistemaGeral_AplicacaoFabrica_;

import aula07.parte01_Adaptee_SistemaContabil.SistemaContabilAdaptee;

/**
 * @Objetivo é refatorar a hierarquia de adaptadores de contabilidade
 * e estoque para ter um melhor uso de código eliminando duplicação.
 * Um problema é a constante alteração nos controladores ao fazer a inclusão
 * de um novo servidor, sendo que cada classe utiliza basicamente as mesmas
 * funcionalidades podendo ser melhor reutilizada para não haver repetiçao.
 */
public class Adapter_SistemaContabil_IBM_Adaptee extends Adapter_SistemaContabil{
	public Adapter_SistemaContabil_IBM_Adaptee() {
		sistemaContabilAdaptee = new SistemaContabilAdaptee("IBM");
	}
}
