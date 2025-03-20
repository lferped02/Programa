package Prueba;

public class Patinete extends Vehiculo {
	private String marca;
	private String modelo;
	private int autonomia;
	private double fianza;
	private boolean fianzaAbonada;

	public Patinete(String id, String marca, String modelo, int autonomia, double fianza) {
		super(id);
		this.marca = marca;
		this.modelo = modelo;
		this.autonomia = autonomia;
		this.fianza = fianza;
		this.fianzaAbonada = false;
	}

	public boolean estaFianzaAbonada() {
		return fianzaAbonada;
	}

	@Override
	public double getImporteGeneradoPorAlquiler(Alquiler alquiler) {
		int dias = alquiler.getNumeroDias();
		double total = 50;
		if (dias > 1) {
			total += (dias - 1) * 30;
		}
		return total;
	}

	@Override
	public double getPrecioPorDia() {
		return 50;

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

	protected int getAutonomia() {
		return autonomia;
	}

	protected void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}

	protected double getFianza() {
		return fianza;
	}

	protected void setFianza(double fianza) {
		this.fianza = fianza;
	}

	protected boolean isFianzaAbonada() {
		return fianzaAbonada;
	}

	protected void setFianzaAbonada(boolean fianzaAbonada) {
		this.fianzaAbonada = fianzaAbonada;
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
}
