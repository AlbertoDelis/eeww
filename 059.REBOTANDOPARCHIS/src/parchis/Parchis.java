package parchis;

import java.io.*;
import java.util.Scanner;

public class Parchis {
	// Scanner sc = new Scanner(System.in);
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedInputStream bis = new BufferedInputStream(isr);
	int casilla;
	int posicion;
	int tirada;
	int posicionActual;
	String[] caso;
	{

		while (true) {
			caso = bis.readLine().split(" ");
			// caso = sc.nextLine().split(" ");
			casilla = Integer.parseInt(caso[0]);
			posicion = Integer.parseInt(caso[1]);
			tirada = Integer.parseInt(caso[2]);
			if (casilla == 0 && posicion == 0 && tirada == 0)
				return;
		}
		{
			// buscar soluciones
			if (posicion + tirada > casilla) {
				posicionActual = 2 * casilla - (posicion + tirada);
				// print resultado
			}

			System.out.println(caso);

		}
	}
}
