package Modelo;

public class VideoJuego extends ElementosMultimedia{

	private int minutos;

	public void setMinuto(int minutos) {
		this.minutos = minutos;

	}

	@Override
	public int duracion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Pelicula [minutos=" + minutos + ", getNombre()=" + getNombre() + ", getGenero()=" + getGenero() + "]";
	}

	public VideoJuego(int id, String ubicacion) {
		super(id, ubicacion);
		this.minutos = minutos;

	}
	public VideoJuego(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getDevuelveDiasPrestamo() {
		// TODO Auto-generated method stub
		return this.getDiasPrestamo();
	}
}
