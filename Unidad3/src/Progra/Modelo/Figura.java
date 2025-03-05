package Modelo;

public abstract class Figura {
	protected static String color;

	public Figura(String color) {
		super();
		this.color = color;
	}

	public abstract double calcularArea();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
