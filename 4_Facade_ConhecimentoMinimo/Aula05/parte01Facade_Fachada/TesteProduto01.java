package Aula05.parte01Facade_Fachada;

public class TesteProduto01 {
	public static void main(String[] args) {
		Produto p = new Produto(01,"CD", 7.50);
		
		//Exibi��o
		System.out.println(p.toString());
	}
}
