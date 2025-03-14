package Progra.Modelo;

public class Roedor extends Animal2 {

	public Roedor(String nombre, Familia tipoFamilia, String habita, Animal2[] animalComido, Animal2[] animalQueCome) {
		super(nombre, tipoFamilia, habita, animalComido, animalQueCome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean huir(Animal2 a) {
		boolean huye = a instanceof Serpiente;
		return huye;
	}

	@Override
	public boolean atacar(Animal2 a) {
		// TODO Auto-generated method stub
		return false;
	}

	public Roedor() {
		super();
		// TODO Auto-generated constructor stub
	}

}
