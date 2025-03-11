package Modelo;

import java.time.LocalDate;
import java.util.Date;

public class SensorTemperatura extends DispositivoWifi {
	private double temperatura;

	public SensorTemperatura(String mac, String estado, LocalDate fechaActualizacion) {
		super(mac, estado, fechaActualizacion);
		this.temperatura = temperatura;
	}

	@Override
	public void conectarInternet() {
		System.out.println("Conectando el sensor de temperatura utilizando WPA...");
	}

	@Override
	public boolean pendienteActualizacion(){
		return pendienteActualizacion;
	}

	public String toString() {
		return super.toString() + ", Temperatura: " + temperatura + "°C";

	}

}
