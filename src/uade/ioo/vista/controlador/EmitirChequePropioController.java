package uade.ioo.vista.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import uade.ioo.comportamiento.IVistaRecibirCheque;
import uade.ioo.modelo.AdministradorPagos;
import uade.ioo.modelo.ChequePropio;

public class EmitirChequePropioController implements ActionListener {
	private AdministradorPagos modelo;
	private IVistaRecibirCheque vista;
	
	public EmitirChequePropioController(AdministradorPagos modelo, IVistaRecibirCheque vista) {
		super();
		this.modelo = modelo;
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		ChequePropio c = new ChequePropio(this.vista.getNumero(), this.vista.getMonto(), this.vista.getFechaEmision());
		
		this.modelo.registrarChequePropio(c);
		
		System.out.println(modelo.obtenerChequesTerceros(modelo.getCheques(), modelo.getChequera()));
	}
	
	
}