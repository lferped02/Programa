package CorreoElectronico;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorreoElectronico {
	private String nombre;
	private String dominio;

	public CorreoElectronico(String correo) {
		String[] partes = correo.split("@");
		if (partes.length == 2) {
			this.nombre = partes[0];
			this.dominio = partes[1];
		}
	}

	public static boolean esCorreoValido(String correo) {
		String regex = "^[^@]+@([A-Za-z0-9.-]+)\\.[A-Za-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(correo);
		return matcher.matches();
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getDominio() {
		return dominio;
	}

	protected void setDominio(String dominio) {
		this.dominio = dominio;
	}

	@Override
	public String toString() {
		return nombre + "@" + dominio;
	}
}
