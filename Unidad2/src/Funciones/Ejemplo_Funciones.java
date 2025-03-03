package Funciones;

import java.util.Scanner;

public class Ejemplo_Funciones {

	public static void main(String[] args) {
		Ejemplo_Funciones f = new Ejemplo_Funciones();
		int Resultado = f.sumaNúmero(4, 7);
		System.out.println(Resultado);
		String[] listaNombre = f.generaLista();
		System.out.println(listaNombre);
		for (String x:listaNombre) {
			System.out.println(x);
		}
	}

	public static int sumaNúmero(int Número1, int Número2) {
		return Número1 + Número2;

	}

	String[] generaLista() {
		String[] Nombres = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un nombre:");

		for (int i = 0; i < Nombres.length; i++) {
			String Nombre = sc.next();
			Nombres[i] = Nombre;
		}
		return Nombres;
	}
}
