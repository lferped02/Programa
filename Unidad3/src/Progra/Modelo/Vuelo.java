package Progra.Modelo;

import java.time.LocalDate;

import EjemploEnum.EstadoVuelo;

public class Vuelo {
	private String id;
	private String aerolinea;
	private String destino;
	private LocalDate fechaVuelo;
	private int duracion;
	EstadoVuelo estado;
	public int length;

	public Vuelo(String id, String aerolinea, String destino, LocalDate fechaVuelo, int duracion, EstadoVuelo estado) {
		super();
		this.id = id;
		this.aerolinea = aerolinea;
		this.destino = destino;
		this.fechaVuelo = fechaVuelo;
		this.duracion = duracion;
		this.estado = estado;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalDate getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(LocalDate fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public EstadoVuelo getEstado() {
		return estado;
	}

	public void setEstado(EstadoVuelo estado) {
		this.estado = estado;
	}

	public int getSumaTotalVuelo() {
		return duracion;

	}

}
