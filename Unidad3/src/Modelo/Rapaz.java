package Modelo;

import Contador.Familia;

public class Rapaz extends Animal2 {

	public Rapaz(String nombre, Familia tipoFamilia, String habita, Animal2[] animalComido, Animal2[] animalQueCome) {
		super(nombre, tipoFamilia, habita, animalComido,animalQueCome);
	}

	@Override
	public boolean huir(Animal2 a) {
		boolean huye = a instanceof Leon;
		return a instanceof Leon;
	}

	@Override
	public boolean atacar(Animal2 a) {
		boolean ataca = a instanceof Serpiente || a instanceof Roedor;
		return ataca;
	}

	public Rapaz() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

