// Consigna 3) Menu para pagar con cheques
//
//
//



package uade.ioo.vista.formularios;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JOptionPane;

import uade.ioo.modelo.AdministradorPagos;
import uade.ioo.modeloVista.ModeloChequesUsados;

public class JFormularioPagarServicios extends JFormularioBase{
	
	private JTextField txtMontoPagar = new JTextField();
	private JButton btnPagar = new JButton("Pagar");
	private JTable tabla;
	private double txtMonto;
	private double montoSeleccionado;
	

	public JFormularioPagarServicios(AdministradorPagos modelo) {
		super(modelo);
		// TODO Auto-generated constructor stub
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		this.getContentPane().add(new JLabel("Monto a pagar"));
		this.getContentPane().add(txtMontoPagar);
		this.getContentPane().add(btnPagar);
		btnPagar.setMaximumSize(getMaximumSize());
		
		this.tabla = new JTable(new ModeloChequesUsados(getModelo()));
		this.getContentPane().add(tabla);
		
		tabla.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				txtMonto = Double.parseDouble(txtMontoPagar.getText());
				montoSeleccionado =  (double) tabla.getValueAt(tabla.getSelectedRow(),1);
			
			}
		});
		
		btnPagar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(txtMonto > montoSeleccionado){
					int opcion = JOptionPane.showConfirmDialog(null, 
							"El cheque no posee monto suficiente. ¿Desea emitir un Cheque Propio?",
							"Monto insuficiente",
							JOptionPane.YES_NO_OPTION);
					
					if (opcion == 0){
						JFrame f = new JFormularioEmitirChequePropio(getModelo(), txtMonto - montoSeleccionado);
						f.setVisible(true);
					}
				}else{
					
					
				}
				
			}
		});
		
		
		
		
		
	}
	
	private static final long serialVersionUID=1L;

	
}
