package Mascota;

import java.util.Arrays;

import Modelo.*;

public class GestionaTiendaAnimales {
	public static void main(String[] args) {
		int contador = 0;

		Gatito gatito = new Gatito();
		System.out.println(gatito.equals(gatito));

		Mascota[] animales = new Mascota[10];
		animales[contador] = gatito;
		contador += 1;
		System.out.println(Arrays.toString(animales));
	}
}
