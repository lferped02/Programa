package Mascota;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

class GestionaTiendaAnimales {
	private List<Mascota> mascotas;

	public GestionaTiendaAnimales() {
		this.mascotas = new ArrayList<>();

	}

	public void eliminarMascota(Mascota mascota) {
		this.mascotas.remove(mascota);
		System.out.println("Mascota eliminada" + mascota.getNombre());

	}

	public void agregarMascota(Mascota mascota) {
		this.mascotas.add(mascota);
	}
	

	Perrito perrito = new Perrito("Duque", 5, new LocalDate(2016, 7, 30), "Pequinés", true);
	Loro loro = new Loro("Canela", 3, new LocalDate(2018, 1, 13), "Marruecos", "Curvo", true);
	Canario canario = new Canario("Perico", 2, new LocalDate(2022, 3, 3), "Amarillo", true, "Recto");
	Gatito gatito = new Gatito("Miura", 4, new LocalDate(2019, 6, 2), "Negro", true);
	Serpiente serpiente = new Serpiente("Cubra", 2, new LocalDate(2023, 1, 1), 4, 3);

}
