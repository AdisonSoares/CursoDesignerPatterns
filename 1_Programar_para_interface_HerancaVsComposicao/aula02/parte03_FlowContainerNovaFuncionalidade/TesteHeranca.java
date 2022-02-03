package aula02.parte03_FlowContainerNovaFuncionalidade;

/**
 * @Classe main para teste
 * 
 * @CriandoConteines 
 * Cada tipo de conteiner armazena os elementos de forma
 * diferente, em linha e em matriz, agrupam componentes de
 * interface gráfica do usuario.
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para INTERFACE.
 */
public class TesteHeranca {
	public static void main(String[] args) {

		/*****ABAIXO PRINCIPAL FUNCIONALIDADE - GRIDCONTAINER E FLOWCONTAINER*****/
		// Criação de um Gridcontainer(Rede container) com 4 posições//
		Container container01 = new RedeContainer(2, 2);

		// Criação dos elementos
		Component botao = new Component("Botao");
		Component areaTexto = new Component("Area texto");
		Component campoTexto = new Component("Campo texto");
		Component caixaSelecao = new Component("Caixa seleção");

		// Inclusão dos elementos criados
		container01.addComponent(botao);
		container01.addComponent(areaTexto);
		container01.addComponent(campoTexto);
		container01.addComponent(caixaSelecao);

		// Exibir os elementos do Gridcontainer criado
		container01.exibir();

		// Criação de um Flowcontainer(Fluxo container)//
		Container container02 = new FluxoContainer();

		// Criação dos elementos
		Component botaoRadio = new Component("Botao radio");

		// Inclusão dos elementos criados
		container02.addComponent(botao);
		container02.addComponent(botaoRadio);
		container02.addComponent(areaTexto);
		container02.addComponent(campoTexto);
		container02.addComponent(caixaSelecao);

		// Exibir os elementos do Flowcontainer criado
		container02.exibir();

		/*****ABAIXO NOVA FUNCIONALIDADE - BORDA PONTILHADA FLOWCONTAINER*****/
		// Criação de um Flowcontainer(Fluxo container) - Borda pontilhada//
		Container container03 = new FluxoContainerBordaPontilhada();
		
		// Criação dos elementos - Borda pontilhada
		Component botaoPontilhado = new Component("Botao pontilhado");

		// Inclusão dos elementos criados - Borda pontilhada
		container03.addComponent(botao);
		container03.addComponent(botaoPontilhado);
		container03.addComponent(botaoRadio);
		container03.addComponent(areaTexto);
		container03.addComponent(campoTexto);
		container03.addComponent(caixaSelecao);

		// Exibir os elementos do Flowcontainer criado - Borda pontilhada
		container03.exibir();

		
		/*****ABAIXO NOVA FUNCIONALIDADE - BORDA SOLIDA FLOWCONTAINER*****/
		// Criação de um Flowcontainer(Fluxo container) - Borda solida//
		Container container04 = new FluxoContainerBordaSolida();
		
		// Criação dos elementos - Borda solida
		Component botaoSolido = new Component("Botao solido");

		// Inclusão dos elementos criados - Borda solida
		container04.addComponent(botao);
		container04.addComponent(botaoSolido);
		container04.addComponent(botaoRadio);
		container04.addComponent(areaTexto);
		container04.addComponent(campoTexto);
		container04.addComponent(caixaSelecao);

		// Exibir os elementos do Flowcontainer criado - Borda solida
		container04.exibir();
	}

}
