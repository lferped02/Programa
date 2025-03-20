package Progra.Modelo;

import java.util.Objects;

import Interfaces.IPrestable;

public abstract class Recurso implements IPrestable {
	private static int contador;
	private int id;
	private String ubicacion;

	public Recurso(int id, String ubicacion) {
		super();
		this.id = contador;
		this.ubicacion = ubicacion;
		contador = contador + 1;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Recurso.contador = contador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public int getDevuelveDiasPrestamo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean estaDisponible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, ubicacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recurso other = (Recurso) obj;
		return id == other.id && Objects.equals(ubicacion, other.ubicacion);
	}

}
