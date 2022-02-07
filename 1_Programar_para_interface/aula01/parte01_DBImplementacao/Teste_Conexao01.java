package aula01.parte01_DBImplementacao;
//Pattern atual Singleton.

/**
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para IMPLEMENTA��O.
 */
public class Teste_Conexao01 {
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
