package aula01.parte03_DBInterface_;

/**
 * @CamadaDeNegócio da aplicação relacionada a criação de
 * uma reserva na pousada, depende de um banco de dados.
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
public class Servico_De_Reserva {
	private IConnection_ connection;
	
	public Servico_De_Reserva(IConnection_ connection) {
		this.connection = connection;
	}
	
	public void CriarReserva() {
		connection.connect();
		System.out.println("Lógica de negócios - Criação de reserva");
	}
}
