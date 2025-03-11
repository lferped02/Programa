package Modelo;

import java.time.LocalDate;
import java.util.Date;

public class PuertaAutomatica extends DispositivoWifi {
	private boolean estadoSeguridad;

	public PuertaAutomatica(String mac, String estado, LocalDate fechaActualizacion) {
		super(mac, estado, fechaActualizacion);
		this.estadoSeguridad = estadoSeguridad;
	}

	@Override
	public void conectarInternet() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean pendienteActualizacion() {
		return estadoSeguridad;

	}

	public String toString() {
		return super.toString() + ", Estado de Seguridad: " + (estadoSeguridad ? "Activado" : "Desactivado");
	}
}
