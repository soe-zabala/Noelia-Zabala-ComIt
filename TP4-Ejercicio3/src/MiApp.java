import java.util.*;

public class MiApp {
	public static void main(String[] args) {
		int ingreso = 0;

		Scanner ingresoDatos = new Scanner(System.in);
		do {
			System.out.println(
					"Indique el numero de la figura geométrica que quiere calcular el área:\n 1-Círculo \n 2-Cuadrado \n 3-Rectángulo \n 4-Triángulo \n 5-Trapecio");

			int opcion = ingresoDatos.nextInt();

			calculosAreasFigurasGeometricas(opcion, ingresoDatos);
			System.out.println("¿Necesita calcular el área de otra figura?:\n 1-SI \n 2-NO");
			ingreso = ingresoDatos.nextInt();

		} while (ingreso == 1);
	}

	public static void calculosAreasFigurasGeometricas(int opcion, Scanner ingresoDatos) {
		switch (opcion) {

		case 1: {

			calculoAreaCirculo(ingresoDatos);

		}
			break;

		case 2:
		case 3: {
			calculoAreaCuadrRect(ingresoDatos);

		}
			break;
		case 4: {
			calculoAreaTriangulo(ingresoDatos);

		}
			break;
		case 5: {
			calculoAreaTrapecio(ingresoDatos);

		}
			break;
		}
	}

	public static void calculoAreaTrapecio(Scanner ingresoDatos) {
		System.out.println("Indique el valor de las bases");
		double base1 = ingresoDatos.nextDouble();
		double base2 = ingresoDatos.nextDouble();
		System.out.println("Indique el valor de la altura");
		double altura = ingresoDatos.nextDouble();
		double calculo = (((base1 + base2) * altura) / 2);
		System.out.println("El valor del área es: " + calculo);
	}

	public static void calculoAreaTriangulo(Scanner ingresoDatos) {
		System.out.println("Indique el valor de la base");
		double base = ingresoDatos.nextDouble();
		System.out.println("Indique el valor la altura");
		double altura = ingresoDatos.nextDouble();
		double calculo = ((base * altura) / 2);
		System.out.println("El valor del área es: " + calculo);
	}

	public static void calculoAreaCuadrRect(Scanner ingresoDatos) {
		System.out.println("Indique el valor de la base");
		double base = ingresoDatos.nextDouble();
		System.out.println("Indique el valor la altura");
		double altura = ingresoDatos.nextDouble();
		double calculo = (base * altura);
		System.out.println("El valor del área es: " + calculo);
	}

	public static void calculoAreaCirculo(Scanner ingresoDatos) {
		System.out.println("Indique el valor del diametro");
		double diametro = ingresoDatos.nextDouble();
		double diametroCuadrado = Math.pow(diametro, 2);
		double calculo = (diametroCuadrado * (Math.PI / 4));
		System.out.println("El valor del área es: " + calculo);
	}
}
