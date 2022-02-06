package aula01.parte01_DBImplementacao_;
//Pattern atual Singleton.

/**
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para IMPLEMENTAÇÃO.
 */
public class Teste_Conexao01_ {
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
