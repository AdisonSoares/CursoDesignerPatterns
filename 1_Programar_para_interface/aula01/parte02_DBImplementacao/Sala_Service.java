package aula01.parte02_DBImplementacao;

/**
 * @CamadaDeNegócio que representa um quarto,
 * depende de um banco de dados para verificar
 * se esta ocupado, disponivel ou não.
 * 
 * @Inclusão de um novo banco de dados, substituir o Mysql
 * pelo Oracle
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para IMPLEMENTAÇÃO.
 */
public class Sala_Service {
	private OracleConnection connection;
	
	public Sala_Service() {
		connection = new OracleConnection();
	}
	
	public void SalaVerification() {
		connection.connect();
		System.out.println("Lógica de negócios - Quarto da pousada");
	}
}
