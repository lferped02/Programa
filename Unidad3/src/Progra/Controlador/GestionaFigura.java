package Progra.Controlador;

import Progra.Modelo.*;

public class GestionaFigura{

	public static void main(String[] args) {
		Figura t = new Triangulo("azul",3 , 5);
		System.out.println(t.calcularArea());
		
		Circulo c = new Circulo();
		System.out.println(c.calculaArea());
	}

}
