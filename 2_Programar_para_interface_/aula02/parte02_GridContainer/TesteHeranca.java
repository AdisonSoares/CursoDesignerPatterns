package aula02.parte02_GridContainer;

/**
 * @Classe main para teste
 * 
 * @CriandoConteines cada tipo de conteiner armazena os elementos
 * de forma diferente, em linha e em matriz, agrupam componetes
 * de interface gráfica do usuario.
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para INTERFACE.
 */
public class TesteHeranca {
	public static void main(String[] args) {
		
		/*****ABAIXO PRINCIPAL FUNCIONALIDADE - GRIDCONTAINER E FLOWCONTAINER*****/
		//Criação de um Gridcontainer(Rede container) com 4 posições
		Container container01 = new RedeContainer(2, 2);
		
		//Criação dos elementos 
		Component botao = new Component("Botao");
		Component areaTexto = new Component("Area texto");
		Component campoTexto = new Component("Campo texto");
		Component caixaSelecao = new Component("Caixa seleção");
		
		//Inclusão dos elementos criados
		container01.addComponent(botao);
		container01.addComponent(areaTexto);
		container01.addComponent(campoTexto);
		container01.addComponent(caixaSelecao);
		
		//Exibir os elementos do Gridcontainer criado
		container01.exibir();
		
		//Criação de um Flowcontainer(Fluxo container)
		Container container02 = new FluxoContainer();
		
		//Criação dos elementos 
		Component botaoRadio = new Component("Botao radio");
		
		//Inclusão dos elementos criados
		container02.addComponent(botao);
		container02.addComponent(botaoRadio);
		container02.addComponent(areaTexto);
		container02.addComponent(campoTexto);
		container02.addComponent(caixaSelecao);
		
		//Exibir os elementos do Flowcontainer criado
		container02.exibir();
	}

}
