package aula02.parte07_FlowGridContainerNovaFuncionalidadeOtimizadaHerancaComposicaoDelegacao_;

/**
 * @Classe main para teste
 * 
 * @CriandoConteines Cada tipo de conteiner armazena os elementos de forma
 * diferente, em linha e em matriz, agrupam componentes de
 * interface gráfica do usuario.
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para INTEFACE.
 */
public class TesteHeranca {
	public static void main(String[] args) {
		
		/*****ABAIXO PRINCIPAL FUNCIONALIDADE - GRIDCONTAINER E FLOWCONTAINER*****/
		// Criação de um Gridcontainer(Rede container) com 4 posições - SEM BORDA//
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

		// Criação de um Flowcontainer(Fluxo container) - SEM BORDA//
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
		
	
		/*****ABAIXO NOVA FUNCIONALIDADE - BORDA PONTILHADA*****/
		//Criação do objeto container do tipo fluxo 
		Container container03 = new FluxoContainer();
		
		//Criação do objeto borda do tipo pontilhada
		Borda bordaPontilhada = new BordaPontilhada(container03);

		// Criação dos elementos - Borda pontilhada
		Component botaoPontilhadoFlowContainer = new Component("Botao pontilhado - FlowContainer");

		// Inclusão dos elementos criados - Borda pontilhada
		container03.addComponent(botaoPontilhadoFlowContainer);
		container03.addComponent(botaoRadio);
		container03.addComponent(areaTexto);
		container03.addComponent(campoTexto);
		container03.addComponent(caixaSelecao);

		// Exibir os elementos do Flowcontainer criado - Borda pontilhada
		container03.exibir();

		/*****ABAIXO NOVA FUNCIONALIDADE - BORDA SOLIDA FLOWCONTAINER*****/
		// Criação de um Flowcontainer(Fluxo container) - Borda solida//
		Container container04 = new FluxoContainer();
		
		//Criação do objeto borda do tipo solido
		Borda bordaSolida = new BordaSolida(container04);

		// Criação dos elementos - Borda solida
		Component botaoSolidoFlowContainer = new Component("Botao solido - FlowContainer");

		// Inclusão dos elementos criados - Borda solida
		container04.addComponent(botaoSolidoFlowContainer);
		container04.addComponent(botaoRadio);
		container04.addComponent(areaTexto);
		container04.addComponent(campoTexto);
		container04.addComponent(caixaSelecao);

		// Exibir os elementos do Flowcontainer criado - Borda solida
		container04.exibir();
		

		/*****ABAIXO NOVA FUNCIONALIDADE - BORDA PONTILHADA GRIDCONTAINER*****/
		// Criação de um Gridcontainer(Rede container) com 4 posições - Borda pontilhada//
		Container container05 = new RedeContainer(2, 2);
		
		//Criação do objeto borda do tipo solido
		bordaPontilhada.setContainer(container05);

		// Criação dos elementos - Borda pontilhada
		Component botaoPontilhadoGridContainer = new Component("Botao pontilhado - GridContainer");

		// Inclusão dos elementos criados - Borda pontilhada
		container05.addComponent(botaoPontilhadoGridContainer);
		container05.addComponent(areaTexto);
		container05.addComponent(campoTexto);
		container05.addComponent(caixaSelecao);

		// Exibir os elementos do Gridcontainer criado - Borda pontilhada
		bordaPontilhada.gerarBorda();
		

		/*****ABAIXO NOVA FUNCIONALIDADE - BORDA SOLIDA GRIDCONTAINER*****/
		// Criação de um Gridcontainer(Rede container) com 4 posições - Borda solida//
		Container container06 = new RedeContainer(2, 2);
		
		//Criação do objeto borda do tipo solido
		bordaSolida.setContainer(container06);
		
		// Criação dos elementos - Borda solida
		Component botaoSolidoGridContainer = new Component("Botao solido - GridContainer");

		// Inclusão dos elementos criados - Borda solida
		container06.addComponent(botaoSolidoGridContainer);
		container06.addComponent(areaTexto);
		container06.addComponent(campoTexto);
		container06.addComponent(caixaSelecao);

		// Exibir os elementos do Gridcontainer criado - Borda solida
		bordaSolida.gerarBorda();
		
		/*****ABAIXO NOVA FUNCIONALIDADE - BORDA COLORIDA GRIDCONTAINER*****/
		// Criação de um Gridcontainer(Rede container) com 4 posições - Borda colorida//
		Container container07 = new RedeContainer(2, 2);
		
		//Criação do objeto borda do tipo colorida
		Borda bordaColorida = new BordaColorida(container07);
		bordaColorida.setContainer(container07);
		
		// Criação dos elementos - Borda colorida
		Component botaoColoridoGridContainer = new Component("Botao colorido - GridContainer");

		// Inclusão dos elementos criados - Borda colorida
		container07.addComponent(botaoColoridoGridContainer);
		container07.addComponent(areaTexto);
		container07.addComponent(campoTexto);
		container07.addComponent(caixaSelecao);

		// Exibir os elementos do Gridcontainer criado - Borda colorida
		bordaColorida.gerarBorda();
	}		
}		
		
