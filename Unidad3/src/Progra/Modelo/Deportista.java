package Progra.Modelo;

import java.time.LocalDate;

import EjemploEnum.EstadoPrueba;
import Interfaces.ICompeticion;
import Progra.Controlador.CompeticionException;

public abstract class Deportista implements ICompeticion {
	private static final Object[] Pruebas = null;
	private static final Prueba[] Prueba = null;
	private String nombre;
	private String pais;
	private int edad;
	private double peso;
	private double altura;
	private Prueba pruebas;

	public Deportista(String nombre, String pais, int edad, double peso, double altura) {
		this.nombre = nombre;
		this.pais = pais;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.pruebas = pruebas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Prueba getPruebas() {
		return pruebas;
	}

	public void setPruebas(Prueba pruebas) {
		this.pruebas = pruebas;
	}

	int numeroDiasEntre;

	public abstract double getTiempoCalentamiento();

	public abstract double getCaloriasNecesariasPorDia();

	public abstract int getHorasEntrenamiento(LocalDate fechaCompetencia);

	public Prueba getpruebaMasCercana() {
		Prueba p = null;
		for (int i = 0; i < Prueba.length; i++) {
			if (p != null && Pruebas[1].equals(EstadoPrueba.PLANIFICADA)) {
				int diaMinimo = p.getFecha().compareTo(LocalDate.now());
				Prueba itero = Prueba[i];
				int diasItero = itero.getFecha().compareTo(LocalDate.now());
				int diasMinimo = 0;
				if (diasMinimo > diasItero) {
					p = itero;
				}

			}

		}
		return p;
	}
}
