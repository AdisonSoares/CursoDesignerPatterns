package aula07.parte08_Adapter_SistemaGeralAplicacaoFabrica;

import aula07.parte06_Adapter_SistemaGeral.Adapter_SistemaContabil_IBM_Adaptee;
import aula07.parte06_Adapter_SistemaGeral.Adapter_SistemaContabil_ItauTec_Adaptee;
import aula07.parte06_Adapter_SistemaGeral.Adapter_SistemaContabil_SAP_Adaptee;

/**
 * @Fabrica_de_objetos
 * Classe responsável por encapsular a criação de objetos/adaptadores,
 * que estava variando nas outras classes adapter, para
 * seguir o principio de encapsular o que varia.
 * 
 * @Criacao de adaptadores para o sistema de estoque e contabilidade.
 */
public class Adapter_Fabrica {
	@SuppressWarnings("unused")
	private Adapter_SistemaContabil_ItauTec_Adaptee adapter_SistemaContabil;
	@SuppressWarnings("unused")
	private Adapter_SistemaEstoqueGeral adapter_SistemaEstoque;
	
	//Criação do objeto adapter
	public Adapter_SistemaContabilGeral criacaoSistemaContabil(String nome) {
		if (nome.equals("IBM")) {
			adapter_SistemaContabil = new Adapter_SistemaContabil_IBM_Adaptee();
		} else if (nome.equals("ItauTec")) {
			adapter_SistemaContabil = new Adapter_SistemaContabil_ItauTec_Adaptee();
		} else if (nome.equals("SAP")) {
			adapter_SistemaContabil = new Adapter_SistemaContabil_SAP_Adaptee();
		}
		
		return adapter_SistemaContabil; 
	}
}
