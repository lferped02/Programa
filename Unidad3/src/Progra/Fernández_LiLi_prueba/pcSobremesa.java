package Fernández_LiLi_prueba;

public class pcSobremesa extends Computadora{
	private boolean tieneGpudedicada;

	protected pcSobremesa(String marca, String modelo, double precio, int capacidadRam, boolean tieneGpudedicada) {
		super(marca, modelo, precio, capacidadRam);
		this.tieneGpudedicada = tieneGpudedicada;
	}

	protected boolean isTieneGpudedicada() {
		return tieneGpudedicada;
	}

	protected void setTieneGpudedicada(boolean tieneGpudedicada) {
		this.tieneGpudedicada = tieneGpudedicada;
	}

	public boolean tieneGpudedicada() {
		return tieneGpudedicada;
		
	}

}
