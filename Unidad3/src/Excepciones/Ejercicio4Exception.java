package Excepciones;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio4Exception {

	public static void main(String[] args) {
		double[] numeroLista = new double[20];
		Random numeroAleatorio = new Random();
		for (int i = 0; i < 20; i++) {
			try {

				int numero1 = numeroAleatorio.nextInt();
				int numero2 = numeroAleatorio.nextInt();

				if (numero2 == 0) {
					throw new ArithmeticException("No se puede dividir por cero");
				}
				if (i >= 20) {
					throw new ArrayIndexOutOfBoundsException("Guardando en mas de 20");
				}
				numeroLista[i] = (double) numero1 / numero2;
			} catch (ArithmeticException e1) {
				System.out.println("Ha salido un 0 de denominador");
				throw e1;
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println(e2.getMessage());
				throw e2;
			} finally {
				try {
					System.out.println(Arrays.toString(numeroLista));
				} catch (NullPointerException e3) {
					System.out.println("Posiciones vacias");
				}
			}
		}
	}
}
