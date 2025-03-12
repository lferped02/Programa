package Controlador;

import Interfaces.IAcciones;
import Modelo.*;

public class GestionaPersonaRefactoriza {

	public static void main(String[] args) {
		PersonaRefactoriza carlos = new PersonaRefactoriza("Carlos R.");
		IAcciones[]acciones = carlos.getAcciones();
		acciones [0] = new Estudiante();
		System.out.println(carlos);
		
		PersonaRefactoriza cristina = new PersonaRefactoriza ("Cristina");
		acciones = cristina.getAcciones();
		acciones [0] = new Estudiante();
		acciones [1] = new Empleado2();
		System.out.println(cristina);
		
		PersonaRefactoriza fernando = new PersonaRefactoriza("Fernando");
		acciones = cristina.getAcciones();
		acciones [0] = new Estudiante();
		acciones [1] = new Empleado2();
		acciones [2] = new Cliente2();
		System.out.println(fernando);
		
		PersonaRefactoriza lili = new PersonaRefactoriza("LiLi");
		acciones = cristina.getAcciones();
		acciones [0] = new Estudiante();
		acciones [1] = new Empleado2();
		acciones [2] = new Artista();
		System.out.println(lili);
	}

}
