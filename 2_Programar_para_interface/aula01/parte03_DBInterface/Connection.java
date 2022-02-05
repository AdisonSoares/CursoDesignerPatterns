package aula01.parte03_DBInterface;

/**
 * @Interface sem implementa��o dos m�todos, quem herdar
 * obrigatoriamente ter� que exportar e implementa-los.
 * Seus m�todos podem declarar public de
 * forma facultativa.
 * 
 * @Quando_programar_para_Interface
 * O ideal � programar para interface quando for necess�rio,
 * normalmente vem da necessidade de se atender ao principio
 * de varia��es protegidas, ou seja, permitir que implementa��es
 * mudem sem afetar o codigo cliente.
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para INTERFACE.
 */
public interface Connection {
	public void connect();
}
