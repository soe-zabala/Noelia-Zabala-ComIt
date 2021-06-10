package batalla;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Flota {
	List<Embarcacion> embarcaciones = new ArrayList<>();

	public boolean existeEmbarcacionEnPosicion(Coordenada coord) {

		List<Coordenada> listaCoord = new ArrayList<>();
		embarcaciones.forEach(e -> listaCoord.addAll(e.getCoordenadas()));
		Optional<Coordenada> embarcacion = listaCoord.stream()
				.filter(c -> c.getX() == coord.getX() && c.getY() == coord.getY()).findFirst();
		return embarcacion.isPresent();

	}

	private void crearFlota() {
		embarcaciones.add(EmbarcacionFactory.crearEmbarcacion("Portaavion"));
		embarcaciones.add(EmbarcacionFactory.crearEmbarcacion("Acorazado"));

		for (int i = 1; i <= 2; i++) {
			embarcaciones.add(EmbarcacionFactory.crearEmbarcacion("Submarino"));
			embarcaciones.add(EmbarcacionFactory.crearEmbarcacion("Fragata"));
		}
		for (int i = 1; i <= 3; i++) {
			embarcaciones.add(EmbarcacionFactory.crearEmbarcacion("Destructor"));
			
		}
		
		{
			
		}
	}

	public List<Embarcacion> getEmbarcaciones() {
		return embarcaciones;
	}

	
	
	
}
