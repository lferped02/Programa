package Progra.Controlador;

import java.time.LocalDate;
import Progra.Modelo.CuentaBanco;
import Progra.Modelo.Personas;

public class GestionBanco {

	public static void main(String[] args) {
		Personas titular = new Personas("12345678A", "Pepe", "López",LocalDate.of(2000, 12, 12) );

		CuentaBanco cuenta = new CuentaBanco(0.0, "ES123456789123456789123456", titular);
		
	}

}
