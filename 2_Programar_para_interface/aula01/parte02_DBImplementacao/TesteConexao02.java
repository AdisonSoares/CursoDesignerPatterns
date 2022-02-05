package aula01.parte02_DBImplementacao;

/**
 * @Inclusão de um novo banco de dados, substituir o Mysql
 * pelo Oracle, mais trabalhoso do que usando uma interface
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para IMPLEMENTAÇÃO.
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
