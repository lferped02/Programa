package Progra.Controlador;

import java.util.Scanner;

import Excepciones.MiExcepcion;

public class GestionaExceptionesEjercicio5 {
	public static void main(String[] args) throws MiExcepcion {
		GestionaExceptionesEjercicio5 m = new GestionaExceptionesEjercicio5(); 
		Scanner scanner = new Scanner (System.in);
		System.out.println("Introduce un numero:");
		int numero = scanner.nextInt();
		
		try {
			m.metodo1(numero);
		}
		catch (MiExcepcion e) {
			e.printStackTrace();
		}

	}

	public void metodo1(int numero) throws MiExcepcion{
		try {
			if(numero%2!=0){
				throw new MiExcepcion("toma otra excepcion");
			}
		}
		
	}
}
