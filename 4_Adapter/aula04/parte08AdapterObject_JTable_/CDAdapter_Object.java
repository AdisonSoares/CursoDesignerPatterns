package aula04.parte08AdapterObject_JTable_;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * @TableModel
 * A classe JTable depende da interface TableModel 
 * que possui, por padrão, uma implementação concreta
 * chamada AbstractTableModel.
 * 
 * @AbstractTableModel
 * Implementa diversos métodos da interface TableModel, 
 * mas outros métodos não são sobrescritos.
 * 
 * @CDAdapter
 * Herda de AbstractTableModel para subscrever e implementar 
 * os outros métodos que não são sobrescritos, como getRowCount,
 * getColumnCount e getValueAt.
 * 
 * @CDAdapter_sobrescrevendo_e_implementando os métodos herdados
 * de AbstractTableModel, adaptou a interface de CD para a interface
 * necessária do TableModel, foi feita uma composição com CD com
 * uma coleção de CDs e essa classe foi adaptada para a 
 * Interface TableModel, adaptando a interface CD, não compativel
 * com TableModel, sem precisar alterar a inteface Jtable e sem 
 * precisar alterar o codigo de CD.
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
