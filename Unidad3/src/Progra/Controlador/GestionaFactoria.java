package Progra.Controlador;

import Progra.Modelo.RobotsEnsamblador;
import Progra.Modelo.CamaraSeguridad;
import Progra.Modelo.PuertaAutomatica;
import Progra.Modelo.SensorTemperatura;

public class GestionaFactoria {

	public static void main(String[] args) {
		// Robots
		GestionaFactoria gestion = new GestionaFactoria();
		RobotsEnsamblador soldador = new RobotsEnsamblador("Modelo X1", 15, "ENCENDIDO", "electricidad", "Soldador industrial",
				300, "Nivel 3");
		RobotPintor pintor = new RobotPintor("Modelo P2", 20, "APAGADO", "electricidad", "Pintor automático");
		RobotEnsamblador ensamblador = new RobotEnsamblador("Modelo E3", 12, "APAGADO", "gasolina",
				"Ensamblador de piezas");

		gestion.guardarRobot(soldador);
		gestion.guardarRobot(pintor);
		gestion.guardarRobot(ensamblador);

		// Dispositivo
		SensorTemperatura sensor = new SensorTemperatura("00:14:22:01:23:45", "ON_SINWIFI", new Date(), 22.5);
		CamaraSeguridad camara = new CamaraSeguridad("00:14:22:01:23:46", "OFF", new Date(), "1920x1080");
		PuertaAutomatica puerta = new PuertaAutomatica("00:14:22:01:23:47", "ON_SINWIFI", new Date(), true);

		gestion.guardarDispositivoWifi(sensor);
		gestion.guardarDispositivoWifi(camara);
		gestion.guardarDispositivoWifi(puerta);

		gestion.mostrarInventario();

	}

}
