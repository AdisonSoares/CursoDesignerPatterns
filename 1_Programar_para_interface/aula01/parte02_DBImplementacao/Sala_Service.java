package aula01.parte02_DBImplementacao;

/**
 * @CamadaDeNeg�cio que representa um quarto,
 * depende de um banco de dados para verificar
 * se esta ocupado, disponivel ou n�o.
 * 
 * @Inclus�o de um novo banco de dados, substituir o Mysql
 * pelo Oracle
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para IMPLEMENTA��O.
 */
public class Sala_Service {
	private OracleConnection connection;
	
	public Sala_Service() {
		connection = new OracleConnection();
	}
	
	public void SalaVerification() {
		connection.connect();
		System.out.println("L�gica de neg�cios - Quarto da pousada");
	}
}
