package aula06.parte01_Singleton_JustificativaDeUso_Problema_;
 
/**
 * @Problem�tica
 * O sistema n�o deveria permitir o pouso de um avi�o e depois o pouso
 * de outro ao mesmo tempo, pela l�gica criada caso um avi�o tivesse a 
 * permiss�o para pousar outro avi�o n�o teria permiss�o para pousar 
 * apenas para decolar, e caso um avi�o tivesse a permiss�o para decolar
 * outro avi�o n�o poderia ter permiss�o para decolar em seguida apenas se 
 * poderia dar permiss�o para pousar, mas ao rodar o programa a  l�gica 
 * contraria do if � validade por um objeto mas do else n�o � validada
 * pelo outro objeto.
 *
 */
public class TesteAeroporto01 {
	public static void main(String[] args) {
		ControleAeroporto controle01 = new ControleAeroporto();
		ControleAeroporto controle02 = new ControleAeroporto();
		
		
		controle01.solicitarPermissaoDecolar();
		controle02.solicitarPermissaoDecolar();
		
		System.out.println();
		
		controle01.solicitarPermissaoPousa();
		controle02.solicitarPermissaoPousa();
		
	}
}
