package uade.ioo.modelo;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Cheque {
	protected int numero;
	private double monto;
	private String fechaEmision;

	
	public Cheque(int numero, double monto, String fechaEmision) {
		super();
		this.numero = numero;
		this.monto = monto;
		this.fechaEmision = fechaEmision;
	}
	
	
	public String getFechaVencimiento(String fechaEmision){
		
		String fechaVencimiento = "";
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		
		try {
			date = format.parse(fechaEmision);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, 30);
		date = calendar.getTime();
		
		fechaVencimiento = format.format(date);
		
		return fechaVencimiento;
	}
	
	public String getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}


	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}


	public void SePuedePagarCon(){
	
	}

}
