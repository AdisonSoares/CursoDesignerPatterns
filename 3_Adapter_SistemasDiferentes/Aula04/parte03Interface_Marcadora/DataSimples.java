package Aula04.parte03Interface_Marcadora;

/**
 * @Regras_adicionais_interface_marcadora
 * Nem toda interface precisa de m�todos pois podem ser marcadoras, pode-se criar
 * interfaces marcadoras em que suas subclasses escolham se v�o ou n�o participar 
 * dos comportamentos previstos por ela.
 * 
 * @.clone faz parte da classe Object que toda a classe herda de forma padr�o que retorna
 * um object, caso n�o queira esse retorna precisa fazer um cast.
 * 
 * @InterfaceCloneable n�o possui assinaturas de m�todos, pois � uma interface marcadora
 * servindo apenas para notificar outra classe que determinado evento acontece.
 * 
 * @Problem�tica
 * Ao clonar um objeto � gerada uma exce��o n�o finalizando a clonagem.
 * 
 * @Solu��o
 * No simples ato de instanciar a interface cloneable na classe que vai ser clonada,
 * mesmo n�o implementando nada, esse problema � resolvido.
 */
public class DataSimples implements Cloneable {
	private int dia, mes, ano;
	
	public DataSimples() {
	}
	
	public DataSimples(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return this.dia+"/"+this.mes+"/"+this.ano;
	}
	
	public static void main(String[] args) {
		System.out.println("Exibindo a data");
		DataSimples data = new DataSimples(25, 01, 2022);
		
		//Exibi��o
		System.out.println(data.toString());
		
		//Clonando o objeto
		try {
			DataSimples cloneObjeto = (DataSimples)data.clone();
			System.out.println("Exibindo a data clonada");
			System.out.println(cloneObjeto.toString() );
		} catch (CloneNotSupportedException e) {
			System.out.println("Problema durante a clonagem");
		}
	}
}




















