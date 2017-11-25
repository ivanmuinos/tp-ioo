// Consigna 5. Formulario de reportes. Faltan agregar campos y tambien ver la fecha.
//
//
//


package uade.ioo.vista.formularios;

import javax.swing.BoxLayout;
import javax.swing.JLabel;

import uade.ioo.modelo.AdministradorPagos;

public class JFormularioReporte extends JFormularioBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblMontoDisponibleCheqTercero = new JLabel("0");
	private JLabel lblMontoPagado = new JLabel("0");
	private JLabel lblMontoDepositadoBanco = new JLabel("0");
	private JLabel lblMontoDineroEmitido = new JLabel("0");
	private JLabel lblChequesAVencer = new JLabel("0");

	

	public JFormularioReporte(AdministradorPagos modelo) {
		super(modelo);
		
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		
		this.getContentPane().add(new JLabel("Monto disponible Cheques de Terceros: "));
		this.getContentPane().add(lblMontoDisponibleCheqTercero);
		
		this.getContentPane().add(new JLabel("Monto Pagado: "));
		this.getContentPane().add(lblMontoPagado);
		
		this.getContentPane().add(new JLabel("Monto Depositado en el Banco: "));
		this.getContentPane().add(lblMontoDepositadoBanco);
		
		this.getContentPane().add(new JLabel("Dinero Emitido: "));
		this.getContentPane().add(lblMontoDineroEmitido);
		
		this.getContentPane().add(new JLabel("Cheques a vencer: "));
		this.getContentPane().add(lblChequesAVencer);
		
		
	}
	
	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		super.actualizar();
		this.lblMontoDisponibleCheqTercero.setText(Double.toString(this.getModelo().getMontoDisponiblePagos()));
		
	}

}
