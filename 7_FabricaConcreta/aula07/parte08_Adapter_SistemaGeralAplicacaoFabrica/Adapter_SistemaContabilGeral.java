package aula07.parte08_Adapter_SistemaGeralAplicacaoFabrica;

import aula07.parte01_Adaptee_SistemaContabil.SistemaContabilAdaptee;

/**
 * @FabricaConcreta permite desacoplar a cria��o de seus codigos clientes,
 * vai servir para introduzir outros tipos de designers patterns.
 *
 * @CenarioDesenvolvido
 * Um sistema cliente gerencia um sistema de estoque que � externo.
 * O sistema de estoque se divide em dois terminais, uma da IBM e outra da ITAUTEC,
 * s�o ligados a um sistema de registro de vendas.
 * O sistema de registro de vendas � acessado por um sistema terminal PDV (Ponto de venda - caixa),
 * se comunicanicando com um sistema de contabilidade.
 * O sistema de contabilidade se divide em dois terminais, um da IBM e outro da ITAUTEC.
 * Um sistema cliente gerencia o sistema de contabilidade que � externo.
 *
 * @Problematica
 * Como existem dois terminais de sistemas sendo gerenciados por outros sistemas clientes
 * � preciso, no momento de desenvolvimento e fluxo de dados, definir quais ser�o usados.
 *
 * @Controlador
 * O primeiro objeto a receber uma requisi��o de uma inteface grafica com o usu�rio se chama
 * controlador, ele define o fluxo de execu��o da aplica��o.
 * 
 * 
 * @Objetivo � refatorando a hierarquia de adaptadores de contabilidade
 * e estoque para ter um melhor uso de c�digo eliminando duplica��o.
 * Um problema � a constante altera��o nos controladores ao fazer a inclus�o
 * de um novo servidor, sendo que cada classe utiliza basicamente as mesmas
 * funcionalidades podendo ser melhor reutilizada para n�o haver repeti�ao.
 * 
 * @Solu��o
 * Como os adaptadores sempre implementam os mesmo tipos de m�todos
 * a melhor sa�da � transformar a interface IAdapter em uma classe
 * abstrata para ter as assinaturas a serem implementadas e os m�todos
 * que est�o sendo repetidos para serem herdados pelas classes Adapter.
 * 
 * @Problema_inclus�o_exclus�o
 * Toda vez que se faz uma inclus�o ou exclus�o de um sistema adapter
 * � preciso fazer uma altera�ao em todos os demais sistemas adapterGeral
 * e controlador, sendo que esse � o ponto de varia��o, a cria��o de adaptadores
 * para sistemas externos.
 * 
 * @Solu�ao_inclus�o_exclus�o
 * Para seguir o principio de encapsular o que varia, nesse caso a cria��o de
 * adaptadores para sistemas externos, � preciso encapsular o c�digo de cria��o
 * dos objeto atraves da cri��o de outra classe.
 * 
 * @Fabrica
 * � a classe criada para solucionar o problema de varia��o da cria��o de objetos,
 * seu �nico objeto � criar objetos.
 */
public abstract class Adapter_SistemaContabilGeral {
	protected SistemaContabilAdaptee sistemaContabilAdaptee;
	
	public void finalizarVenda() {
		sistemaContabilAdaptee.registroVenda();
	}

	public void registrarImposto() {
		sistemaContabilAdaptee.calculoImposto();
		
	}
}

















