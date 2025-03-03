package Fernández_LiLi_prueba;

public class Smartphone extends Telefono{
	private int cantidadCamara;

	protected Smartphone(String marca, String modelo, double precio, boolean tieneTecladoFisico, int cantidadCamara) {
		super(marca, modelo, precio, tieneTecladoFisico);
		this.cantidadCamara = cantidadCamara;
	}

	protected int getCantidadCamara() {
		return cantidadCamara;
	}

	protected void setCantidadCamara(int cantidadCamara) {
		this.cantidadCamara = cantidadCamara;
	}
	public double calculaPrecioDescuento() {
		int calculaPrecioDescuento;
		
		return cantidadCamara;
		
	}
}
