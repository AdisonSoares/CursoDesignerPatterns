package aula07.parte08_Adapter_SistemaGeralAplicacaoFabrica;

import aula07.parte01_Adaptee_SistemaContabil.SistemaContabilAdaptee;

/**
 * @FabricaConcreta permite desacoplar a criação de seus codigos clientes,
 * vai servir para introduzir outros tipos de designers patterns.
 *
 * @CenarioDesenvolvido
 * Um sistema cliente gerencia um sistema de estoque que é externo.
 * O sistema de estoque se divide em dois terminais, uma da IBM e outra da ITAUTEC,
 * são ligados a um sistema de registro de vendas.
 * O sistema de registro de vendas é acessado por um sistema terminal PDV (Ponto de venda - caixa),
 * se comunicanicando com um sistema de contabilidade.
 * O sistema de contabilidade se divide em dois terminais, um da IBM e outro da ITAUTEC.
 * Um sistema cliente gerencia o sistema de contabilidade que é externo.
 *
 * @Problematica
 * Como existem dois terminais de sistemas sendo gerenciados por outros sistemas clientes
 * é preciso, no momento de desenvolvimento e fluxo de dados, definir quais serão usados.
 *
 * @Controlador
 * O primeiro objeto a receber uma requisição de uma inteface grafica com o usuário se chama
 * controlador, ele define o fluxo de execução da aplicação.
 * 
 * 
 * @Objetivo é refatorando a hierarquia de adaptadores de contabilidade
 * e estoque para ter um melhor uso de código eliminando duplicação.
 * Um problema é a constante alteração nos controladores ao fazer a inclusão
 * de um novo servidor, sendo que cada classe utiliza basicamente as mesmas
 * funcionalidades podendo ser melhor reutilizada para não haver repetiçao.
 * 
 * @Solução
 * Como os adaptadores sempre implementam os mesmo tipos de métodos
 * a melhor saída é transformar a interface IAdapter em uma classe
 * abstrata para ter as assinaturas a serem implementadas e os métodos
 * que estão sendo repetidos para serem herdados pelas classes Adapter.
 * 
 * @Problema_inclusão_exclusão
 * Toda vez que se faz uma inclusão ou exclusão de um sistema adapter
 * é preciso fazer uma alteraçao em todos os demais sistemas adapterGeral
 * e controlador, sendo que esse é o ponto de variação, a criação de adaptadores
 * para sistemas externos.
 * 
 * @Soluçao_inclusão_exclusão
 * Para seguir o principio de encapsular o que varia, nesse caso a criação de
 * adaptadores para sistemas externos, é preciso encapsular o código de criação
 * dos objeto atraves da crição de outra classe.
 * 
 * @Fabrica
 * É a classe criada para solucionar o problema de variação da criação de objetos,
 * seu único objeto é criar objetos.
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

















