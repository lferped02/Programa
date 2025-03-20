package Progra.Modelo;

public class VehiculoCombustible extends VehiculoGeneral {
	private String matricula;
	private boolean esDiesel;
	private String marca;
	private String modelo;

	public VehiculoCombustible(String matricula, boolean esDiesel, String marca, String modelo) {
		super();
		this.matricula = matricula;
		this.esDiesel = esDiesel;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public boolean isEsDiesel() {
		return esDiesel;
	}

	public void setEsDiesel(boolean esDiesel) {
		this.esDiesel = esDiesel;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public boolean estaAlquilado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public float precioDia() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float totalGenerado() {
		// TODO Auto-generated method stub
		return 0;
	}

}
