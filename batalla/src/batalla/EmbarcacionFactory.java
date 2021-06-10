package batalla;

public class EmbarcacionFactory {

	public static Embarcacion crearEmbarcacion(String tipo) {

		Embarcacion emb = null;

		if ("Acorazado".equalsIgnoreCase(tipo)) {

			emb = new Acorazado();
			if ("Submarino".equalsIgnoreCase(tipo)) {
				emb = new Submarino();
			}
			if ("Destructor".equalsIgnoreCase(tipo)) {
				emb = new Destructor();
			}
			if ("Fragata".equalsIgnoreCase(tipo)) {
				emb = new Fragata();
			}
			if ("Portaavion".equalsIgnoreCase(tipo)) {

				emb = new Portaavion();
			}

		}
		return emb;
	}
}
