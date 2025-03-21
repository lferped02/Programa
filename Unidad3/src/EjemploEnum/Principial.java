package EjemploEnum;

public class Principial {

	public static void main(String[] args) {

		Reserva reserva = new Reserva();

		DiaDeLaSemana aux = DiaDeLaSemana.valueOf(DiaDeLaSemana.class, "LUNES");

		for (DiaDeLaSemana dia : DiaDeLaSemana.values()) {
			if (dia == DiaDeLaSemana.MARTES) {
				System.out.println("Hoy es martes");
			}
		}
	}

}
