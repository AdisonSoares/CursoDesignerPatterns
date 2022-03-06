package aula07.parte06_Adapter_SistemaGeral_AplicacaoFabrica;

/**
 * @Fabrica_de_objetos
 * Classe responsável por encapsular a criação de objetos/adaptadores,
 * que estava variando nas outras classes adapter, para
 * seguir o principio de encapsular o que varia.
 * 
 * @Criacao de adaptadores para o sistema de estoque e contabilidade.
 */
public class Adapter_Fabrica {
	private Adapter_SistemaContabil adapterSistemaContabil;
	private Adapter_SistemaEstoque adapterSistemaEstoque;

	public Adapter_SistemaContabil criacaoAdapterSistemaContabil(String nome) {
		if (nome.equals("IBM")) {
			adapterSistemaContabil = new Adapter_SistemaContabil_IBM_Adaptee();
		} else if (nome.equals("ItauTec")) {
			adapterSistemaContabil = new Adapter_SistemaContabil_ItauTec_Adaptee();
		} else if (nome.equals("SAP")) {
			adapterSistemaContabil = new Adapter_SistemaContabil_SAP_Adaptee();
		}

		return adapterSistemaContabil;
	}

	public Adapter_SistemaEstoque criacaoAdapterSistemaEstoque(String nome) {
		if (nome.equals("IBM")) {
			adapterSistemaEstoque = new Adapter_SistemaEstoque_IBM_Adaptee();
		} else if (nome.equals("ItauTec")) {
			adapterSistemaEstoque = new Adapter_SistemaEstoque_ItauTec_Adaptee();
		} else if (nome.equals("SAP")) {
			adapterSistemaEstoque = new Adapter_SistemaEstoque_SAP_Adaptee();
		}

		return adapterSistemaEstoque;
	}
}
