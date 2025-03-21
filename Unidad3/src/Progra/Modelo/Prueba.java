package Progra.Modelo;

import java.time.LocalDate;
import java.util.Objects;

import EjemploEnum.EstadoPrueba;

public class Prueba {
	public static int length;
	private String identificador;
	private String lugar;
	private LocalDate fecha;
	private EstadoPrueba estado;

	public Prueba(String identificador, String lugar, LocalDate fecha, EstadoPrueba EstadoPrueba) {
		this.identificador = identificador;
		this.lugar = lugar;
		this.fecha = fecha;
		this.estado = EstadoPrueba;
	}

	public String getIdentificador() {
		return identificador;
	}

	public String getLugar() {
		return lugar;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public EstadoPrueba getEstado() {
		return estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(estado, fecha, identificador, lugar);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prueba other = (Prueba) obj;
		return Objects.equals(estado, other.estado) && Objects.equals(fecha, other.fecha)
				&& Objects.equals(identificador, other.identificador) && Objects.equals(lugar, other.lugar);
	}
	

}
