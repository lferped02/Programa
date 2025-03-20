package Progra.Modelo;

public class Pelicula extends ElementosMultimedia {
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

		public Pelicula(int id, String ubicacion, int minutos) {
			super(id, ubicacion);
			this.minutos = minutos;

		}
		@Override
		public int getDevuelveDiasPrestamo() {
			// TODO Auto-generated method stub
			return this.getDiasPrestamo();
		}
	}
