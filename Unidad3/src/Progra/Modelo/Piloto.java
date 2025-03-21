package Progra.Modelo;

import Progra.Controlador.VueloException;

public class Piloto {
	private String nombre;
	private String nacionalidad;
	private int edad;
	private int totaHoras;
	private int vueloAsignados;
	Vuelo vuelo[];
	
	

	public Piloto(String nombre, String nacionalidad, int edad, int totaHoras, int i, Vuelo[] vuelo) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.totaHoras = totaHoras;
		this.vueloAsignados = i;
		this.vuelo = new Vuelo[30];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getTotaHoras() {
		return totaHoras;
	}

	public void setTotaHoras(int totaHoras) {
		this.totaHoras = totaHoras;
	}

	public Vuelo[] getVueloAsignados() {
		return vueloAsignados;
	}

	public void setVueloAsignados(Vuelo[] vuelos) {
		this.vueloAsignados = vuelos;
	}

	public boolean saberListaVuelo(Vuelo vuelos) {
		boolean estaLista = false;
		int i = 0;
		while (estaLista && i < vuelo.length) {
			if (vuelo[i].equals(vuelos)) {
				estaLista = true;
			} else {
				estaLista = false;
				i = i + 1;
			}
		}
		return estaLista;

	}
	public void getAgregarVuelo (Vuelo vuelos) throws VueloException{
		if (this.saberListaVuelo(vuelos)) {
			throw new VueloException("El vuelo que intentas agregar ya esta en la lista de vuelos del piloto");
		}else if(vuelos.length>8&& this instanceof Comercial) {
			throw new VueloException("El vuelo que intentas agregar es de tipo comercial");
		} else {
			
		}
	}

	public void getAgregarVuelo() {

	}

}
