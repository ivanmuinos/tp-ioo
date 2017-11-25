package uade.ioo.principal;
import javax.swing.JFrame;

import uade.ioo.modelo.AdministradorPagos;
import uade.ioo.vista.formularios.JFormularioPrincipal;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdministradorPagos modelo = new AdministradorPagos();
		JFrame formularioPrincipal = new JFormularioPrincipal(modelo);
		formularioPrincipal.setVisible(true);
		
	}

}
