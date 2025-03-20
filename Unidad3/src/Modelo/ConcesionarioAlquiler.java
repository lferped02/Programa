package Prueba;

public class ConcesionarioAlquiler {
	private String nombre;
	private String direccion;
	private Vehiculo vehiculos;

	public ConcesionarioAlquiler(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.vehiculos = vehiculos;

	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		if (vehiculo instanceof VehiculoDeCombustible) {
			for (Vehiculo v : vehiculos) {
				if (v instanceof VehiculoDeCombustible && ((VehiculoDeCombustible) v).getMatricula()
						.equals(((VehiculoDeCombustible) vehiculo).getMatricula())) {
					return; 
				}
			}
		}
		vehiculos.add(vehiculo);
	}

	public void realizarAlquiler(Alquiler alquiler) {
		if (!alquiler.getVehiculo().estaAlquilado()) {
			alquiler.getVehiculo().getAlquileres().add(alquiler);
		} else {
			System.out.println("Vehículo ya alquilado para las fechas indicadas");
		}
	}

	public double calcularGananciaTotal() {
		double total = 0;
		for (Vehiculo vehiculo : vehiculos) {
			total += vehiculo.getImporteTotalGenerado();
		}
		return total;
	}

}
