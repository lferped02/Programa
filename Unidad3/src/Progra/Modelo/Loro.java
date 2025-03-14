package Progra.Modelo;

import java.time.LocalDate;

public class Loro extends Aves {
	private String origen;

	public Loro(String nombre, int edad, LocalDate fechaNacimiento, String origen, String pico, boolean vuela) {
		super(nombre, edad, fechaNacimiento, pico, vuela);
		this.origen = origen;
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return this.vuela ? "Estoy volando" : "No puedo volar";
	}

	@Override
	public String saluda() {
		boolean saluda = false;
		
		return ;

	}

	@Override
	public boolean habla() {
		// TODO Auto-generated method stub
		return true;

	}

	@Override
	public String muestra() {
		return "Loro [origen=" + origen + ", muestra()=" + muestra() + "]";
	}

	@Override
	public String informacionCompleta() {
		return this.muestra() + ", Saludo: " + this.saluda();
	}

}
