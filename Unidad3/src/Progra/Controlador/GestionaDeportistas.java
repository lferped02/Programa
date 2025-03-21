package Progra.Controlador;

import java.time.LocalDate;

import EjemploEnum.EstadoPrueba;
import Progra.Modelo.Corredor;
import Progra.Modelo.Deportista;
import Progra.Modelo.Prueba;

public class GestionaDeportistas {
	public static void main(String[] args) {
		Prueba[]pruebas = new Prueba[50];
		
		Deportista corredor = new Corredor ("Juanki", "Rumania",69, 23541, 183);
		Prueba prueba = new Prueba ("Prueba1", "Sevilla", LocalDate.now().plusDays(1), EstadoPrueba.PLANIFICADA);
		Prueba prueba1 = new Prueba ("Prueba2", "VillaVerde", LocalDate.now().plusDays(10), EstadoPrueba.PLANIFICADA);
		pruebas[0]=prueba;
		pruebas[1]=prueba1;
		corredor.setPruebas(prueba);
		System.out.println(corredor.getpruebaMasCercana());
		
	}

}
