package Fernández_LiLi_prueba2;

import java.util.Objects;

public class Cliente {
	private String dni;
	private String nombre;
	private String apellidos;
	private String dietaAsignada;
	private float fecha;
	private float vip;
	private float noVip;
	private int precio;
	protected Cliente(String dni, String nombre, String apellidos, String dietaAsignada, float fecha, float vip,
			float noVip) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dietaAsignada = dietaAsignada;
		this.fecha = fecha;
		this.vip = vip;
		this.noVip = noVip;
	}
	protected String getDni() {
		return dni;
	}
	protected void setDni(String dni) {
		this.dni = dni;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getApellidos() {
		return apellidos;
	}
	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	protected String getDietaAsignada() {
		return dietaAsignada;
	}
	protected void setDietaAsignada(String dietaAsignada) {
		this.dietaAsignada = dietaAsignada;
	}
	protected float getFecha() {
		return fecha;
	}
	protected void setFecha(float fecha) {
		this.fecha = fecha;
	}
	protected float getVip() {
		return vip;
	}
	protected void setVip(float vip) {
		this.vip = vip;
	}
	protected float getNoVip() {
		return noVip;
	}
	protected void setNoVip(float noVip) {
		this.noVip = noVip;
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, dietaAsignada, dni, fecha, noVip, nombre, vip);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(dietaAsignada, other.dietaAsignada)
				&& Objects.equals(dni, other.dni) && Float.floatToIntBits(fecha) == Float.floatToIntBits(other.fecha)
				&& Float.floatToIntBits(noVip) == Float.floatToIntBits(other.noVip)
				&& Objects.equals(nombre, other.nombre) && Float.floatToIntBits(vip) == Float.floatToIntBits(other.vip);
	}
	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dietaAsignada="
				+ dietaAsignada + ", fecha=" + fecha + ", vip=" + vip + ", noVip=" + noVip + "]";
	}
	
	public int calculaPrecioConPromocion() {
		if (precio<10) {
			
		}else if (precio>10){
			
		}
		return precio;
		
	}
}
