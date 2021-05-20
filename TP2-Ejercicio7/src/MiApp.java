import java.util.Scanner;

public class MiApp {

	static Scanner ingresoDatos = new Scanner(System.in);

	public static void main(String[] args) {

		int edad = 0;
		int experiencia = 0;
		double remuneracion = 0.0;
		int opcion = 0;

		System.out.println("ingrese su edad");
		edad = ingresoDatos.nextInt();

		if (edad < 18 | edad > 35)
			System.out.println("RECHAZADO - Usted se encuentra fuera del rango de edad solicitado");

		if ((edad >= 18) & (edad <= 35)) {
			System.out.println("Ingrese la cantidad de años de experiencia en el rubro");
			experiencia = ingresoDatos.nextInt();

			System.out.println("Ingrese el monto de la remuneración pretendida");
			remuneracion = ingresoDatos.nextDouble();

			if ((edad >= 18) & (edad <= 32))

				opcion = 1;
			else
				opcion = 2;

			switch (opcion) {

			case 1:
				if ((remuneracion < 50000) & (experiencia < 3)) {
					System.out.println("CONTRATADO - Usted fue seleccionado para el puesto");
				} else if ((remuneracion > 50000) & (experiencia > 6)) {
					System.out.println("CONTRATADO - Usted fue seleccionado para el puesto");
				} else {
					System.out.println("RECHAZADO - Usted excede los valores de remuneración para el puesto");
				}
				break;

			case 2:

				if ((experiencia < 6) & (experiencia > 3)) {
					System.out.println("CONDICIONAL - Usted será contratado de forma condicional");
				} else {
					System.out.println("RECHAZADO - Usted no cumple con los años de experiencia solicitados para el puesto");

				}
				break;
			}
		}
	}
}
