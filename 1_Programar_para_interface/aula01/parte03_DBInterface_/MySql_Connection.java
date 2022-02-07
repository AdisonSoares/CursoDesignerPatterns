package aula01.parte03_DBInterface_;

/**
 * @Classe que simula a conexão
 * com o banco de dados e tem o intuito de ser 
 * utilizado por outros elementos da aplicação.
 * Apresenta apenas uma mensagem.
 * 
 * @ImplementandoConnection e seus métodos
 * ela se torna objeto da interface, podendo
 * ser melhor manipulada.
 *
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para INTERFACE.
 */
public class MySql_Connection implements IConnection_{
	@Override
	public void connect(){
		System.out.println("Conectando ao MySql");
	}
}
