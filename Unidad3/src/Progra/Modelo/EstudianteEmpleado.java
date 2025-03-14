package Progra.Modelo;

//Un problema surge aquí: ¿qué pasa si un Estudiante también es Empleado?
public class EstudianteEmpleado extends Estudiante {
	public EstudianteEmpleado(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public void trabajar() {
		System.out.println("nombre" + " está estudiando y trabajando.");
	}
}