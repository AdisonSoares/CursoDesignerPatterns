package aula01.parte03_DBInterface_;

/**
 * @Classe main para teste
 * 
 * @InstanciandoObjetoTipoInterface o construtor retorna o método
 * da interface que foi herdada e implementada pela classe especificada
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para INTERFACE.
 */
public class Teste_Conexao03 {
	public static void main(String[] args) {
		
		Sala_Service sala = new Sala_Service(new Oracle_Connection());
		sala.SalaVerification();
		System.out.println();
		
		
		Relatorio_Reserva relatorio = new Relatorio_Reserva(new MySql_Connection());
		relatorio.GeracaoDeRelatorio();
		System.out.println();
		 
		Servico_De_Reserva reserva = new Servico_De_Reserva(new SqlServer_Connection());
		reserva.CriarReserva();
		System.out.println();
	}
}
