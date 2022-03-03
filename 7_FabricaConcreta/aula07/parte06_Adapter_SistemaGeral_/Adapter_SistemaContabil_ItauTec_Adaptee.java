package aula07.parte06_Adapter_SistemaGeral_;

import aula07.parte01_Adaptee_SistemaContabil.SistemaContabilAdaptee;

/**
 * @Objetivo é refatorando a hierarquia de adaptadores de contabilidade
 * e estoque para ter um melhor uso de código eliminando duplicação.
 * Um problema é a constante alteração nos controladores ao fazer a inclusão
 * de um novo servidor, sendo que cada classe utiliza basicamente as mesmas
 * funcionalidades podendo ser melhor reutilizada para não haver repetiçao.
 */
public class Adapter_SistemaContabil_ItauTec_Adaptee extends Adapter_SistemaContabilGeral{
	
	
	public Adapter_SistemaContabil_ItauTec_Adaptee() {
		this.sistemaContabilAdaptee= new SistemaContabilAdaptee("ItauTec");
	}
	


}
