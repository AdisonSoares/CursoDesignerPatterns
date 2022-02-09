package aula03.parte04NovaFuncionalidadeOtimizadaEncapsularVariacoes;

/**
 * @Interface para encapsular o comportamento correr.
 * 
 * @Quando_programar_para_Interface
 * O ideal é programar para interface quando for necessário,
 * normalmente vem da necessidade de se atender ao principio
 * de variações protegidas, ou seja, permitir que implementações
 * mudem sem afetar o codigo cliente.
 * 
 * @SoluçãoStrategy forma uma base para todos os tipos de projetos
 * se baseia no principio de designer que resolve o problema 
 * encapsular o que varia.
 * 
 * Identifica-se os aspectos da aplicação que variam entre as 
 * subclasses e separamos daqueles que permanecem sem alteração.
 * 
 * Pega-se o que varia e encapsulamos para que mais tarde possam 
 * ser alteradas ou extendidas sem que haja alguma alteração nas
 * funcionalidades que não variam.
 * 
 * O comportamento Correr da classe jogador varia entre as subclasses,
 * para separar esse comportamento da classe jogador é preciso tirar
 * esse comportamento da classe e criar um conjuntos de classes própria 
 * para representar as suas variaçoes.
 * 
 * É criada uma hierarquia de classes para os diferentes tipos de
 * comportamento, tudo isso baseado em uma inteface.
 * 
 * A classe mãe não mais passa as caracteristicas especificas por 
 * herança e sim por delegação.
 *
 * No exemplo depois de se encapsular as caracteristicas que variam
 * e criar um objeto para delegar funçoes é preciso modificar o 
 * construtor para permitir a composiçao de um jogador com uma estrategia
 * especifica de corrida.
 * 
 * @Tirar o código que varia entre as subclasses e colocar em uma 
 * hierarquia separada usa o principio de programar para interface
 * e favorecer a composição sobre herança.
 */
public interface IComportamentoCorrida_StrategyBase {
	void correr();
}
