package uade.ioo.modelo;

public class Recibido extends EstadoCheque {

	public Recibido(String estado) {
		super(estado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String setearEstado() {
		return "Recibido";
	}

}
