package aula02.parte01_FlowContainer_;

/**
 * @Classe main para teste
 * 
 * @CriandoConteines
 * Cada tipo de conteiner armazena os elementos
 * de forma diferente, em linha (FlowContainer) e em matriz (GridContainer), 
 * agrupam componentes de interface gráfica do usuario.
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para INTERFACE.
 */
public class TesteHeranca {
	public static void main(String[] args) {
		
		/*****ABAIXO PRINCIPAL FUNCIONALIDADE - GRIDCONTAINER E FLOWCONTAINER*****/
		//Criação de um Flowcontainer(Fluxo container)
		Container container01 = new FluxoContainer();
		
		//Criação dos elementos 
		Component botao = new Component("Botao");
		Component botaoRadio = new Component("Botao radio");
		Component areaTexto = new Component("Area texto");
		Component campoTexto = new Component("Campo texto");
		Component caixaSelecao = new Component("Caixa seleção");
		
		//Inclusão dos elementos criados
		container01.addComponent(botao);
		container01.addComponent(botaoRadio);
		container01.addComponent(areaTexto);
		container01.addComponent(campoTexto);
		container01.addComponent(caixaSelecao);
		
		//Exibir os elementos do Flowcontainer criado
		container01.exibir();
	}

}
