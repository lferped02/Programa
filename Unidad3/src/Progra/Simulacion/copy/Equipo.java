package Simulacion.copy;

import java.util.Objects;

public class Equipo {
	private String nombre;
	private String direccion;
	private String sistemaOperativo;
	private int numeroIncidentePendiente;

	protected Equipo(String nombre, String direccion, String sistemaOperativo, int numeroIncidentePendiente) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.sistemaOperativo = sistemaOperativo;
		this.numeroIncidentePendiente = numeroIncidentePendiente;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getDireccion() {
		return direccion;
	}

	protected void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	protected String getSistemaOperativo() {
		return sistemaOperativo;
	}

	protected void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	protected int getNumeroIncidentePendiente() {
		return numeroIncidentePendiente;
	}

	protected void setNumeroIncidentePendiente(int numeroIncidentePendiente) {
		this.numeroIncidentePendiente = numeroIncidentePendiente;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", MAC=" + direccion + ", numeroIncidentePendiente="
				+ numeroIncidentePendiente + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(direccion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(direccion, other.direccion);
	}

}
