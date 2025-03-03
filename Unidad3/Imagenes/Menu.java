package Fernández_LiLi_prueba2;

public class Menu extends Cliente {
	private float id;
	private String nombre;
	private String consumoCalorico;
	private String dietaAsignada;
	private double precio;
	private Dieta tipoDieta;
	private int precioCoste;

	protected Menu(float id, String nombre, String consumoCalorico, String dietaAsignada, double precio,
			Dieta tipoDieta, int precioCoste) {
		super(dietaAsignada, dietaAsignada, dietaAsignada, dietaAsignada, id, id, id);
		this.id = id;
		this.nombre = nombre;
		this.consumoCalorico = consumoCalorico;
		this.dietaAsignada = dietaAsignada;
		this.precio = precio;
		this.tipoDieta = tipoDieta;
		this.precioCoste = precioCoste;

	}

	protected float getId() {
		return id;
	}

	protected void setId(float id) {
		this.id = id;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getConsumoCalorico() {
		return consumoCalorico;
	}

	protected void setConsumoCalorico(String consumoCalorico) {
		this.consumoCalorico = consumoCalorico;
	}

	protected String getDietaAsignada() {
		return dietaAsignada;
	}

	protected void setDietaAsignada(String dietaAsignada) {
		this.dietaAsignada = dietaAsignada;
	}

	protected double getPrecio() {
		return precio;
	}

	protected void setPrecio(double precio) {
		if (precioCoste > 30) {

		} else {

			this.precio = precio;
		}
	}

	protected Dieta getTipoDieta() {
		return tipoDieta;
	}

	protected void setTipoDieta(Dieta tipoDieta) {
		int caloria = 0;
		if (caloria < 1000) {

		} else {
			this.tipoDieta = tipoDieta;
		}

	}

	@Override
	public String toString() {
		return "Menu [nombre=" + nombre + ", precio=" + precio + ", tipoDieta=" + tipoDieta + ", precioCoste="
				+ precioCoste + "]";
	}

	public boolean medotoCarne() {
		boolean tipo = false;
		if (tipoDieta == tipoDieta.VEGETARIANO) {

		} else if (tipoDieta == tipoDieta.VEGETARIANO) {
			tipo = true;

		} else if (tipoDieta == tipoDieta.VEGANO) {
			tipo = true;

		} else {
			tipo = false;
		}
		return tipo;
	}

}
