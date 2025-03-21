package Expresiones_regulares;

public class ExpresionRegular {

	public static void main(String[] args) {
		String caracteres = "ABC";
		String numero = "12345678";

		System.out.println(numero.matches("[0-9]"));
	  //System.out.println(numero.matches("\\d")); //válida numero
		System.out.println(numero.matches("\\d+"));
	  //System.out.println(numero.matches("\\d{8}\\z\\p{alpha}"));
		
		System.out.println(numero.contains("[0-9]*"));
		
		System.out.println(caracteres.matches("[A-Za-z]"));
		System.out.println(caracteres.matches("[A-Za-z]{1}"));
		
		System.out.println(caracteres.matches("\\d {8}[A-Za-z]{1}"));

	}

}
