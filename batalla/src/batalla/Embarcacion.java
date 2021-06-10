package batalla;

import java.util.ArrayList;
import java.util.List;

public abstract class  Embarcacion {

	
	List<Coordenada> coordenadas = new ArrayList<>();
	
	public abstract int getTamanio();
	public abstract String getNombre();
	
	public List <Coordenada> getCoordenadas(){
		
		return coordenadas;
	}
	
	public void agregarCoordenada (Coordenada coord) {
		
		this.coordenadas.add(coord);
		
	}
}
//	