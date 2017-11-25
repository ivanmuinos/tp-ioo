package uade.ioo.modeloVista;

import javax.swing.table.AbstractTableModel;

import uade.ioo.modelo.AdministradorPagos;
import uade.ioo.modelo.Cheque;

public class ModeloChequesUsados extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	private AdministradorPagos modelo;

	public ModeloChequesUsados(AdministradorPagos modelo) {
		this.modelo = modelo;

	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return modelo.getCheques().size();
	}

	@Override
	public Object getValueAt(int fila, int col) {

		for (int i = 0; i < modelo.getCheques().size(); i++) {
			if (fila == i) {
				if (col == 0) {
					return modelo.getCheques().get(i).getNumero();
				}
				if (col == 1) {
					return modelo.getCheques().get(i).getMonto();
				}
				if (col == 2){
					return modelo.getCheques().get(i).getFechaVencimiento(modelo.getCheques().get(i).getFechaEmision());
				}

			}
		}
		return "";
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 3;
	}

}
