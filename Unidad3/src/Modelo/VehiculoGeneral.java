package Progra.Modelo;

import Interfaces.IAlquilable;

public abstract class VehiculoGeneral implements IAlquilable {
	private String id;
	private String[] alquiler;

	public abstract float totalGenerado();

}
