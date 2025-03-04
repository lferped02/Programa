package entorno;

public class Ejercicio10 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int elementoBuscar = 4;
		int indiceEncontrado = busquedaBinaria(array, elementoBuscar);

		if (indiceEncontrado != -1) {
			System.out
					.println("El elemento " + elementoBuscar + " se encuentra en el índice " + indiceEncontrado + ".");
		} else {
			System.out.println("El elemento " + elementoBuscar + " no se encuentra en el array.");
		}
	}

	public static int busquedaBinaria(int[] array, int elementoBuscar) {
		int inicio = 0;
		int fin = array.length - 1;
		while (inicio <= fin) {
			int medio = inicio + (fin - inicio) / 2;
			if (array[medio] == elementoBuscar) {
				return medio+1;
			} else if (array[medio] < elementoBuscar) {
				inicio = medio + 1;
			} else {
				fin = medio - 1;
			}
		}
		return -1; // Elemento no encontrado
	}
}