package aula01.parte02_DBImplementacao;

/**
 * @CamadaDeNegócio da aplicação relacionada a criação de
 * uma reserva na pousada, depende de um banco de dados.
 * 
 * @Inclusão de um novo banco de dados, substituir o Mysql
 * pelo Oracle
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para IMPLEMENTAÇÃO.
 */
public class Servico_De_Reserva {
	private Oracle_Connection connection;
	
	public Servico_De_Reserva() {
		connection = new Oracle_Connection();
	}
	
	public void CriarReserva() {
		connection.connect();
		System.out.println("Lógica de negócios - Criação de reserva");
	}
}
