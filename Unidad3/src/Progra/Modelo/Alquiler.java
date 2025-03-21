package Progra.Modelo;

import java.time.LocalDate;

public class Alquiler {
	private String id;
	private String vehiculo;
	private String numeroPermiso;
	private LocalDate fechaEntrega;
	private LocalDate fechaAlquiler;
	private int numeroDia;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}
	public String getNumeroPermiso() {
		return numeroPermiso;
	}
	public void setNumeroPermiso(String numeroPermiso) {
		this.numeroPermiso = numeroPermiso;
	}
	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public LocalDate getFechaAlquiler() {
		return fechaAlquiler;
	}
	public void setFechaAlquiler(LocalDate fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}
	public float getImporteTotalGenerado() {
		return 0;
	}
	public Object getEstado() {
		// TODO Auto-generated method stub
		return null;
	}

}
