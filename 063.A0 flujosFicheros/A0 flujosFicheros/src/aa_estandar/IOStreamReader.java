package aa_estandar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.instrument.Instrumentation;
import java.nio.CharBuffer;

public class IOStreamReader {
	public static void main(String args[]) throws IOException {
		// ioR01();
		ioR02();
	}

	public static void ioR01() throws IOException {
		InputStream stdin = System.in;
		InputStreamReader stdinR = new InputStreamReader(stdin);
		int caracter;
		int contador = 0;
		System.out.println("Escribe algo ...");
		try {
			while ((caracter = stdinR.read()) != '\n') {
				contador++;
				// si no hacemos el moldeo a char escribe el valor ascii. sin
				// diferencias apreciables
				System.out.print(caracter);
			}
		} catch (IOException e) {
			System.out.println("Error en la lectura");
		}
		System.out.println();
		System.err.println("Contados " + contador + " bytes en total.");
	}

	public static void ioR02() {
		InputStream stdin = System.in;
		InputStreamReader stdinR = new InputStreamReader(stdin);
		char caracter[] = new char[1024];
		int contador = 0;
		System.out.println("Escribe algo ...");
		try {
			contador = stdinR.read(caracter);
		} catch (IOException e) {
			System.out.println("Error en la lectura");
		}
		for (int i = 0; i < contador; i++)
			// no hay moldeo, se visualiza correctamente
			System.out.print(caracter[i]);
		System.out.println();
		System.err.println("Contados " + contador + " bytes en total.");
	}

	public static void ioRB01() throws IOException {
		BufferedReader entradaEstandar = new BufferedReader(new InputStreamReader(System.in));
		String mensaje;
		System.out.println("Introducir una línea de texto:");
		mensaje = entradaEstandar.readLine();
		System.out.println("Introducido: \"" + mensaje + "\"");
	}
}
