package Modelo;

import Contador.Familia;

public class Leon extends Animal2 {

	public Leon(String nombre, Familia serpiente, String habita, Animal2[] animalComido, Animal2[] animalQueCome) {
		super(nombre, serpiente, habita, animalComido, animalQueCome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean huir(Animal2 a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean atacar(Animal2 a) {
		// TODO Auto-generated method stub
		return true;
	}

	public Leon() {
		super();
		// TODO Auto-generated constructor stub

	}
}
