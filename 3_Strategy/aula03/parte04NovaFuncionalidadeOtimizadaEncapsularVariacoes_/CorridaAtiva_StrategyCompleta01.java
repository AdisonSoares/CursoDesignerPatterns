package aula03.parte04NovaFuncionalidadeOtimizadaEncapsularVariacoes_;

/**
 * @Classe para implementar o comportamento correr de forma ativa da interface Comportamento Corrida.
 * 
 * @Solu��oStrategy forma uma base para todos os tipos de projetos se baseia no 
 * principio de designer que resolve o problema encapsular o que varia.
 * 
 * Identifica-se os aspectos da aplica��o que variam entre as subclasses e separamos
 * daqueles que permanecem sem altera��o.
 * 
 * Pega-se o que varia e encapsulamos para que mais tarde possam ser alteradas ou extendidas
 * sem que haja alguma altera��o nas funcionalidades que n�o variam.
 * 
 * O comportamento Correr da classe jogador varia entre as subclasses, para separar esse comportamento
 * da classe jogador � preciso tirar esse comportamento da classe e criar um conjuntos de classes pr�pria 
 * para representar as suas varia�oes.
 * 
 * � criada uma hierarquia de classes para os diferentes tipos de comportamento, tudo isso
 * baseado em uma inteface.
 * 
 * O fato de tirar o c�digo que varia entre as subclasses e colocar em uma hierarquia separada
 * usa o principio de programar para interface e favorecer a composi��o sobre heran�a.
 *
 * A classe m�e n�o mais passa as caracteristicas especificas por heran�a e sim por delega��o.
 *
 * No exemplo depois de se encapsular as caracteristicas que variam e criar um objeto para delegar
 * fun�oes � preciso modificar o construtor para permitir a composi�ao de um jogador com uma estrategia
 * especifica de corrida.
 */
public class CorridaAtiva_StrategyCompleta01 implements IComportamentoCorrida_StrategyBase{

	@Override
	public void correr() {
		System.out.println("Jogador precisa correr\n");
	}
}
