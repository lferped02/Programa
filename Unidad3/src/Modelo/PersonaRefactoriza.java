package Progra.Modelo;

import java.util.Arrays;

import Interfaces.IAcciones;

public class PersonaRefactoriza {
	IAcciones[]acciones;
	String nombre;

	public PersonaRefactoriza(String nombre) {
		super();
		this.nombre = nombre;
		this.acciones = new IAcciones[10];
		}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void identificarse() {
		System.out.println("Soy una persona y me llamo " + nombre);
	}

	public IAcciones[] getAcciones() {
		return acciones;
	}

	public void setAcciones(IAcciones[] acciones) {
		this.acciones = acciones;
	}

	@Override
	public String toString() {
		return "PersonaRefactoriza [acciones=" + Arrays.toString(acciones) + ", nombre=" + nombre + "]";
	}
	
}
