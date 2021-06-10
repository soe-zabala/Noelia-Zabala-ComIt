package batalla;

public class Submarino extends Embarcacion {
	
	
	public static final int TAMANIO = 3;
	public static final String NOMBRE  = "Submarino";

	public Submarino() {

	}

	@Override
	public int getTamanio() {
		// TODO Auto-generated method stub
		return TAMANIO;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return NOMBRE;
	}
}