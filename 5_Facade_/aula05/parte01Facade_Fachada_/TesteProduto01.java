package aula05.parte01Facade_Fachada_;

public class TesteProduto01 {
	public static void main(String[] args) {
		Produto p = new Produto(01,"CD", 7.50);
		
		//Exibição
		System.out.println(p.toString());
	}
}
