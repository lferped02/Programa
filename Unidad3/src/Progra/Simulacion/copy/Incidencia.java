package Simulacion.copy;

import java.time.LocalDate;
import java.util.Objects;

public class Incidencia {
	private int id;
	private String nombre;
	private String descripcion;
	private LocalDate fechaDeRegistro;
	private LocalDate fechaDeCierre;
	private Estado estado;
	private Criticidad criticidad;
	private Equipo equipo;

	protected Incidencia(int id, String nombre,String descripcion, LocalDate fechaDeRegistro, LocalDate fechaDeCierre, Estado estado, Criticidad criticidad, Equipo equipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaDeRegistro = fechaDeRegistro;
		setFechaDeCierre(fechaDeCierre);
		setEstado (estado);
		this.criticidad = criticidad;
		this.equipo = equipo;
	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getDescripcion() {
		return descripcion;
	}

	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	protected LocalDate getFechaDeRegistro() {
		return fechaDeRegistro;
	}

	protected void setFechaDeRegistro(LocalDate fechaDeRegistro) {
		this.fechaDeRegistro = fechaDeRegistro;
	}

	protected LocalDate getFechaDeCierre() {
		return fechaDeCierre;
	}

	protected void setFechaDeCierre(LocalDate fechaDeCierre) {
		if (estado != estado.CERRADA) {
			this.fechaDeCierre = null;
		} else {
			this.fechaDeCierre = fechaDeCierre;
		}
	}

	protected Estado getEstado() {
		return estado;
	}

	protected void setEstado(Estado estado) {
		if (estado == estado.CERRADA) {
			this.fechaDeCierre = LocalDate.now();
		} else {
			this.estado = estado;
		}
	}

	protected Criticidad getCriticidad() {
		return criticidad;
	}

	protected void setCriticidad(Criticidad criticidad) {
		this.criticidad = criticidad;
	}

	protected Equipo getEquipo() {
		return equipo;
	}

	protected void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(criticidad, descripcion, equipo, estado, fechaDeCierre, fechaDeRegistro, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incidencia other = (Incidencia) obj;
		return criticidad == other.criticidad && Objects.equals(descripcion, other.descripcion)
				&& Objects.equals(equipo, other.equipo) && estado == other.estado
				&& Objects.equals(fechaDeCierre, other.fechaDeCierre)
				&& Objects.equals(fechaDeRegistro, other.fechaDeRegistro) && id == other.id
				&& Objects.equals(nombre, other.nombre);
	}

	public boolean esUrgente() {
		boolean urgente = false;
		LocalDate hoy = LocalDate.now();

		if (criticidad == criticidad.GRAVE) {

		} else if (criticidad == criticidad.GRAVE && this.fechaDeRegistro.plusDays(7).isAfter(hoy)) {
			urgente = true;

		} else if (criticidad == criticidad.MEDIA && this.fechaDeRegistro.plusMonths(1).isAfter(hoy)) {
			urgente = true;

		} else {
			urgente = false;

		}
		return urgente;
	}
}
