package uade.ioo.modelo;

import java.util.ArrayList;
import java.util.List;

public class Chequera {
	private List<ChequePropio> listChequePropio = new ArrayList<ChequePropio>();
	
	
	public List<ChequePropio> getListChequePropio() {
		return listChequePropio;
	}

	public Chequera(List<ChequePropio> listChequePropio) {
		super();
		this.listChequePropio = listChequePropio;
	}


	public int ultimoNumero() {
		return this.listChequePropio.get(this.listChequePropio.size()).getNumero();
	}

	
}
