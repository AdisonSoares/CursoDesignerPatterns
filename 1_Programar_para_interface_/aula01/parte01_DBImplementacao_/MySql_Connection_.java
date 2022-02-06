package aula01.parte01_DBImplementacao_;

/**
 * @Classe que simula a conex�o
 * com o banco de dados e tem o intuito de ser 
 * utilizado por outros elementos da aplica��o.
 * Apresenta apenas uma mensagem.
 * 
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para IMPLEMENTA��O.
 */
public class MySql_Connection_{
	public void connect(){
		System.out.println("Conectando ao MySql");
	}
}
