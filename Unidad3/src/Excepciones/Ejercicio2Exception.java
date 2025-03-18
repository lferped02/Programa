package Excepciones;

public class Ejercicio2Exception {

	public static void main(String[] args) {
		m1();
	}

	static public boolean m1() throws NullPointerException {
		throw new NullPointerException("Genero NullPointer");

	}

}
