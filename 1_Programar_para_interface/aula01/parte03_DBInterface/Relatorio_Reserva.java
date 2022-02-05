package aula01.parte03_DBInterface;

/**
 * @CamadaDeNegócio do relatorio
 * de reservas fechadas ou abertas, que depende de um banco de dados.
 * 
 * @InstanciandoInterfaceConnection não é preciso instanciar um banco de dados, 
 * pode-se escolher seus objetos que são as classes 
 * MySqlConnection, OracleConnection e SqlServer.
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para INTERFACE.
 */
public class Relatorio_Reserva {
	private Connection connection;
	
	public Relatorio_Reserva(Connection connection) {
		this.connection = connection;
	}
	
	public void GeracaoDeRelatorio() {
		connection.connect();
		System.out.println("Lógica de negócios - Geração de relatório");
	}
}
