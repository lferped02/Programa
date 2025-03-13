package modelo.BoletinInterfaces2;

import java.time.LocalDate;

public interface IAlimento {

	public void setCaducidad(LocalDate fecha); 
	public LocalDate getCaducidad(); 
	public int getCalorias();

	
}
