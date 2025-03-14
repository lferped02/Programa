package Progra.Modelo;

public class Libro extends Recurso {
	private String autor;
	private String editorial;
	private String generoLiterario;
	private int diasPrestamo = 21;

	public Libro(int id, String ubicacion) {
		super(id, ubicacion);
		// TODO Auto-generated constructor stub
	}

	public Libro(int id, String ubicacion, String autor, String editorial, String generoLiterario, int diasPrestamo) {
		super(id, ubicacion);
		this.autor = autor;
		this.editorial = editorial;
		this.generoLiterario = generoLiterario;
		this.diasPrestamo = diasPrestamo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getGeneroLiterario() {
		return generoLiterario;
	}

	public void setGeneroLiterario(String generoLiterario) {
		this.generoLiterario = generoLiterario;
	}

	public int getDiasPrestamo() {
		return diasPrestamo;
	}

	public void setDiasPrestamo(int diasPrestamo) {
		this.diasPrestamo = diasPrestamo;
	}

	@Override
	public int getDevuelveDiasPrestamo() {
		// TODO Auto-generated method stub
		return this.getDiasPrestamo();
	}

	@Override
	public boolean estaDisponible() {
		// TODO Auto-generated method stub
		return false;

	}
}
