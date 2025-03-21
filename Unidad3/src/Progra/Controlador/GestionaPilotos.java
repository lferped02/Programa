package Progra.Controlador;

import java.time.LocalDate;
import EjemploEnum.EstadoVuelo;
import Progra.Modelo.*;

public class GestionaPilotos {
	public static void main(String[] args) {
		Piloto piloto = new Piloto("Pablo", "Español", 50, 1234, 0, null);
		Vuelo vuelo1 = new Vuelo("V001", "Vueling", "Italia", LocalDate.now(), 10, EstadoVuelo.PROGRAMADOR);
		Vuelo vuelos[]=new Vuelo[30];
		piloto.setVueloAsignados(vuelos);
		try {
			piloto.getAgregarVuelo(vuelos);
		}catch(VueloException e) {
			System.out.println(e.getMessage());
		}

	}

}
