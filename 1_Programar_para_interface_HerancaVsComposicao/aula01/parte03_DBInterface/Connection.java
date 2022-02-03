package aula01.parte03_DBInterface;

/**
 * @Interface sem implementação dos métodos, quem herdar
 * obrigatoriamente terá que exportar e implementa-los.
 * Seus métodos podem declarar public de
 * forma facultativa.
 * 
 * @Quando_programar_para_Interface
 * O ideal é programar para interface quando for necessário,
 * normalmente vem da necessidade de se atender ao principio
 * de variações protegidas, ou seja, permitir que implementações
 * mudem sem afetar o codigo cliente.
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para INTERFACE.
 */
public interface Connection {
	public void connect();
}
