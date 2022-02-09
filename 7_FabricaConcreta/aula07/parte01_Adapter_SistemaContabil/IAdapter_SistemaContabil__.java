package aula07.parte01_Adapter_SistemaContabil;

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
 * controlador, ele define o fluxo de execução da aplicação.+-
 */
public interface IAdapter_SistemaContabil__ {
	void finalizarVenda();
	void registrarImposto();
}

















