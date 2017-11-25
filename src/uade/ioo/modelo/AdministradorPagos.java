package uade.ioo.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uade.ioo.observer.Observado;

public class AdministradorPagos extends Observado{
	private List<Cheque> cheques = new ArrayList<Cheque>();
	private List<Chequera> chequera = new ArrayList<Chequera>();

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
	
	public double getMontoDisponiblePagos() {
		double result = 0;
		
		for(Cheque c: this.cheques) {
			result += c.getMonto();
		}
		
		return result;
	}
	
	public void registrarChequePropio(ChequePropio cheque) {
		
		this.cheques.add(cheque);
		
		
		this.notificarObservadores();
	}
	
	public List<Cheque> obtenerChequesTerceros(List<Cheque> cheques, List<Chequera> chequera){
		List<Cheque> listaChequesTerceros = new ArrayList<Cheque>();
		
		for(Cheque cheque: cheques){
			if(cheque instanceof ChequeTerceros){
				listaChequesTerceros.add(cheque);
			}
		}
		
		return listaChequesTerceros;
	}
	
}