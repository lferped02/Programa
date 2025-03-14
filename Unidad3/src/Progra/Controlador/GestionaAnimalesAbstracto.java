package Progra.Controlador;

import Progra.Modelo.*;

public class GestionaAnimalesAbstracto {

	public static void main(String[] args) {
		AnimalAbstracto p = new Perro();
		AnimalAbstracto g = new Gato();
		AnimalAbstracto pez = new Pez();
		
		//AnimalAbstracto a = new Animal(); Da error porque es una clase abstracta.

		System.out.println(p.getAlimento());
		System.out.println(p.getSonidoQueEmite());

		System.out.println(g.getAlimento());
		System.out.println(g.getSonidoQueEmite());

		System.out.println(pez.getAlimento());
		System.out.println(pez.getSonidoQueEmite());
	}

}