package uade.ioo.vista.formularios;


import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import uade.ioo.comportamiento.IVistaRecibirCheque;
import uade.ioo.modelo.AdministradorPagos;
import uade.ioo.vista.controlador.EmitirChequePropioController;

public class JFormularioEmitirChequePropio extends JFormularioBase implements IVistaRecibirCheque {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField txtMonto = new JTextField();
	private JTextField txtNumero = new JTextField();
	private JTextField txtFechaEmision = new JTextField();
	private JButton btnAgregarCheque = new JButton("Registrar");

	private double faltante;

	public JFormularioEmitirChequePropio(AdministradorPagos modelo, double faltante) {
		super(modelo);
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		this.faltante = faltante;
		this.getContentPane().add(new JLabel("Numero: "));
		this.getContentPane().add(txtNumero);
		this.getContentPane().add(new JLabel("Monto: "));
		this.getContentPane().add(txtMonto);
		this.getContentPane().add(new JLabel("Fecha Emision: [dd/MM/yyyy]"));
		this.getContentPane().add(txtFechaEmision);
		this.getContentPane().add(btnAgregarCheque);
		
		if(faltante != 0){
			txtMonto.setText(Double.toString(faltante));
		}
		
		this.btnAgregarCheque.addActionListener(
				new EmitirChequePropioController(
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
		return Integer.parseInt(this.txtMonto.getText());
	}

	@Override
	public String getFechaEmision() {
		// TODO Auto-generated method stub
		return this.txtFechaEmision.getText();
	}


}
