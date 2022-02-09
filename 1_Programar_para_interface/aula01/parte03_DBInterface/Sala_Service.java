package aula01.parte03_DBInterface;

/**
 * @CamadaDeNegócio que representa um quarto,
 * depende de um banco de dados para verificar
 * se esta ocupado, disponivel ou não.
 * 
 * @InstanciandoInterfaceConnection não é preciso instanciar um banco de dados, 
 * pode-se escolher seus objetos que são as classes 
 * MySqlConnection, OracleConnection e SqlServer.
 * 
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para INTERFACE.
 */
public class Sala_Service {
	private IConnection_ connection;
	
	public Sala_Service(IConnection_ connection) {
		this.connection = connection;
	}
	
	public void SalaVerification() {
		connection.connect();
		System.out.println("Lógica de negócios - Quarto da pousada");
	}
}
