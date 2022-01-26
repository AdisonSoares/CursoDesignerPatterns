package aula01.parte02_DBImplementacao;

/**
 * @CamadaDeNeg�cio da aplica��o relacionada a cria��o de
 * uma reserva na pousada, depende de um banco de dados.
 * 
 * @Inclus�o de um novo banco de dados, substituir o Mysql
 * pelo Oracle
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para IMPLEMENTA��O.
 */
public class ServicoDeReserva {
	private OracleConnection connection;
	
	public ServicoDeReserva() {
		connection = new OracleConnection();
	}
	
	public void CriarReserva() {
		connection.connect();
		System.out.println("L�gica de neg�cios - Cria��o de reserva");
	}
}
