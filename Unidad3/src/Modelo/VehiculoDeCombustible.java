package Prueba;

public class VehiculoDeCombustible extends Vehiculo {
	private String matricula;
	private boolean esDiesel;
	private String marca;
	private String modelo;

	public VehiculoDeCombustible(String id, String matricula, boolean esDiesel, String marca, String modelo) {
		super(id);
		this.matricula = matricula;
		this.esDiesel = esDiesel;
		this.marca = marca;
		this.modelo = modelo;
	}

	protected String getMatricula() {
		return matricula;
	}

	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	protected boolean isEsDiesel() {
		return esDiesel;
	}

	protected void setEsDiesel(boolean esDiesel) {
		this.esDiesel = esDiesel;
	}

	protected String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	protected String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public boolean estaAlquilado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean estaAlquiladoEnFecha(String fecha) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getImporteGeneradoPorAlquiler(Alquiler alquiler) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPrecioPorDia() {
		// TODO Auto-generated method stub
		return 0;
	}

}
