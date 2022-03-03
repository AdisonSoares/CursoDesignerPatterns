package aula07.parte06_Adapter_SistemaGeral_;

import aula07.parte01_Adaptee_SistemaContabil.SistemaContabilAdaptee;

/**
 * @Objetivo � refatorando a hierarquia de adaptadores de contabilidade
 * e estoque para ter um melhor uso de c�digo eliminando duplica��o.
 * Um problema � a constante altera��o nos controladores ao fazer a inclus�o
 * de um novo servidor, sendo que cada classe utiliza basicamente as mesmas
 * funcionalidades podendo ser melhor reutilizada para n�o haver repeti�ao.
 */
public class Adapter_SistemaContabil_ItauTec_Adaptee extends Adapter_SistemaContabilGeral{
	
	
	public Adapter_SistemaContabil_ItauTec_Adaptee() {
		this.sistemaContabilAdaptee= new SistemaContabilAdaptee("ItauTec");
	}
	


}
