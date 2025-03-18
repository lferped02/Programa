package Progra.Controlador;

import java.util.Arrays;

import Progra.Modelo.*;
import Progra.Modelo.Gatito;
import Progra.Modelo.Mascota;

public class GestionaTiendaAnimales {
	public static void main(String[] args) {
		int contador = 0;

		Gatito gatito = new Gatito(null, contador, null);
		System.out.println(gatito.equals(gatito));

		Mascota[] animales = new Mascota[10];
		animales[contador] = gatito;
		contador += 1;
		System.out.println(Arrays.toString(animales));
	}
}
