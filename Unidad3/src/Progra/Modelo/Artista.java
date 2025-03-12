package Modelo;

import Interfaces.IAcciones;

//Agregamos otra clase con otro comportamiento
public class Artista implements IAcciones {
	@Override
	public String ejecutaAcciones() {
		return "El pintor pinta";

	}

	@Override
	public String toString() {
		return ejecutaAcciones();
	}
}
