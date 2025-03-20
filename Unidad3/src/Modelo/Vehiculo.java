package Prueba;




public abstract class Vehiculo implements Alquilable {
	private String id;
	private Alquiler alquileres;
	private boolean estaDisponible;

	public Vehiculo(String id) {
		this.id = id;
		this.alquileres = alquileres;
		this.estaDisponible = true;
	}

	public double getImporteTotalGenerado() {
		double total = 0;
		for (Alquiler alquiler : alquileres) {
			if (alquiler.getEstado().equals("ENTREGADO") || alquiler.getEstado().equals("CERRADO")) {
				total += alquiler.getImporteGeneradoPorAlquiler();
			}
		}
		return total;
	}

	public abstract double getImporteGeneradoPorAlquiler(Alquiler alquiler);

	public abstract double getPrecioPorDia();

	protected String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}

	protected Alquiler getAlquileres() {
		return alquileres;
	}

	protected void setAlquileres(Alquiler alquileres) {
		this.alquileres = alquileres;
	}

	protected boolean isEstaDisponible() {
		return estaDisponible;
	}

	protected void setEstaDisponible(boolean estaDisponible) {
		this.estaDisponible = estaDisponible;
	}

	protected abstract void add(Vehiculo vehiculo);

}
