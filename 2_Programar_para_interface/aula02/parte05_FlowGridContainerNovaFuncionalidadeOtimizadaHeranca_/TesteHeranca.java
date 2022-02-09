package aula02.parte05_FlowGridContainerNovaFuncionalidadeOtimizadaHeranca_;

/**
 * @Classe main para teste
 * 
 * @CriandoConteines Cada tipo de conteiner armazena os elementos de forma
 * diferente, em linha e em matriz, agrupam componentes de
 * interface gr�fica do usuario.
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para INTERFACE.
 */
public class TesteHeranca {
	public static void main(String[] args) {
		
		/*****ABAIXO PRINCIPAL FUNCIONALIDADE - GRIDCONTAINER E FLOWCONTAINER*****/
		// Cria��o de um Gridcontainer(Rede container) com 4 posi��es//
		Container container01 = new RedeContainer(2, 2);

		// Cria��o dos elementos
		Component botao = new Component("Botao");
		Component areaTexto = new Component("Area texto");
		Component campoTexto = new Component("Campo texto");
		Component caixaSelecao = new Component("Caixa sele��o");

		// Inclus�o dos elementos criados
		container01.addComponent(botao);
		container01.addComponent(areaTexto);
		container01.addComponent(campoTexto);
		container01.addComponent(caixaSelecao);

		// Exibir os elementos do Gridcontainer criado
		container01.exibir();

		// Cria��o de um Flowcontainer(Fluxo container)//
		Container container02 = new FluxoContainer();

		// Cria��o dos elementos
		Component botaoRadio = new Component("Botao radio");

		// Inclus�o dos elementos criados
		container02.addComponent(botao);
		container02.addComponent(botaoRadio);
		container02.addComponent(areaTexto);
		container02.addComponent(campoTexto);
		container02.addComponent(caixaSelecao);

		// Exibir os elementos do Flowcontainer criado
		container02.exibir();
		
		
		/*****ABAIXO NOVA FUNCIONALIDADE - BORDA PONTILHADA FLOWCONTAINER*****/
		// Cria��o de um Flowcontainer(Fluxo container) - Borda pontilhada//
		Container container03 = new FluxoContainerBordaPontilhada();

		// Cria��o dos elementos - Borda pontilhada
		Component botaoPontilhadoFlowContainer = new Component("Botao pontilhado - FlowContainer");

		// Inclus�o dos elementos criados - Borda pontilhada
		container03.addComponent(botaoPontilhadoFlowContainer);
		container03.addComponent(botaoRadio);
		container03.addComponent(areaTexto);
		container03.addComponent(campoTexto);
		container03.addComponent(caixaSelecao);

		// Exibir os elementos do Flowcontainer criado - Borda pontilhada
		container03.exibir();
		
		/*****ABAIXO NOVA FUNCIONALIDADE - BORDA SOLIDA FLOWCONTAINER*****/
		// Cria��o de um Flowcontainer(Fluxo container) - Borda solida//
		Container container04 = new FluxoContainerBordaSolida();

		// Cria��o dos elementos - Borda solida
		Component botaoSolidoFlowContainer = new Component("Botao solido - FlowContainer");

		// Inclus�o dos elementos criados - Borda solida
		container04.addComponent(botaoSolidoFlowContainer);
		container04.addComponent(botaoRadio);
		container04.addComponent(areaTexto);
		container04.addComponent(campoTexto);
		container04.addComponent(caixaSelecao);

		// Exibir os elementos do Flowcontainer criado - Borda solida
		container04.exibir();
		

		/*****ABAIXO NOVA FUNCIONALIDADE - BORDA PONTILHADA GRIDCONTAINER*****/
		// Cria��o de um Gridcontainer(Rede container) com 4 posi��es - Borda pontilhada//
		Container container05 = new RedeContainerBordaPontilhada(2, 2);

		// Cria��o dos elementos - Borda pontilhada
		Component botaoPontilhadoGridContainer = new Component("Botao pontilhado - GridContainer");

		// Inclus�o dos elementos criados - Borda pontilhada
		container05.addComponent(botaoPontilhadoGridContainer);
		container05.addComponent(areaTexto);
		container05.addComponent(campoTexto);
		container05.addComponent(caixaSelecao);

		// Exibir os elementos do Gridcontainer criado - Borda pontilhada
		container05.exibir();
		

		/*****ABAIXO NOVA FUNCIONALIDADE - BORDA SOLIDA GRIDCONTAINER*****/
		// Cria��o de um Gridcontainer(Rede container) com 4 posi��es - Borda solida//
		Container container06 = new RedeContainerBordaSolida(2, 2);

		// Cria��o dos elementos - Borda solida
		Component botaoSolidoGridContainer = new Component("Botao solido - GridContainer");

		// Inclus�o dos elementos criados - Borda solida
		container06.addComponent(botaoSolidoGridContainer);
		container06.addComponent(areaTexto);
		container06.addComponent(campoTexto);
		container06.addComponent(caixaSelecao);

		// Exibir os elementos do Gridcontainer criado - Borda solida
		container06.exibir();
		
		/***ABAIXO NOVA FUNCIONALIDADE - BORDA PONTILHADA FLOWCONTAINER - OTIMIZADA***/
		// Cria��o de um Flowcontainer(Fluxo container) - Borda pontilhada - OTIMIZADA//
		Container container07 = new FluxoContainerBordaPontilhada();

		// Cria��o dos elementos - Borda pontilhada - OTIMIZADA
		Component botaoPontilhadoFlowContainerOtimizada = new Component("Botao pontilhado - FlowContainer - OTIMIZADA");

		// Inclus�o dos elementos criados - Borda pontilhada - OTIMIZADA
		container07.addComponent(botaoPontilhadoFlowContainerOtimizada);
		container07.addComponent(botaoRadio);
		container07.addComponent(areaTexto);
		container07.addComponent(campoTexto);
		container07.addComponent(caixaSelecao);
		
		// Exibir os elementos do Flowcontainer criado - Borda pontilhada - OTIMIZADA
		container07.exibir();
		
		/***ABAIXO NOVA FUNCIONALIDADE - BORDA SOLIDA FLOWCONTAINER - OTIMIZADA***/
		// Cria��o de um Flowcontainer(Fluxo container) - Borda solida - OTIMIZADA//
		Container container08 = new FluxoContainerBordaSolida();

		// Cria��o dos elementos - Borda solida - OTIMIZADA
		Component botaoSolidoFlowContainerOtimizada = new Component("Botao solido - FlowContainer - OTIMIZADA");

		// Inclus�o dos elementos criados - Borda solida - OTIMIZADA
		container08.addComponent(botaoSolidoFlowContainerOtimizada);
		container08.addComponent(botaoRadio);
		container08.addComponent(areaTexto);
		container08.addComponent(campoTexto);
		container08.addComponent(caixaSelecao);

		// Exibir os elementos do Flowcontainer criado - Borda solida - OTIMIZADA
		container08.exibir();
		
		/***ABAIXO NOVA FUNCIONALIDADE - BORDA PONTILHADA GRIDCONTAINER - OTIMIZADA***/
		// Cria��o de um Gridcontainer(Rede container) com 4 posi��es - Borda pontilhada - OTIMIZADA//
		Container container09 = new RedeContainerBordaPontilhada(2, 2);

		// Cria��o dos elementos - Borda pontilhada - OTIMIZADA
		Component botaoPontilhadoGridContainerOtimizada = new Component("Botao pontilhado - GridContainer - OTIMIZADA");

		// Inclus�o dos elementos criados - Borda pontilhada - OTIMIZADA
		container09.addComponent(botaoPontilhadoGridContainerOtimizada);
		container09.addComponent(areaTexto);
		container09.addComponent(campoTexto);
		container09.addComponent(caixaSelecao);

		// Exibir os elementos do Gridcontainer criado - Borda pontilhada - OTIMIZADA
		container09.exibir();
		

		/***ABAIXO NOVA FUNCIONALIDADE - BORDA SOLIDA GRIDCONTAINER -OTIMIZADA***/
		// Cria��o de um Gridcontainer(Rede container) com 4 posi��es - Borda solida - OTIMIZADA//
		Container container10 = new RedeContainerBordaSolida(2, 2);

		// Cria��o dos elementos - Borda solida - OTIMIZADA
		Component botaoSolidoGridContainerOtimizada = new Component("Botao solido - GridContainer - OTIMIZADA");

		// Inclus�o dos elementos criados - Borda solida - OTIMIZADA
		container10.addComponent(botaoSolidoGridContainerOtimizada);
		container10.addComponent(areaTexto);
		container10.addComponent(campoTexto);
		container10.addComponent(caixaSelecao);

		// Exibir os elementos do Gridcontainer criado - Borda solida - OTIMIZADA
		container10.exibir();
		
		
	}

}
