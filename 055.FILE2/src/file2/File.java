package file2;

import java.io.*;

/*
* Programa que une dos archivos:
* Añade al fuente el contenido del destino
* Elimina el archivo destino
* Renombra el archivo fuente con la concatenación de los dos nombres.
*/

public class File {
	public static void main(String[] args) throws IOException {
		String archivo1 = "datos.txt";
		String archivo2 = "salida.txt";
		String cadena;
		try (FileReader f1 = new FileReader(archivo1);
				BufferedReader b1 = new BufferedReader(f1);
				FileReader f2 = new FileReader(archivo2);
				BufferedReader b2 = new BufferedReader(f2);
				FileWriter fw1 = new FileWriter(archivo1);
				FileWriter fw2 = new FileWriter(archivo2)) {
			while ((cadena = b1.readLine()) != null) {
				System.out.println(cadena);
				String array[] = cadena.split(",");
				fw2.write(cadena);
			}
		}
	}
}