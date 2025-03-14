package Progra.Modelo;


//Agregamos otra clase con otro comportamiento
public class Artista implements Fernández_LiLi_prueba.IAcciones {
	@Override
	public String ejecutaAcciones() {
		return "El pintor pinta";

	}

	@Override
	public String toString() {
		return ejecutaAcciones();
	}
}
