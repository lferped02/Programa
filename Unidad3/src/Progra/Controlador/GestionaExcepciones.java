package Progra.Controlador;

import java.io.IOException;

public class GestionaExcepciones {

	public void generaIOException() throws IOException{
		try {
			throw new IOException();
		}
		catch (IOException e)
		{
			System.out.println("En el catch de IO");
			throw e;
		}
	}
}
