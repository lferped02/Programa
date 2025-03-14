package Progra.Modelo;

import Progra.Contador.Estado;

public class RobotsPintor extends Robots {

	public RobotsPintor(String modelo, int bateriaNumerico, Empleado estado) {
		super(modelo, bateriaNumerico, estado);

	}

	public RobotsPintor(String modelo, int bateriaNumerico, Simulacion.copy.Estado apagado) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean recargar() {
		System.out.println("Recargando por electricidad");
		return true;
	}

	@Override
	public String ejecutaTarea() {
		String tarea = "Aplica pintura a los vehículos de manera uniforme";
		return tarea;
	}
}
