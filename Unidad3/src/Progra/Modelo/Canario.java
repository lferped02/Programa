package Modelo;

public class Canario extends Aves {
	private String color;
	private boolean cantar;

	public Canario(String pico, boolean vuela) {
		super(pico, vuela);
		this.color = color;
		this.cantar = cantar;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isCantar() {
		return cantar;
	}

	public void setCantar(boolean cantar) {
		this.cantar = cantar;
	}

}
