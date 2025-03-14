package Progra.Controlador;

import java.io.IOException;
import java.util.InputMismatchException;

public class GeneraExcepcion {
	public void generaIOException() {
		try {
			throw new IOException();
		} catch (IOException e) {

		}
	}

	public void generaMisException() throws InputMismatchException {
		try {
			throw new InputMismatchException();
		} catch (InputMismatchException e) {

		}
	}
}
