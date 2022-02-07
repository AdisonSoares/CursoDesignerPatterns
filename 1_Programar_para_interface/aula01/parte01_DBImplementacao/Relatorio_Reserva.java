package aula01.parte01_DBImplementacao;

/**
 * @CamadaDeNegócio do relatorio
 * de reservas fechadas ou abertas, que depende de um banco de dados.
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para IMPLEMENTAÇÃO.
 */
public class Relatorio_Reserva {
	private MySql_Connection connection;
	
	public Relatorio_Reserva() {
		connection = new MySql_Connection();
	}
	
	public void GeracaoDeRelatorio() {
		connection.connect();
		System.out.println("Lógica de negócios - Geração de relatório");
	}
}
