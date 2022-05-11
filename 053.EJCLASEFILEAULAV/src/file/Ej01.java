package file;

import java.io.*;

/*
Crea un objeto de tipo "File" y prueba el funcionamiento de aquellos m�todos que te resulten interesantes:
Propiedades de archivos: ve cuales tiene y cambia alguna.
Crea y borra algunos archivos.
Crea y borra alg�n directorio.
Comprueba los separadores de carpetas y de rutas.
Fecha de �ltima modificaci�n.
... otros.
*/

public class Ej01 {

	public static void main(String[] args) throws FileNotFoundException {
		File ruta = new File("c:/ficheros");
		File f = new File(ruta, "datos.txt");
		File f2 = new File(ruta, "datos2.txt");
		File f3 = new File(ruta, "datos3.txt");
		File f4 = new File(ruta, "datos4.txt");
		File f5 = new File(ruta, "datos5.txt");
		System.out.println(f.length());
		/*
		f.delete();
		f2.delete();
		f3.delete();
		f4.delete();
		f5.delete();
		ruta.delete();
		*/
	}
}
