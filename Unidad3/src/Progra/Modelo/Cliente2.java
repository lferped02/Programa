package Modelo;

import Interfaces.IAcciones;

public class Cliente2 implements IAcciones {

	@Override
	public String ejecutaAcciones() {
		return "Cliente que compra";

	}

	@Override
	public String toString() {
		return ejecutaAcciones();
	}
}
