package batalla;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
public static void main (String[] args) {
	
	
	Tablero principal = new Tablero();
	principal.inicializarTablero();
	principal.imprimir();
	Coordenada c = new Coordenada (9,3);
	principal.impactar(c);
	principal.imprimir();
}}