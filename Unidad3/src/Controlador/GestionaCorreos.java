package Controlador;

import java.util.Scanner;

import Modelo.CorreoElectronico;

public class GestionaCorreos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce un correo: ");
		String correo = entrada.nextLine();
		boolean sigo = true;
		while (sigo) {
			int contador = 0;
			CorreoElectronico[] correos = new CorreoElectronico[5];
			if (CorreoElectronico.validaCorreo(correo)) {

				CorreoElectronico c = new CorreoElectronico(correo);
				correos[contador] = c;
				contador += 1;
			}
			sigo = contador != 5;
		}
		System.out.println(CorreoElectronico.validaCorreo(correo));
	}
}