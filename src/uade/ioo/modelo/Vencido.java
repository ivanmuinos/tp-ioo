package uade.ioo.modelo;

public class Vencido extends EstadoCheque {

	public Vencido(String estado) {
		super(estado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String setearEstado() {
		return "Vencido";
	}

}
