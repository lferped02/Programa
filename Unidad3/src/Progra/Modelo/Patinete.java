package Progra.Modelo;

import Progra.EjemploEnum.Estado;

public class Patinete extends VehiculoGeneral {
	private static String[] alquiler;
	private int tiempoAutonoma;
	private String marca;
	private String modelo;
	private float fianza;
	private boolean abonada;

	public Patinete(int tiempoAutonoma, String marca, String modelo, float fianza, boolean abonada) {
		super(modelo, alquiler);
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
		float importeTotal = 0;
		for (Alquiler a : getAlquiler()) {
			if (a.getEstado().equals(Estado.ENTREGADO) || a.getEstado().equals(Estado.CERRADO)) {

			}
		}
		return importeTotal;

	}

	public Alquiler[] getAlquiler() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean estaAlquilado() {
		// TODO Auto-generated method stub
		return false;
	}

}
