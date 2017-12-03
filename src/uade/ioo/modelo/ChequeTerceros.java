package uade.ioo.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChequeTerceros extends Cheque{
	private String estado;
	//private List<EstadoCheque> estadosCheque = new ArrayList<EstadoCheque>();
	

	public ChequeTerceros(int numero, double monto, String fechaEmision, String estado) {
		super(numero, monto, fechaEmision);
		this.estado = estado;
		
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}

}
