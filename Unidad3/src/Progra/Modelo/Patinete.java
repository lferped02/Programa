package Progra.Modelo;

public class Patinete extends VehiculoGeneral {
	private int tiempoAutonoma;
	private String marca;
	private String modelo;
	private float fianza;
	private boolean abonada;

	public Patinete(int tiempoAutonoma, String marca, String modelo, float fianza, boolean abonada) {
		super();
		this.tiempoAutonoma = tiempoAutonoma;
		this.marca = marca;
		this.modelo = modelo;
		this.fianza = fianza;
		this.abonada = abonada;
	}

	public int getTiempoAutonoma() {
		return tiempoAutonoma;
	}

	public void setTiempoAutonoma(int tiempoAutonoma) {
		this.tiempoAutonoma = tiempoAutonoma;
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

	public float getFianza() {
		return fianza;
	}

	public void setFianza(float fianza) {
		this.fianza = fianza;
	}

	public boolean isAbonada() {
		return abonada;
	}

	public void setAbonada(boolean abonada) {
		this.abonada = abonada;

	}

	@Override
	public float totalGenerado() {
		// TODO Auto-generated method stub
		return 0;

	}

	@Override
	public boolean estaAlquilado() {
		// TODO Auto-generated method stub
		return false;
	}

}
