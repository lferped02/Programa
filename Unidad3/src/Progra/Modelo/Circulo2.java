package Progra.Modelo;

public class Circulo2 extends Figura {
	private double radio;
	public static final double PI = 3.141621;

	public Circulo2(double radio) {
		super(color);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public static double getPi() {
		return PI;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return PI * (radio * radio);
	}

}
