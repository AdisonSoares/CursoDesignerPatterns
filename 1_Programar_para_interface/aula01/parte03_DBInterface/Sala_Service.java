package aula01.parte03_DBInterface;

/**
 * @CamadaDeNeg�cio que representa um quarto,
 * depende de um banco de dados para verificar
 * se esta ocupado, disponivel ou n�o.
 * 
 * @InstanciandoInterfaceConnection n�o � preciso instanciar um banco de dados, 
 * pode-se escolher seus objetos que s�o as classes 
 * MySqlConnection, OracleConnection e SqlServer.
 * 
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para INTERFACE.
 */
public class Sala_Service {
	private IConnection_ connection;
	
	public Sala_Service(IConnection_ connection) {
		this.connection = connection;
	}
	
	public void SalaVerification() {
		connection.connect();
		System.out.println("L�gica de neg�cios - Quarto da pousada");
	}
}
