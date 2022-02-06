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
public class Teste_Conexao02 {
	public static void main(String[] args) {
		
		Sala_Service sala = new Sala_Service();
		sala.SalaVerification();
		System.out.println();
		
		
		Relatorio_Reserva relatorio = new Relatorio_Reserva();
		relatorio.GeracaoDeRelatorio();
		System.out.println();
		 
		Servico_De_Reserva reserva = new Servico_De_Reserva();
		reserva.CriarReserva();
		System.out.println();
	}
}
