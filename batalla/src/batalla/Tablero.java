package batalla;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;

public class Tablero {
	private static final int TAMANIO_X = 10;
	private static final int TAMANIO_Y = 10;

	private Character[][] tablero = new Character[TAMANIO_X][TAMANIO_Y];
	private Flota flota = new Flota();

	public void impactar(Coordenada coord) {
		if (coordValida(coord)) {
			if (flota.existeEmbarcacionEnPosicion(coord))

				tablero[coord.getY() - 1][coord.getX() - 1] = '*';

			else
				tablero[coord.getY() - 1][coord.getX() - 1] = 'A';

		}
	}

	private boolean existeEmbarcacion(Coordenada coord) {
		return false;

	}

	public void inicializarTablero() {
		for (int i = 0; i < TAMANIO_X; i++) {
			for (int j = 0; j < TAMANIO_Y; j++) {

				tablero[i][j] = ' ';
			}

		}

	}

	public boolean coordValida(Coordenada coord) {
		boolean esValida = true;
		esValida = (coord.getY() >= 1 && coord.getY() <= TAMANIO_Y) && (coord.getX() >= 1 && coord.getX() <= TAMANIO_X);

		return esValida;

	}

	public void imprimir() {
		String[] letr = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
		String[] num = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

		for (String encabezado : num) {
			System.out.print("    " + encabezado);
		}

		for (int i = 0; i < TAMANIO_X; i++) {
			System.out.print("\n " + letr[i]);
			for (int j = 0; j < TAMANIO_Y; j++) {
				System.out.print(" [ " + tablero[i][j] + " ]");
			}
			System.out.print("\n");
		}
	}

	private void posicionarEmbarcaciones() {

		flota.getEmbarcaciones().forEach(e -> posicionarEmbarcacion(e));
	}

	private void posicionarEmbarcacion(Embarcacion e) {
		Random rand = new Random();
		List<Coordenada> coords= new ArrayList <Coordenada>();
		
		while (e.getTamanio() > coords.size()) {
			
			
			int x = rand.nextInt(TAMANIO_X) + 1;
			int y = rand.nextInt(TAMANIO_Y) + 1;

			if (Math.random() > 0.5) {
//				Posicion vertical

				for (int i = 0; i < e.getTamanio(); i++) {
					Coordenada coord = new Coordenada(x, y + i);
					if (coordValida(coord) && !flota.existeEmbarcacionEnPosicion(coord)) {
						coords.add(coord);

					} else
						break;
				}

			} else {
				System.out.println("Posicion Horizontal");
			}

		}
	}
}