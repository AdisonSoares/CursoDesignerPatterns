package aula01.parte01_DBImplementacao;

/**
 * @CamadaDeNegócio que representa um quarto,
 * depende de um banco de dados para verificar
 * se esta ocupado, disponivel ou não.
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para IMPLEMENTAÇÃO.
 */
public class Sala_Service {
	private MySqlConnection connection;
	
	public Sala_Service() {
		connection = new MySqlConnection();
	}
	
	public void SalaVerification() {
		connection.connect();
		System.out.println("Lógica de negócios - Quarto da pousada");
	}
}
