package Progra.Modelo;

public class Triangulo extends Figura {
	
	private double altura;
	private double base;
	
	

	public Triangulo(String color, double altura, double base) {
		super(color);
		this.color = color;
		this.altura = altura;
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base * altura;
	}

}
