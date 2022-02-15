package aula04.parte08AdapterObject_JTable_;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * @CDTela vai utilizar a classe CDAdapter_Object que herda da classe
 * Abstract Table Model.
 * 
 * @ObjectAdapter possui a mesma estrutura de um class adapter, 
 * tendo como diferencial o target(alvo), que não é uma interface 
 * é uma classe, já que em java não permite herança multipla, 
 * precisa fazer com que o adapter herde de target, em vez de 
 * implementar o target, fazendo com que o adapter não herde do adaptee.
 * 
 * @Atraves_de_composição o adapter consegue adaptar a interface esperada
 * pelo cliente e a interface do presente no adaptee.
 */
public class CDTela {
	private JFrame tela;
	private JTable tabela;
	private JScrollPane painelRolagem;
	private JLabel gravadora;
	private CDAdapter_Object cdAdapter_Object;
	
	/*//Container get containerpainel já retorna//
	private JPanel painel;*/
	
	public CDTela() {
		tela = new JFrame("CD Coleção");
		tela.setSize(300,200);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gravadora = new JLabel("Melhores CDs");//screentitle
		
		//Configurando o Adapter
		CD legiao = new CD("Legiao", "Vento no litoral", "Som livre", 1994);
		CD mamonas = new CD("Mamonas", "Mamonas assassinas", "Som livre", 1995);
		CD zeRamalho = new CD("Zé Ramalho", "Avohai", "Som livre", 1976);
		CD victorELeo = new CD("Victor e Leo", "Borboletas", "Som livre", 2008);
		
		//Instanciando o adapter object
		cdAdapter_Object = new CDAdapter_Object();
		
		//Adicionando os CDs
		cdAdapter_Object.adicionarCD(legiao);
		cdAdapter_Object.adicionarCD(mamonas);
		cdAdapter_Object.adicionarCD(zeRamalho);
		cdAdapter_Object.adicionarCD(victorELeo);
		
		/*Ao criar um jtable não precisa especificar linhas e colunas
		 *passando apenas uma implementação do Adapter que é do
		 *abstract table mode ou uma classe que herde dele,
		 *nesse caso o cdAdapter_Object herda de abstract table mode*/
		tabela = new JTable(cdAdapter_Object);
		painelRolagem = new JScrollPane(tabela);
		//painel = new JPanel();
	}
	
	public void configurarTela() {
		/*  DUPLICAÇÃO
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




















