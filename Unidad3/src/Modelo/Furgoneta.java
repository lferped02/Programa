package Prueba;

public class Furgoneta extends VehiculoDeCombustible {
	private int plazas;
	private double pesoMaximoAutorizado;

	public Furgoneta(String id, String matricula, boolean esDiesel, String marca, String modelo, int plazas,
			double pma) {
		super(modelo, modelo, esDiesel, modelo, modelo);
		this.plazas = plazas;
		this.pesoMaximoAutorizado = pesoMaximoAutorizado;
	}

	@Override
	public double getImporteGeneradoPorAlquiler(Alquiler alquiler) {
		return alquiler.getNumeroDias() * (40 + 0.5 * pesoMaximoAutorizado);
	}

	@Override
	public double getPrecioPorDia() {
		return 40 + 0.5 * pesoMaximoAutorizado;
	}

}
