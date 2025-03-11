package Modelo;

import java.time.LocalDate;
import java.util.Date;

public abstract class DispositivoWifi {
	private String mac;
	private String estado;
	private LocalDate fechaActualizacion;

	public DispositivoWifi(String mac, String estado, LocalDate fechaActualizacion) {
		super();
		this.mac = mac;
		this.estado = estado;
		this.fechaActualizacion = fechaActualizacion;
	}

	public abstract void conectarInternet();

	protected String getMac() {
		return mac;
	}

	protected void setMac(String mac) {
		this.mac = mac;
	}

	public boolean pendienteActualizacion;

	public void apagar() {
		
	}

	public String toString() {
		return " MAC: " + mac + ", Estado: " + estado + ", Fecha actualización: " + fechaActualizacion;
	}

	public boolean pendienteActualizacion() {
		// TODO Auto-generated method stub
		return false;
	}

}
