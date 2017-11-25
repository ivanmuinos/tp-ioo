package uade.ioo.modeloVista;

import javax.swing.table.AbstractTableModel;

import uade.ioo.modelo.AdministradorPagos;

public class ModeloTablaVencer extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AdministradorPagos modelo;
	
	public ModeloTablaVencer(AdministradorPagos modelo){
		this.modelo = modelo;
	}
	
	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public int getRowCount() {
		return modelo.obtenerChequesTerceros(modelo.getCheques(), modelo.getChequera()).size();
	}

	@Override
	public Object getValueAt(int fila, int col) {
		for (int i = 0; i < modelo.obtenerChequesTerceros(modelo.getCheques(), modelo.getChequera()).size(); i++) {
			if (fila == i) {
				if (col == 0) {
					return modelo.obtenerChequesTerceros(modelo.getCheques(), modelo.getChequera()).get(i).getNumero();
				}
				if (col == 1) {
					return modelo.obtenerChequesTerceros(modelo.getCheques(), modelo.getChequera()).get(i).getMonto();
				}
				if (col == 2){
					
					return modelo.obtenerChequesTerceros(modelo.getCheques(), modelo.getChequera()).get(i).getFechaVencimiento(modelo.getCheques().get(i).getFechaEmision());
				}

			}
		}
		return "";
	}
}
