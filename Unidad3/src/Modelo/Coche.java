package Prueba;

public class Coche extends VehiculoDeCombustible {
	public Coche(String id, String matricula, boolean esDiesel, String marca, String modelo) {
		super(id, matricula, esDiesel, marca, modelo);
	}

	@Override
	public double getImporteGeneradoPorAlquiler(Alquiler alquiler) {
		return alquiler.getNumeroDias() * 40;
	}

	@Override
	public double getPrecioPorDia() {
		return 40;
	}

}
