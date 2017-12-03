package uade.ioo.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import uade.ioo.observer.Observado;

public class AdministradorPagos extends Observado {
	private List<Cheque> cheques = new ArrayList<Cheque>();
	private List<Chequera> chequera = new ArrayList<Chequera>();
	private List<Cheque> listaPagosHechos = new ArrayList<Cheque>();

	public List<Cheque> getCheques() {
		return Collections.unmodifiableList(cheques);
	}

	public List<Chequera> getChequera() {
		return Collections.unmodifiableList(chequera);
	}

	public void registrarChequeTecero(ChequeTerceros cheque) {

		this.cheques.add(cheque);

		this.notificarObservadores();
	}

	public boolean calcularProxVencer(String fecha) {

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		Date date2 = new Date();

		try {
			date = format.parse(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, 20);
		date = calendar.getTime();
		
		if(date.before(date2)){
			return true;
		}else{
			return false;
		}
	
	}

	public double getMontoDisponibleChequeTerceros() {
		double result = 0;

		for (Cheque c : this.cheques) {
			if (c instanceof ChequeTerceros) {
				if (((ChequeTerceros) c).getEstado() == "Recibido") {
					result += c.getMonto();
				}
			}
		}

		return result;
	}

	public double getMontosVarios(List<Cheque> cheques) {
		double result = 0;

		for (Cheque cheque : cheques) {
			result += cheque.getMonto();
		}
		return result;
	}

	public void registrarChequePropio(ChequePropio cheque) {

		this.cheques.add(cheque);

		this.notificarObservadores();
	}

	public void registrarPagosHechos(Cheque cheque) {
		this.listaPagosHechos.add(cheque);
		this.notificarObservadores();

	}

	/*
	 * public void registrarPagosHechos(int numero, List<Cheque> cheques) {
	 * 
	 * for (Cheque cheque : cheques) { if (cheque.getNumero() == numero) {
	 * listaPagosHechos.add(cheque); this.notificarObservadores(); } }
	 * 
	 * }
	 */

	public void actualizarPagoCheque(Cheque cheques) {

		cheques.setMonto(0);

	}

	public double getPagosHechos() {
		double result = 0;

		for (Cheque cheque : this.listaPagosHechos) {
			result += cheque.getMonto();
		}

		System.out.println("resultado: " + result);
		return result;
	}

	public double getMontoDepositadoBanco() {
		double result = 0;

		for (Cheque c : this.cheques) {

			result += c.getMonto();

		}

		return result;
	}

	public List<Cheque> obtenerChequesTerceros(List<Cheque> cheques, List<Chequera> chequera) {
		List<Cheque> listaChequesTerceros = new ArrayList<Cheque>();

		for (Cheque cheque : cheques) {
			if (cheque instanceof ChequeTerceros) {
				listaChequesTerceros.add(cheque);
			}
		}

		return listaChequesTerceros;
	}

}