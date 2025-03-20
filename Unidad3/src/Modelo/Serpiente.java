package Progra.Modelo;

import java.time.LocalDate;

public class Serpiente extends Mascota {
	private int numeroMudaPiel;
	private int mesesGestacion;

	public Serpiente(String nombre, int edad, LocalDate fechaNacimiento, int numeroMudaPiel, int mesesGestacion) {
		super(nombre, edad, fechaNacimiento);
		this.numeroMudaPiel = numeroMudaPiel;
		this.mesesGestacion = mesesGestacion;
	}

	@Override
	public boolean habla() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String muestra() {
		return "Serpiente [numeroMudaPiel=" + numeroMudaPiel + ", mesesGestacion=" + mesesGestacion + ", muestra()="
				+ muestra() + "]";
	}

	@Override
	public String informacionCompleta() {
		return this.muestra();
	}

}
