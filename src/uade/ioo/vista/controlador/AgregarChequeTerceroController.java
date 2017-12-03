package uade.ioo.vista.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import uade.ioo.comportamiento.IVistaRecibirCheque;
import uade.ioo.modelo.AdministradorPagos;
import uade.ioo.modelo.ChequeTerceros;
import uade.ioo.modelo.EstadoCheque;
import uade.ioo.modelo.Recibido;

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
		ChequeTerceros c = new ChequeTerceros(this.vista.getNumero(), this.vista.getMonto(), this.vista.getFechaEmision(), "Recibido");
	
		this.modelo.registrarChequeTecero(c);
		
		JOptionPane.showMessageDialog(null, "Cheque de tercero registrado!");
	}
	
	
}
