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
public class Servico_De_Reserva_ {
	private MySql_Connection_ connection;
	
	public Servico_De_Reserva_() {
		connection = new MySql_Connection_();
	}
	
	public void CriarReserva() {
		connection.connect();
		System.out.println("L�gica de neg�cios - Cria��o de reserva");
	}
}
