package Fernández_LiLi_prueba;

public class Telefono extends Dispositivo {
	private boolean tieneTecladoFisico;

	protected Telefono(String marca, String modelo, double precio, boolean tieneTecladoFisico) {
		super(marca, modelo, precio);
		this.tieneTecladoFisico = tieneTecladoFisico;
	}

	protected boolean isTieneTecladoFisico() {
		return tieneTecladoFisico;
	}

	protected void setTieneTecladoFisico(boolean tieneTecladoFisico) {
		this.tieneTecladoFisico = tieneTecladoFisico;
	}

}
