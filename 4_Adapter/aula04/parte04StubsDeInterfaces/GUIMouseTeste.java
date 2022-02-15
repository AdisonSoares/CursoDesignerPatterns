package aula04.parte04StubsDeInterfaces;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
* @Stubs_de_Interfaces facilita a implementa��o de uma interface com
* muitos m�todos.
* 
* @Stubs s�o implementa��es vazias de intefaces com muitos metodos
* que s�o oferecidos, em vez de implementar se escolhe herdar
* para poder fazer implementa��es vazias, n�o sendo mais exigida
* a implementa��o de todos os metodos abstratos da interface,
* no exemplo da classe MyMouseListener herdando de MouseAdapter.
* 
* @MouseAdapter � um tipo de Adapter e um tipo de Stub, fornecendo
* implementa��es vazias da interface que implementa.
* 
* @Jframes s�o janelas.
* 
* @InerClass � uma classe dentro de outra classe, no exemplo de MouseListener.
*
* @Na_implementa��o n�o � necess�rio o uso de todos os m�todos 
* apenas entrada e saida do mouse, como � obrigatorio implementar
* todos o m�todos da interface � necess�rio deixar os outros 
* m�todos obsoleto.
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

/************************M�TODO MAIN***************************/	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		GUIMouseTeste guiMouseTeste = new GUIMouseTeste();

	}

}
