package Controlador;

import Contador.Estado;
import Modelo.CamaraSeguridad;
import Modelo.PuertaAutomatica;
import Modelo.RobotsEnsamblador;
import Modelo.RobotsPintor;
import Modelo.RobotsSoldador;
import Modelo.SensorTemperatura;

public class GestionaFactoria {


	public static void main(String[] args) {
		// Robots
		GestionaFactoria gestion = new GestionaFactoria();
		RobotsSoldador soldador = new RobotsSoldador("Sergio", 20, Estado.ALERTA);
		RobotsPintor pintor = new RobotsPintor("Javier", 0, Estado.APAGADO);
		RobotsEnsamblador ensamblador = new RobotsEnsamblador("Laura",60,Estado.APAGADO);



		// Dispositivo
		SensorTemperatura sensor = new SensorTemperatura("00:1A;2B:3C;4D,5E",EstadoDispositivo.ON_CONECTADO);
		CamaraSeguridad camara = new CamaraSeguridad(null, null, null);
		PuertaAutomatica puerta = new PuertaAutomatica(null, null, null);
		
		

	}

}
