package Progra.Controlador;
import java.util.Date;

public class GestionaDeportistas {
	public static void main(String[] args) {
		try {
			Prueba prueba1 = new Prueba("100m", "Piscina Olímpica", new Date(), "PLANIFICADA");
			Prueba prueba2 = new Prueba("Maratón", "Estadio", new Date(), "PLANIFICADA");
			Prueba prueba3 = new Prueba("200m", "Piscina Olímpica", new Date(), "PLANIFICADA");

			Deportista nadador = new Nadador("Juan", "España", 25, 70, 1.80);
			Deportista corredor = new Corredor("Pedro", "México", 28, 75, 1.75);

			nadador.agregarPrueba(prueba1);
			nadador.agregarPrueba(prueba2);
			corredor.agregarPrueba(prueba3);

			System.out.println("Próxima prueba del nadador: " + nadador.obtenerProximaPrueba().getIdentificador());
			System.out.println("Próxima prueba del corredor: " + corredor.obtenerProximaPrueba().getIdentificador());

		} catch (CompeticionException e) {
			e.printStackTrace();
		}
	}
}
