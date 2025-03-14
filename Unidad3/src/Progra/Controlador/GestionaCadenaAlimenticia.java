package Progra.Controlador;

import java.util.Arrays;

import Contador.Familia;
import Mascota.Serpiente;
import Modelo.*;
import Progra.Modelo.Animal2;

public class GestionaCadenaAlimenticia {

	public static void main(String[] args) {

		Animal2[] atacaSerpiente = { new Serpiente() };
		Animal2[] atacaRapaz = { new Rapaz() };
		Animal2[] atacaRoedor = { new Roedor(), new Rapaz() };
		Animal2[] atacaLeon = { new Leon() };

		Animal2 a = new Serpiente("Cobra", Familia.serpiente, "Selva", atacaLeon, atacaRoedor);
		Animal2 a2 = new Rapaz("Aguila real", Familia.rapaz, "", null, null);
		Animal2 a4 = new Roedor("Conejo", Familia.roedor, "Campo", null, null);
		Animal2 a5 = new Leon("Leon", Familia.leon, "Amazona", null, null);

		System.out.println(Arrays.toString(a.getAnimalQueCome()));
		System.out.println(Arrays.toString(a.getAnimalComido()));
	}

}
