package aula01.parte01_DBImplementacao;

/**
 * @CamadaDeNeg�cio que representa um quarto,
 * depende de um banco de dados para verificar
 * se esta ocupado, disponivel ou n�o.
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para IMPLEMENTA��O.
 */
public class Sala_Service {
	private MySqlConnection connection;
	
	public Sala_Service() {
		connection = new MySqlConnection();
	}
	
	public void SalaVerification() {
		connection.connect();
		System.out.println("L�gica de neg�cios - Quarto da pousada");
	}
}
