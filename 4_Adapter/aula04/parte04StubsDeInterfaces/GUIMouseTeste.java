package aula04.parte04StubsDeInterfaces;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
* @Stubs_de_Interfaces facilita a implementação de uma interface com
* muitos métodos.
* 
* @Stubs são implementações vazias de intefaces com muitos metodos
* que são oferecidos, em vez de implementar se escolhe herdar
* para poder fazer implementações vazias, não sendo mais exigida
* a implementação de todos os metodos abstratos da interface,
* no exemplo da classe MyMouseListener herdando de MouseAdapter.
* 
* @MouseAdapter é um tipo de Adapter e um tipo de Stub, fornecendo
* implementações vazias da interface que implementa.
* 
* @Jframes são janelas.
* 
* @InerClass é uma classe dentro de outra classe, no exemplo de MouseListener.
*
* @Na_implementação não é necessário o uso de todos os métodos 
* apenas entrada e saida do mouse, como é obrigatorio implementar
* todos o métodos da interface é necessário deixar os outros 
* métodos obsoleto.
*/
public class GUIMouseTeste {
	@SuppressWarnings("unused")
	private JFrame jFrame;

	public GUIMouseTeste() {
		JFrame jFrame = new JFrame();
		jFrame.setSize(500, 400);
		jFrame.addMouseListener(new MyMouseListener());
		jFrame.setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println("Mouse presente na janela");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println("Mouse saiu da janela ");
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("Mouse clicou aqui");
		}
	}

/************************MÉTODO MAIN***************************/	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		GUIMouseTeste guiMouseTeste = new GUIMouseTeste();

	}

}
