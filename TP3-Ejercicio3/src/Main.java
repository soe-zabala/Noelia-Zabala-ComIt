
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ingresoDatos = new Scanner(System.in);

		int cantidadPatentes = 0, i = 1, contador=0;
		double nroPatente = 0.0, sumaTotalRecaudada=0.0, recaudado=0.0;

		System.out.println("Ingrese la cantidad de patentes procesadas");
		cantidadPatentes = ingresoDatos.nextInt();

		while (i <= cantidadPatentes) {

			System.out.println("Ingrese numero de patente");
			nroPatente = ingresoDatos.nextDouble();
			if (nroPatente < 1000000) {
				recaudado = (nroPatente * 5) / 100;
				System.out.println("-----------------------------------------------------------");
				System.out.println("Patente numero: " + (int)nroPatente + "\t-  Monto abonado:  " + recaudado);
				System.out.println("-----------------------------------------------------------");

			} else if ((nroPatente >= 1000000) & (nroPatente <= 2000000)) {
				recaudado = (nroPatente * 10) / 100;
				System.out.println("-----------------------------------------------------------");
				System.out.println("Patente numero: " + (int)nroPatente + "\t-  Monto abonado:  " + recaudado);
				System.out.println("-----------------------------------------------------------");
				
			} else  {
				recaudado= (nroPatente * 15) / 100;
				System.out.println("-----------------------------------------------------------");
				System.out.println("Patente numero: " + (int)nroPatente + "\t-  Monto abonado:  " + recaudado);
				System.out.println("-----------------------------------------------------------");
			}
			sumaTotalRecaudada += recaudado; 
			if (nroPatente>1300000) {
				contador++;}
			i++;
		}
		
		System.out.println("=============================================================");
		System.out.println("Total Recaudado Registro Automotor:\t "+ sumaTotalRecaudada);
		System.out.println("=============================================================");
		System.out.println("Porcentaje de Patentes con valor mayor a 1.300.000:  " +  contador);
		System.out.println("=============================================================");
		
	}
}