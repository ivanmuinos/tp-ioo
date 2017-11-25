package uade.ioo.vista.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import uade.ioo.comportamiento.IVistaRecibirCheque;
import uade.ioo.modelo.AdministradorPagos;
import uade.ioo.modelo.ChequeTerceros;

public class AgregarChequeTerceroController implements ActionListener {
	private AdministradorPagos modelo;
	private IVistaRecibirCheque vista;
	
	public AgregarChequeTerceroController(AdministradorPagos modelo, IVistaRecibirCheque vista) {
		super();
		this.modelo = modelo;
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		ChequeTerceros c = new ChequeTerceros(this.vista.getNumero(), this.vista.getMonto(), this.vista.getFechaEmision());
		/*System.out.println(this.vista.getNumero() + this.vista.getMonto());*/
		System.out.println(this.vista.getFechaEmision());
		this.modelo.registrarChequeTecero(c);
		System.out.println(modelo.getCheques().get(0).getFechaEmision());
		System.out.println(modelo.getCheques().get(0).getFechaVencimiento(this.vista.getFechaEmision()));
		
		System.out.println(modelo.obtenerChequesTerceros(modelo.getCheques(), modelo.getChequera()));
		
	}
	
	
}
