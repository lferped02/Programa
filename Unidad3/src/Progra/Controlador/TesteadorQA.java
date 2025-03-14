package Progra.Controlador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteadorQA {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingresa un número entero: ");
		try {
		int numero = scanner.nextInt();
		String cadena="";
		System.out.println(cadena.charAt(10));
		System.out.println("Detras del input");
		}
		catch (InputMismatchException e) {
			System.out.println("Entro en el catch 1:" + e.getCause());
			System.out.println("Entro en el catch 1:" + e.getMessage());
			System.out.println("Ingresa un numero entero:");
		}
		catch (StringIndexOutOfBoundsException a) {
			System.out.println("Entro en el catch 2:" + a.getCause());
			System.out.println("Entro en el catch 2:" + a.getMessage());
		}
		finally {
		System.out.println("Pase lo que pase, salgo");
		}

		/*int divisor = scanner.nextInt();

		int resultado = numero / divisor;

		System.out.println("El resultado de la división es: " + resultado);*/

		scanner.close();
	}

}
