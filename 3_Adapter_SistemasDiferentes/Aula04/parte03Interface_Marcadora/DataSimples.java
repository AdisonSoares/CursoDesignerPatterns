package Aula04.parte03Interface_Marcadora;

/**
 * @Regras_adicionais_interface_marcadora
 * Nem toda interface precisa de métodos pois podem ser marcadoras, pode-se criar
 * interfaces marcadoras em que suas subclasses escolham se vão ou não participar 
 * dos comportamentos previstos por ela.
 * 
 * @.clone faz parte da classe Object que toda a classe herda de forma padrão que retorna
 * um object, caso não queira esse retorna precisa fazer um cast.
 * 
 * @InterfaceCloneable não possui assinaturas de métodos, pois é uma interface marcadora
 * servindo apenas para notificar outra classe que determinado evento acontece.
 * 
 * @Problemática
 * Ao clonar um objeto é gerada uma exceção não finalizando a clonagem.
 * 
 * @Solução
 * No simples ato de instanciar a interface cloneable na classe que vai ser clonada,
 * mesmo não implementando nada, esse problema é resolvido.
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
		
		//Exibição
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




















