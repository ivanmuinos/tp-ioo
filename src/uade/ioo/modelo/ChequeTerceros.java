package uade.ioo.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChequeTerceros extends Cheque{
	
	private List<EstadoCheque> estadosCheque = new ArrayList<EstadoCheque>();
	
	public ChequeTerceros(int numero, double monto, String fechaEmision) {
		super(numero, monto, fechaEmision);
		
	}

}
