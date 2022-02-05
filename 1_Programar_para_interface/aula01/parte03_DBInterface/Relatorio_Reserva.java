package aula01.parte03_DBInterface;

/**
 * @CamadaDeNeg�cio do relatorio
 * de reservas fechadas ou abertas, que depende de um banco de dados.
 * 
 * @InstanciandoInterfaceConnection n�o � preciso instanciar um banco de dados, 
 * pode-se escolher seus objetos que s�o as classes 
 * MySqlConnection, OracleConnection e SqlServer.
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para INTERFACE.
 */
public class Relatorio_Reserva {
	private Connection connection;
	
	public Relatorio_Reserva(Connection connection) {
		this.connection = connection;
	}
	
	public void GeracaoDeRelatorio() {
		connection.connect();
		System.out.println("L�gica de neg�cios - Gera��o de relat�rio");
	}
}
