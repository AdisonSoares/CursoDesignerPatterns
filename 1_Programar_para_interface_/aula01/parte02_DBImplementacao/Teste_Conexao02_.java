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
public class Teste_Conexao02_ {
	public static void main(String[] args) {
		
		Sala_Service_ sala = new Sala_Service_();
		sala.SalaVerification();
		System.out.println();
		
		
		Relatorio_Reserva_ relatorio = new Relatorio_Reserva_();
		relatorio.GeracaoDeRelatorio();
		System.out.println();
		 
		Servico_De_Reserva_ reserva = new Servico_De_Reserva_();
		reserva.CriarReserva();
		System.out.println();
	}
}
