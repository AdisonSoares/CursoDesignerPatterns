package aula01.parte02_DBImplementacao;

/**
 * @Classe que simula a conexão
 * com o banco de dados e tem o intuito de ser 
 * utilizado por outros elementos da aplicação.
 * Apresenta apenas uma mensagem.
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para IMPLEMENTAÇÃO.
 */
public class Oracle_Connection {
	public void connect() {
		System.out.println("Conectando ao Oracle");
	}
}
