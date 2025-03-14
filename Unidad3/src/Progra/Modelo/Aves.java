package Progra.Modelo;

import java.time.LocalDate;

abstract abstract class Aves extends Mascota {
	protected String pico;
	protected boolean vuela;

	public Aves(String nombre, int edad, LocalDate fechaNacimiento, String pico, boolean vuela) {
		super(nombre, edad, fechaNacimiento);
		this.pico = pico;
		this.vuela = vuela;
	}

	public abstract String volar();

	@Override
	public String toString() {
		return "Aves [pico=" + pico + ", vuela=" + vuela + ", muestra()=" + muestra() + "]";
	}

	@Override
	public void setVuela(boolean vuela) {
		return;
	}

	public String saluda() {
		// TODO Auto-generated method stub
		return null;
	}
}
