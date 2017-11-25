// Consigna 4. Incompleta. Formulario  de cheques de terceros a vencer.
// 
//
//

package uade.ioo.vista.formularios;

import javax.swing.JFrame;
import javax.swing.JTable;

import uade.ioo.modelo.AdministradorPagos;
import uade.ioo.modeloVista.ModeloTablaVencer;

public class JFormularioChequeTerVencer extends JFormularioBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public JFormularioChequeTerVencer(AdministradorPagos modelo){
			super(modelo);
			
			this.setTitle("Listado de cheques próximos a vencer");
			
			
			JTable tabla = new JTable(new ModeloTablaVencer(getModelo()));
			this.getContentPane().add(tabla);
	}
}
