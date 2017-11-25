package uade.ioo.modelo;

public abstract class EstadoCheque {
	private String estado;
	
	public EstadoCheque(String estado) {
		super();
		this.estado = estado;
	}

	protected String getEstado() {
		return estado;
	}

	public abstract String setearEstado();
}
