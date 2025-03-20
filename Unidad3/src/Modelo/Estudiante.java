package Progra.Modelo;

import Fernández_LiLi_prueba.IAcciones;

//Agregamos más clases para hacer evidente el problema

public class Estudiante implements IAcciones {

	public Estudiante(String nombre) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ejecutaAcciones() {
		return "Estudiante estudia";

	}

	@Override
	public String toString() {
		return ejecutaAcciones();
	}

}
