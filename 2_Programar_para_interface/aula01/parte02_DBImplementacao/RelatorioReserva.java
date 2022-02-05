package aula01.parte02_DBImplementacao;

/**
 * @CamadaDeNegócio do relatorio
 * de reservas fechadas ou abertas, que depende de um banco de dados.
 * 
 * @Inclusão de um novo banco de dados, substituir o Mysql
 * pelo Oracle
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para IMPLEMENTAÇÃO.
 */
public class RelatorioReserva {
	private OracleConnection connection;
	
	public RelatorioReserva() {
		connection = new OracleConnection();
	}
	
	public void GeracaoDeRelatorio() {
		connection.connect();
		System.out.println("Lógica de negócios - Geração de relatório");
	}
}
