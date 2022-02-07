package aula01.parte03_DBInterface_;

/**
 * @CamadaDeNeg�cio da aplica��o relacionada a cria��o de
 * uma reserva na pousada, depende de um banco de dados.
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
public class Servico_De_Reserva {
	private IConnection_ connection;
	
	public Servico_De_Reserva(IConnection_ connection) {
		this.connection = connection;
	}
	
	public void CriarReserva() {
		connection.connect();
		System.out.println("L�gica de neg�cios - Cria��o de reserva");
	}
}
