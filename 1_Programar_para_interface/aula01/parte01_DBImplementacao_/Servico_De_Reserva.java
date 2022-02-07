package aula01.parte01_DBImplementacao_;

/**
 * @CamadaDeNegócio da aplicação relacionada a criação de
 * uma reserva na pousada, depende de um banco de dados.
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para IMPLEMENTAÇÃO.
 */
public class Servico_De_Reserva {
	private MySql_Connection connection;
	
	public Servico_De_Reserva() {
		connection = new MySql_Connection();
	}
	
	public void CriarReserva() {
		connection.connect();
		System.out.println("Lógica de negócios - Criação de reserva");
	}
}
