package Fernández_LiLi_prueba;

public class Computadora extends Dispositivo {
	private int capacidadRam;

	protected Computadora(String marca, String modelo, double precio, int capacidadRam) {
		super(marca, modelo, precio);
		this.capacidadRam = capacidadRam;
	}

	protected int getCapacidadRam() {
		return capacidadRam;
	}

	protected void setCapacidadRam(int capacidadRam) {
		
		this.capacidadRam = capacidadRam;
	}

}
