//Consigna 1) Menu Principal
//
//
//
package uade.ioo.vista.formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import uade.ioo.modelo.AdministradorPagos;

public class JFormularioPrincipal extends JFormularioBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JFormularioPrincipal(AdministradorPagos modelo) {
		super(modelo);
		this.setTitle("Administrador de Cheques");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();

		JMenu pagos = new JMenu("Pagos");
		JMenuItem opcPagarServicios = new JMenuItem("Servicios");
		menuBar.add(pagos);
		pagos.add(opcPagarServicios);
		
		opcPagarServicios.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame f = new JFormularioPagarServicios(getModelo());
				f.setVisible(true);
				
			}
		});
		
		
		
		JMenu cheques = new JMenu("Cheques");
		JMenuItem registrarChequesTerceros = new JMenuItem("Registrar Terceros");
		JMenuItem chequesTercerosVencer = new JMenuItem("Terceros a vencer");

		JMenu reportes = new JMenu("Reportes");
		JMenuItem reporteCheques = new JMenuItem("Reporte general de cheques");
		menuBar.add(reportes);
		reportes.add(reporteCheques);
		
		reporteCheques.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame f = new JFormularioReporte(getModelo());
				f.setVisible(true);
				
			}
		});

		
		registrarChequesTerceros.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frmRegChequesTerceros =  new JFormularioRegCheqTerceros(getModelo());
				frmRegChequesTerceros.setVisible(true);
				
			}
		});
	
		
		chequesTercerosVencer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frmChequesTerVencer = new JFormularioChequeTerVencer(getModelo());
				frmChequesTerVencer.setVisible(true);
				
			}
		});
		
		
		
		
		/*Esto sirve para darle funcionalidad a los botones del menu
		 * nuevo.addActionListener(new ActionListener(){
		 * 
		 * @Override public void actionPerformed(ActionEvent arg0) { // TODO
		 * Auto-generated method stub JFrame frm2 = new JFormularioTabla();
		 * frm2.setVisible(true);
		 * 
		 * } });
		 */

		

		cheques.add(registrarChequesTerceros);
		reportes.add(chequesTercerosVencer);

	

		
		menuBar.add(cheques);

		setJMenuBar(menuBar);

	}

}
