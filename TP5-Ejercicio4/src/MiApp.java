
import java.util.Random;

public class MiApp {

	public static void main(String[] args) {

		String[] apellidos = new String[70];
		int[] notas = new int[70];
		int sumaNotas = 0;
		int promedioTotal = 0;

		inicializarVecApellidoYNota(apellidos, notas);

		promedioTotal = calcularPromedioNotas(notas, sumaNotas, promedioTotal);

		System.out.println("El promedio de notas total es: " + promedioTotal);
		System.out.println("\nAlumnos que superan el promedio general:");
		System.out.println("Apellido\tNota \n---------    ---------");
		listadoAlumnosSuperanElPromedio(apellidos, notas, promedioTotal);

	}

	public static void listadoAlumnosSuperanElPromedio(String[] apellidos, int[] notas, int promedioTotal) {
		int i;
		for (i = 0; i < notas.length; i++) {
			if (notas[i] > promedioTotal) {

				System.out.println(apellidos[i] + "\t " + notas[i]);
			}

		}
	}

	public static int calcularPromedioNotas(int[] notas, int sumaNotas, int promedioTotal) {
		int i;
		for (i = 0; i < notas.length; i++) {

			sumaNotas += notas[i];
			promedioTotal = sumaNotas / notas.length;

		}
		return promedioTotal;
	}

	public static void imprimirTotalListado(String[] apellidos, int[] notas) {

		System.out.println("Apellido\tNota \n---------    ---------");
		for (int i = 0; i < apellidos.length; i++) {
			System.out.println(apellidos[i] + "\t " + notas[i]);
		}
	}

	public static void inicializarVecApellidoYNota(String[] apellidos, int[] notas) {
		for (int i = 0; i < apellidos.length; i++) {

			for (int j = 0; j < notas.length; j++) {
				Random r = new Random();

				apellidos[i] = ("Alumno " + (i + 1));
				notas[j] = r.nextInt(10) + 1;

			}
		}
	}
}
