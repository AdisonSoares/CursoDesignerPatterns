package aula06.parte02_Singleton_Aplicacao_Solucao;

/**
 * @Problemática
 * O sistema não deveria permitir o pouso de um avião e depois o pouso
 * de outro ao mesmo tempo, pela lógica criada caso um avião tivesse a 
 * permissão para pousar outro avião não teria permissão para pousar 
 * apenas para decolar, e caso um avião tivesse a permissão para decolar
 * outro avião não poderia ter permissão para decolar em seguida apenas se 
 * poderia dar permissão para pousar, mas ao rodar o programa a  lógica 
 * contraria do if é validade por um objeto mas do else não é validada
 * pelo outro objeto. 
 * 
 * @Solucao
 * O sistema de controle é unico e permite um ponto de acesso global, todos que 
 * precisam de permissao devem contactar um objeto unico e centralizado de
 * fácil acesso.
 */
public class TesteAeroporto02 {
	public static void main(String[] args) {
		
		ControleAeroporto controle01 = ControleAeroporto.getInstancia();
		ControleAeroporto controle02 = ControleAeroporto.getInstancia();
		
		
		controle01.solicitarPermissaoDecolar();
		controle02.solicitarPermissaoDecolar();
		
		System.out.println();
		
		controle01.solicitarPermissaoPousa();
		controle02.solicitarPermissaoPousa();
		
	}
}
