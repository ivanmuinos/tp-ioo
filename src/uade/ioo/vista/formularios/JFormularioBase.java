package uade.ioo.vista.formularios;

import javax.swing.JFrame;

import uade.ioo.modelo.AdministradorPagos;
import uade.ioo.observer.IObservador;

public abstract class JFormularioBase extends JFrame implements IObservador {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private AdministradorPagos modelo;
	
	public JFormularioBase(AdministradorPagos modelo) {
		this.modelo = modelo;
		this.modelo.registrarObservador(this);
		
		this.setSize(640, 480);
		this.setLocationRelativeTo(null);
	}

	public AdministradorPagos getModelo() {
		return modelo;
	}

	public void actualizar() {
		
	}
	
	
}
