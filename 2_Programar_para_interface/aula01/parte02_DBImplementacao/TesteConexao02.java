package aula01.parte02_DBImplementacao;

/**
 * @Inclus�o de um novo banco de dados, substituir o Mysql
 * pelo Oracle, mais trabalhoso do que usando uma interface
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para IMPLEMENTA��O.
 */
public class TesteConexao02 {
	public static void main(String[] args) {
		
		SalaService sala = new SalaService();
		sala.SalaVerification();
		System.out.println();
		
		
		RelatorioReserva relatorio = new RelatorioReserva();
		relatorio.GeracaoDeRelatorio();
		System.out.println();
		 
		ServicoDeReserva reserva = new ServicoDeReserva();
		reserva.CriarReserva();
		System.out.println();
	}
}
