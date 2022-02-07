package aula01.parte03_DBInterface_;

/**
 * @Classe que simula a conex�o
 * com o banco de dados e tem o intuito de ser 
 * utilizado por outros elementos da aplica��o.
 * Apresenta apenas uma mensagem.
 * 
 * @ImplementandoConnection e seus m�todos
 * ela se torna objeto da interface, podendo
 * ser melhor manipulada.
 *
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para INTERFACE.
 */
public class MySql_Connection implements IConnection_{
	@Override
	public void connect(){
		System.out.println("Conectando ao MySql");
	}
}
