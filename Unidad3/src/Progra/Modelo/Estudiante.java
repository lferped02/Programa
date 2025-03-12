package Modelo;

import Interfaces.IAcciones;

//Agregamos más clases para hacer evidente el problema

public class Estudiante implements IAcciones {

	@Override
	public String ejecutaAcciones() {
		return "Estudiante estudia";

	}

	@Override
	public String toString() {
		return ejecutaAcciones();
	}

}
