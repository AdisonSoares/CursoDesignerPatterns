package aula01.parte01_DBImplementacao_;

/**
 * @CamadaDeNeg�cio da aplica��o relacionada a cria��o de
 * uma reserva na pousada, depende de um banco de dados.
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para IMPLEMENTA��O.
 */
public class Servico_De_Reserva {
	private MySql_Connection connection;
	
	public Servico_De_Reserva() {
		connection = new MySql_Connection();
	}
	
	public void CriarReserva() {
		connection.connect();
		System.out.println("L�gica de neg�cios - Cria��o de reserva");
	}
}
