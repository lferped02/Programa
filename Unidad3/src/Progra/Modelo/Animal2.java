package Progra.Modelo;

import Interfaces.Depredador;

public abstract class Animal2 implements Depredador, Presa {
	private String nombre;
	private Familia tipoFamilia;
	private String habita;
	private Animal2[] animalComido;
	private Animal2[] animalQueCome;

	public Animal2(String nombre, Familia serpiente, String habita, Animal2[] animalComido, Animal2[] animalQueCome) {
		// TODO Auto-generated constructor stub
	}

	// public abstract boolean huir(Animal2 a);

	// public abstract boolean atacar(Animal2 a);

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Familia getTipoFamilia() {
		return tipoFamilia;
	}

	public void setTipoFamilia(Familia tipoFamilia) {
		this.tipoFamilia = tipoFamilia;
	}

	public String getHabita() {
		return habita;
	}

	public void setHabita(String habita) {
		this.habita = habita;
	}

	public Animal2[] getAnimalComido() {
		return animalComido;
	}

	public void setAnimalComido(Animal2[] animalComido) {
		this.animalComido = animalComido;
	}

	public Animal2[] getAnimalQueCome() {
		return animalQueCome;
	}

	public void setAnimalQueCome(Animal2[] animalQueCome) {
		this.animalQueCome = animalQueCome;

	}

	public Animal2() {
		super();
		this.setAnimalQueCome(new Animal2[10]);
		this.setAnimalQueCome(new Animal2[10]);
		// TODO Auto-generated constructor stub
	}

}
