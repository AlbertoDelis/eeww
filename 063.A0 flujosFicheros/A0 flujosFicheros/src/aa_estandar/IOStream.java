package aa_estandar;

import java.io.*;

class IOStream {
	public static void main(String args[]) throws IOException {
		// io01();
		io02();
	}

	/*
	 * Lectura carácter a carácter
	 */
	public static void io01() throws IOException { // si lanza la excepción no
		// tenemos que capturarla
		InputStream stdin = System.in;
		int c;
		int contador = 0;
		System.out.println("Escribe algo ...");
		// se lee hasta encontrar el fin de línea
		while ((c = stdin.read()) != '\n') {
			contador++;
			// si no hacemos el moldeo a char escribe el valor ascii
			System.out.write((char) c);
		}
		System.out.println();
		System.err.println("Contados " + contador + " bytes en total.");
	}

	/*
	 * Usando un array de bytes
	 */
	public static void io02() {
		InputStream stdin = System.in;
		int contador = 0;
		byte[] caracter = new byte[10];
		System.out.println("Escribe algo ...");
		try {
			contador = stdin.read(caracter);
		} catch (IOException e) {
			System.out.println("Error en la lectura");
		}
		for (int i = 0; i < contador; i++)
			System.out.print((char) caracter[i]);
		System.out.println();
		System.err.println("Contados " + contador + " bytes en total.");

		System.out.println("Escribe algo ...");
		try {
			// indica el número de bytes que queremos leer, len, desde el
			// principio, y se almacenan en el array, desde off
			contador = stdin.read(caracter, 3, 2);
		} catch (IOException e) {
			System.out.println("Error en la lectura");
		}
		for (int i = 0; i < caracter.length; i++)
			System.out.print((char) caracter[i]);
		System.out.println();
		System.err.println("Contados " + contador + " bytes en total.");

	}
}
