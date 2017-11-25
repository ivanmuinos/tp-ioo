package uade.ioo.vista.formularios;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

// Consigna 2) Menu para registrar cheques de terceros
//
//
//


import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;

import uade.ioo.comportamiento.IVistaRecibirCheque;
import uade.ioo.modelo.AdministradorPagos;
import uade.ioo.vista.controlador.AgregarChequeTerceroController;

public class JFormularioRegCheqTerceros extends JFormularioBase implements IVistaRecibirCheque {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField txtMonto = new JTextField();
	private JTextField txtNumero = new JTextField();
	//private JTextField txtFechaEmision = new JTextField();
	
	private JFormattedTextField  txtFechaEmision = new JFormattedTextField();
	private JButton btnAgregarCheque = new JButton("Registrar");

	public JFormularioRegCheqTerceros(AdministradorPagos modelo) {
		super(modelo);
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		this.txtFechaEmision.setText(format.format(date));
		
		this.getContentPane().add(new JLabel("Numero: "));
		this.getContentPane().add(txtNumero);
		this.getContentPane().add(new JLabel("Monto: "));
		this.getContentPane().add(txtMonto);
		this.getContentPane().add(new JLabel("Fecha Emision: [dd/MM/YYYY] "));
		this.getContentPane().add(txtFechaEmision);
		this.getContentPane().add(btnAgregarCheque);
		
		
		this.btnAgregarCheque.addActionListener(
				new AgregarChequeTerceroController(
						this.getModelo(),
						this
						));
		
		btnAgregarCheque.setMaximumSize(getMaximumSize());

}

	@Override
	public int getNumero() {
		// TODO Auto-generated method stub
		return Integer.parseInt(this.txtNumero.getText());
	}

	@Override
	public double getMonto() {
		// TODO Auto-generated method stub
		return Double.parseDouble(this.txtMonto.getText());
	}

	@Override
	public String getFechaEmision() {
		// TODO Auto-generated method stub
		return this.txtFechaEmision.getText();
	}




}
