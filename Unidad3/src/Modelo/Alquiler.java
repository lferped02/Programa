package Prueba;

import java.time.LocalDate;

public class Alquiler {
	private String id;
	private Vehiculo vehiculo;
	private String dniConductor;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private int numeroDias;
	private String estado;

	public Alquiler(String id, Vehiculo vehiculo, String dniConductor, LocalDate fechaInicio, LocalDate fechaFin, int numeroDias,
			String estado) {
		this.id = id;
		this.vehiculo = vehiculo;
		this.dniConductor = dniConductor;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.numeroDias = numeroDias;
		this.estado = estado;
	}

	public double getImporteGeneradoPorAlquiler() {
		return vehiculo.getImporteGeneradoPorAlquiler(this);
	}

	protected String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}

	protected Vehiculo getVehiculo() {
		return vehiculo;
	}

	protected void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	protected String getDniConductor() {
		return dniConductor;
	}

	protected void setDniConductor(String dniConductor) {
		this.dniConductor = dniConductor;
	}

	protected LocalDate getFechaInicio() {
		return fechaInicio;
	}

	protected void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	protected LocalDate getFechaFin() {
		return fechaFin;
	}

	protected void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	protected int getNumeroDias() {
		return numeroDias;
	}

	protected void setNumeroDias(int numeroDias) {
		this.numeroDias = numeroDias;
	}

	protected String getEstado() {
		return estado;
	}

	protected void setEstado(String estado) {
		this.estado = estado;
	}

}
