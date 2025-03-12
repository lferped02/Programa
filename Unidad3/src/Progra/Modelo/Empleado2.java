package Modelo;

import Interfaces.IAcciones;

public class Empleado2 implements IAcciones {

	@Override
	public String ejecutaAcciones() {
		return "Trabajador que trabaja";

	}

	@Override
	public String toString() {
		return ejecutaAcciones();
	}
}
