package aula03.parte04NovaFuncionalidadeOtimizadaEncapsularVariacoes;

/**
 * @Interface para encapsular o comportamento correr.
 * 
 * @Quando_programar_para_Interface
 * O ideal � programar para interface quando for necess�rio,
 * normalmente vem da necessidade de se atender ao principio
 * de varia��es protegidas, ou seja, permitir que implementa��es
 * mudem sem afetar o codigo cliente.
 * 
 * @Solu��oStrategy forma uma base para todos os tipos de projetos
 * se baseia no principio de designer que resolve o problema 
 * encapsular o que varia.
 * 
 * Identifica-se os aspectos da aplica��o que variam entre as 
 * subclasses e separamos daqueles que permanecem sem altera��o.
 * 
 * Pega-se o que varia e encapsulamos para que mais tarde possam 
 * ser alteradas ou extendidas sem que haja alguma altera��o nas
 * funcionalidades que n�o variam.
 * 
 * O comportamento Correr da classe jogador varia entre as subclasses,
 * para separar esse comportamento da classe jogador � preciso tirar
 * esse comportamento da classe e criar um conjuntos de classes pr�pria 
 * para representar as suas varia�oes.
 * 
 * � criada uma hierarquia de classes para os diferentes tipos de
 * comportamento, tudo isso baseado em uma inteface.
 * 
 * A classe m�e n�o mais passa as caracteristicas especificas por 
 * heran�a e sim por delega��o.
 *
 * No exemplo depois de se encapsular as caracteristicas que variam
 * e criar um objeto para delegar fun�oes � preciso modificar o 
 * construtor para permitir a composi�ao de um jogador com uma estrategia
 * especifica de corrida.
 * 
 * @Tirar o c�digo que varia entre as subclasses e colocar em uma 
 * hierarquia separada usa o principio de programar para interface
 * e favorecer a composi��o sobre heran�a.
 */
public interface IComportamentoCorrida_StrategyBase {
	void correr();
}
