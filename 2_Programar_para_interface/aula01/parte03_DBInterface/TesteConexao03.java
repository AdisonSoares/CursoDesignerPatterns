package aula01.parte03_DBInterface;

/**
 * @Classe main para teste
 * 
 * @InstanciandoObjetoTipoInterface o construtor retorna o m�todo
 * da interface que foi herdada e implementada pela classe especificada
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para INTERFACE.
 */
public class TesteConexao03 {
	public static void main(String[] args) {
		
		SalaService sala = new SalaService(new OracleConnection());
		sala.SalaVerification();
		System.out.println();
		
		
		RelatorioReserva relatorio = new RelatorioReserva(new MySqlConnection());
		relatorio.GeracaoDeRelatorio();
		System.out.println();
		 
		ServicoDeReserva reserva = new ServicoDeReserva(new SqlServerConnection());
		reserva.CriarReserva();
		System.out.println();
	}
}
