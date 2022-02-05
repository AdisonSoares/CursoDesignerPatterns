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
public class ServicoDeReserva {
	private OracleConnection connection;
	
	public ServicoDeReserva() {
		connection = new OracleConnection();
	}
	
	public void CriarReserva() {
		connection.connect();
		System.out.println("Lógica de negócios - Criação de reserva");
	}
}
