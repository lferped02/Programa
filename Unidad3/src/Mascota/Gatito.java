package Mascota;

import java.time.LocalDate;

public class Gatito extends Mascota {
	private String color;
	private boolean peloLargo;

	public Gatito(String nombre, int edad, LocalDate fechaNacimiento, String color, boolean peloLargo) {
		super(nombre, edad, fechaNacimiento);
		this.color = color;
		this.peloLargo = peloLargo;

	}

	@Override
	public boolean habla() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String muestra() {
		return "Gatito [color=" + color + ", peloLargo=" + peloLargo + ", muestra()=" + muestra() + "]";
	}

	@Override
	public String informacionCompleta() {
		return this.muestra();
	}
}
