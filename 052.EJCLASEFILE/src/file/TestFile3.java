package file;

import java.io.File;

//Ejemplo 3: Programa que muestra el contenido de un directorio. En el ejemplo se muestra el contenido del directorio actual.

public class TestFile3 {
	public static void main(String[] args) {
		File directorio = new File("."); // directorio actual
		String[] lista = directorio.list();
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}
}