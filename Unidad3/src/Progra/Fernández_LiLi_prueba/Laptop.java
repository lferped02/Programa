package Fernández_LiLi_prueba;

public class Laptop extends Computadora {
	private double peso;

	protected Laptop(String marca, String modelo, double precio, int capacidadRam, double peso) {
		super(marca, modelo, precio, capacidadRam);
		this.peso = peso;
	}

	protected double getPeso() {
		return peso;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
	}

	public double calcularPrecioDescuento(double peso) {
		double porcentajeDescuento = 12;
		double porcentajeDescuento1 = 8;
		if (peso <= 12) {

		} else if (peso > 12) {
		}
		return porcentajeDescuento;
	}

}
