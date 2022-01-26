package aula01.parte03_DBInterface;

/**
 * @Interface sem implementação dos métodos, quem herdar
 * obrigatoriamente terá que exportar e implementa-los.
 * Seus métodos podem declarar public de
 * forma facultativa.
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para INTERFACE.
 */
public interface Connection {
	public void connect();
}
