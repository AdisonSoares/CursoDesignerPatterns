package Aula05.parte02Facade_Fachada;

public class TesteProduto02 {
	public static void main(String[] args) {
		Produto p = new Produto(1,"CD", 7.50);
		
		//Exibição
		System.out.println(p.toString());
	}
}
