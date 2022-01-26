package aula01.parte03_DBInterface;

/**
 * @Interface sem implementa��o dos m�todos, quem herdar
 * obrigatoriamente ter� que exportar e implementa-los.
 * Seus m�todos podem declarar public de
 * forma facultativa.
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para INTERFACE.
 */
public interface Connection {
	public void connect();
}
