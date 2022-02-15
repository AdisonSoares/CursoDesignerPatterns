package aula04.parte08AdapterObject_JTable_;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * @TableModel
 * A classe JTable depende da interface TableModel 
 * que possui, por padr�o, uma implementa��o concreta
 * chamada AbstractTableModel.
 * 
 * @AbstractTableModel
 * Implementa diversos m�todos da interface TableModel, 
 * mas outros m�todos n�o s�o sobrescritos.
 * 
 * @CDAdapter
 * Herda de AbstractTableModel para subscrever e implementar 
 * os outros m�todos que n�o s�o sobrescritos, como getRowCount,
 * getColumnCount e getValueAt.
 * 
 * @CDAdapter_sobrescrevendo_e_implementando os m�todos herdados
 * de AbstractTableModel, adaptou a interface de CD para a interface
 * necess�ria do TableModel, foi feita uma composi��o com CD com
 * uma cole��o de CDs e essa classe foi adaptada para a 
 * Interface TableModel, adaptando a interface CD, n�o compativel
 * com TableModel, sem precisar alterar a inteface Jtable e sem 
 * precisar alterar o codigo de CD.
 * 
 * @ObjectAdapter possui a mesma estrutura de um class adapter, 
 * tendo como diferencial o target(alvo), que n�o � uma interface 
 * � uma classe, j� que em java n�o permite heran�a multipla, 
 * precisa fazer com que o adapter herde de target, em vez de 
 * implementar o target, fazendo com que o adapter n�o herde do adaptee.
 * 
 * @Atraves_de_composi��o o adapter consegue adaptar a interface esperada
 * pelo cliente e a interface do presente no adaptee.
 */
@SuppressWarnings("serial")
public class CDAdapter_Object extends AbstractTableModel {
	private List<CD> cds;
	private String[] colunas = { "Artista", "Album", "Etiqueta", "Ano" };

	public CDAdapter_Object() {
		cds = new ArrayList<CD>();
	}

	public void adicionarCD(CD cd) {
		cds.add(cd);
	}

	@Override
	public int getRowCount() {
		return cds.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		CD temp = cds.get(rowIndex);
		Object returned = null;
		switch (columnIndex) {
			case 0:
				returned = temp.getNome();
				break;
			case 1:
				returned = temp.getAlbum();
				break;
			case 2:
				returned = temp.getGravadora();
				break;
			case 3:
				returned = temp.getAno();
				break;				
		}
		return returned;
	}
}
