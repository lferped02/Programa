package Progra.Modelo;

import Interfaces.IAlquilable;
import Progra.EjemploEnum.Estado;

public abstract class VehiculoGeneral implements IAlquilable {
	private static final Alquiler[] Alquiler = null;
	private String id;
	protected String[] alquiler;

	public VehiculoGeneral(String id, String[] alquiler) {
		super();
		this.id = id;
		this.alquiler = alquiler;
	}

	@Override
	public float totalGenerado() {
		float importeTotal = 0;
		for (Alquiler a : getAlquiler()) {
			if (a.getEstado().equals(Estado.ENTREGADO) || a.getEstado().equals(Estado.CERRADO)) {

			}
		}
		return importeTotal;

	}

	public Alquiler[] getAlquiler() {
		return Alquiler;

	}

}
