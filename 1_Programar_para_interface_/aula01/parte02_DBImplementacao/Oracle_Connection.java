package aula01.parte02_DBImplementacao;

/**
 * @Classe que simula a conex�o
 * com o banco de dados e tem o intuito de ser 
 * utilizado por outros elementos da aplica��o.
 * Apresenta apenas uma mensagem.
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para IMPLEMENTA��O.
 */
public class Oracle_Connection {
	public void connect() {
		System.out.println("Conectando ao Oracle");
	}
}
