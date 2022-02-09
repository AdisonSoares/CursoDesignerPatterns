package aula04.parte07AdapterObject_;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * @ObjectAdapter possui a mesma estrutura de um class adapter,
 * tendo como diferencial o target(alvo), que n�o � uma interface
 * � uma classe, j� que em java n�o permite heran�a multipla, 
 * precisa fazer com que o adapter herde de target, em vez
 * de implementar o target, fazendo com que o adapter n�o 
 * herde do adaptee.
 * 
 * @Atraves_de_composi��o o adapter consegue adaptar a interface
 * esperada pelo cliente e a interface do presente no adaptee.
 *
 */
public class CDTela {
	private JFrame tela;
	private JTable tabela;
	private JScrollPane painelRolagem;
	private JLabel gravadora;
	
	/*//Container get containerpainel j� retorna//
	private JPanel painel;*/
	
	public CDTela() {
		tela = new JFrame("CD Cole��o");
		tela.setSize(300,200);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gravadora = new JLabel("Melhores CDs");//screentitle
		tabela = new JTable(3, 4);
		painelRolagem = new JScrollPane(tabela);
		//painel = new JPanel();
	}
	
	public void configurarTela() {
		/*  DUPLICA��O
		painel.setLayout(new BorderLayout());
		painel.add(etiqueta, BorderLayout.NORTH);
		painel.add(painelRolagem, BorderLayout.CENTER); */
		
		Container c = tela.getContentPane();
		c.add(gravadora,BorderLayout.NORTH);//screentitle
		c.add(painelRolagem,BorderLayout.CENTER);//scrollpane
	}
	
	private void renderizarTela() {
		tela.setVisible(true);
	}
	
	public static void main(String[] args) {
		CDTela cd = new CDTela();	
		cd.configurarTela();
		cd.renderizarTela();
	}
}




















