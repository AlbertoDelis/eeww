/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_usoFicheros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * @author ali
 */
public class UsandoFicheros {
	/*
	 * Ficheros de bytes: FileInputStream FileOutputStream
	 */

	// Graba la cadena en un fichero carácter a carácter
	public static void creaFichero01() {
		FileOutputStream salida;
		String cadena = "En un lugar de la Mancha";
		//byte unByte = (byte) 234;
		try {
			// si el fichero no existe se crea y si existe también, eliminando
			// su contenido
			salida = new FileOutputStream("texto.dat");
			for (int c = 0; c < cadena.length(); c++)
				salida.write(cadena.charAt(c));
			salida.write((byte) '\n');
			//salida.write(unByte);
			salida.close();
		} catch (IOException eio) {
			System.out.println("Problemas en el flujo de salida");
		}
	}
	public static void creaFichero01Recursos() throws FileNotFoundException, IOException {
		String cadena = "En un lugar de la Mancha";
		//byte unByte = (byte) 234;
		try (FileOutputStream salida = new FileOutputStream("texto.dat");){
			for (int c = 0; c < cadena.length(); c++)
				salida.write(cadena.charAt(c));
			salida.write((byte) '\n');
			//salida.write(unByte);
			//salida.close();
		}
		
	}

	// Graba la cadena en un fichero
	public static void creaFichero02() {
		FileOutputStream salida;
		String cadena = "En un lugar de la Mancha";
		byte[] aBytes;
		try {
			salida = new FileOutputStream("texto.dat");
			// crea array de bytes y lo graba completo
			aBytes = cadena.getBytes();
			salida.write(aBytes);
			salida.write((byte) '\n');

			// lo graba carácter a carácter
			/*
			 * for (int c = 0; c < aBytes.length; c++) salida.write(aBytes[c]);
			 * salida.write((byte) '\n');
			 */
			salida.close();
		} catch (IOException eio) {
			System.out.println("Problemas en el flujo de salida");
		}
	}

	public static void leeFichero(String nombre) {
		FileInputStream entrada;
		int c;
		// Lee del fichero byte a byte
		try {
			entrada = new FileInputStream(nombre);
			while ((c = entrada.read()) != -1) {
				System.out.print((char) c);
			}
			entrada.close();
		} catch (IOException eio) {
			System.out.println("Problemas en el flujo de salida");
		}
	}
	public static void leeFichero2(String nombre) {
		FileInputStream entrada;
		int c;
		byte [] a = new byte[1];
		// Lee del fichero byte a byte
		try {
			entrada = new FileInputStream(nombre);
			while ((c = entrada.read(a)) != -1) {
				System.out.print(a[0]);
			}
			entrada.close();
		} catch (IOException eio) {
			System.out.println("Problemas en el flujo de salida");
		}
	}

	public static void anhadeFichero() {
		FileOutputStream salida;
		String cadena = "de cuyo nombre no quiero acordarme";
		// Graba la cadena en un fichero
		try {
			salida = new FileOutputStream("texto.dat", true);// abierto en modo
																// append
			for (int i = 0; i < cadena.length(); i++) {
				salida.write((byte) cadena.charAt(i));
			}
			salida.write((byte) '\n');
			salida.close();
		} catch (IOException eio) {
			System.out.println("Problemas en el flujo de salida");
		}
	}

	public static void copiaFichero(String fuente, String destino) {
		FileInputStream entrada = null;
		FileOutputStream salida = null;
		int c;
		try {
			entrada = new FileInputStream(fuente);
			salida = new FileOutputStream(destino);
			c = entrada.read();
			while ((c) != -1) {
				salida.write(c);
				c = entrada.read();
			}
		} catch (IOException eio) {
			System.out.println("Problemas en el flujo de salida");
		} finally {
			try {
				entrada.close();
				salida.close();
			} catch (IOException e) {
			}
		}

	}

	/*
	 * añadimos un array como buffer de entrada/salida
	 */
	public static void copiaFicheroMejorado(String fuente, String destino) {
		FileInputStream entrada = null;
		FileOutputStream salida = null;
		byte[] buffer = new byte[2048];
		int leidos;
		try {
			entrada = new FileInputStream(fuente);
			salida = new FileOutputStream(destino);
			
			leidos = entrada.read(buffer);
			while ((leidos) > 0) {
				salida.write(buffer, 0, leidos);
				leidos = entrada.read(buffer);
			}
		} catch (IOException eio) {
			System.out.println("Problemas en el flujo de salida");
		} finally {
			try {
				entrada.close();
				salida.close();
			} catch (IOException e) {
			}
		}
	}

	/*
	 * Añadimos buffers
	 */
	public static void copiaFicheroBuffered(String fuente, String destino) {
		FileInputStream entrada;
		FileOutputStream salida;
		BufferedInputStream bInput;
		BufferedOutputStream bOutput;
		int c;
		try {
			entrada = new FileInputStream(fuente);
			salida = new FileOutputStream(destino);
			bInput = new BufferedInputStream(entrada);
			bOutput = new BufferedOutputStream(salida);
			long ti= System.currentTimeMillis();
			while ((c = bInput.read()) != -1) {
				bOutput.write(c);
			}
			long tf= System.currentTimeMillis();
			
			bInput.close();
			bOutput.close();
			entrada.close();
			salida.close();
		} catch (IOException eio) {
			System.out.println("Problemas en el flujo de salida");
		}
	}

	/*
	 * añadimos un array como buffer de entrada/salida
	 */
	public static void copiaFicheroMejoradoBuffered(String fuente, String destino) {
		FileInputStream entrada = null;
		FileOutputStream salida = null;
		BufferedInputStream bEntrada = null;
		BufferedOutputStream bSalida = null;
		byte[] buffer = new byte[1024];
		int leidos;
		try {
			entrada = new FileInputStream(fuente);
			salida = new FileOutputStream(destino);
			bEntrada = new BufferedInputStream(entrada);
			bSalida = new BufferedOutputStream(salida);

			while ((leidos = bEntrada.read(buffer)) > 0) {
				bSalida.write(buffer, 0, leidos);
			}
		} catch (IOException eio) {
			System.out.println("Problemas en el flujo de salida");
		} finally {
			try {
				bEntrada.close();
				bSalida.close();
				entrada.close();
				salida.close();
			} catch (IOException e) {
			}
		}

	}

	/*
	 * Ficheros de texto FileReader PrintWriter
	 */
	public static void creaFicheroTexto() {
		PrintWriter salida;
		String cadena = "En un lugar de la Mancha";
		// Graba la cadena en un fichero
		try {
			salida = new PrintWriter("textoWriter.txt");
			// salida.write(cadena);
			// salida.write('\n');
			salida.println(cadena);
			salida.close();
		} catch (IOException eio) {
			System.out.println("Problemas en el flujo de salida");
		}
	}

	public static void leeFicheroTexto(String nombre) {
		FileReader entrada;
		try {
			int c;
			entrada = new FileReader(nombre);
			while ((c = entrada.read()) != -1) {
				System.out.print( (char) c);
			}
			entrada.close();
		} catch (IOException eio) {
			System.out.println("Problemas en el flujo de salida");
		}
	}
	public static void leeFicheroTexto2(String nombre) {
		FileReader entrada;
		try {
			int c;
			char [] a= new char[1];
			entrada = new FileReader(nombre);
			while ((c = entrada.read(a)) != -1) {
				System.out.print( a );
			}
			entrada.close();
		} catch (IOException eio) {
			System.out.println("Problemas en el flujo de salida");
		}
	}

	/*
	 * Añadimos buffers
	 */
	public static void leeFicheroTextoBuffer(String nombre) {
		FileReader entrada;
		BufferedReader buffer;
		try {
			String cadena;
			entrada = new FileReader(nombre);
			buffer = new BufferedReader(entrada);
			cadena = buffer.readLine();
			System.out.print(cadena);
			entrada.close();
		} catch (IOException eio) {
			System.out.println("Problemas en el flujo de salida");
		}
	}

	public static void cuentaPalabras() {
		File archivo = null;
		try {
			archivo = new File("texto.txt");// "archivo.txt" es el archivo
			// que va a leer
			String linea;
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			int i, j, a = 0;
			while ((linea = br.readLine()) != null) {
				for (i = 0; i < linea.length(); i++) {
					if (i == 0) {
						if (linea.charAt(i) != ' ') {
							a++;
						}
					} else {
						if (linea.charAt(i - 1) == ' ') {
							if (linea.charAt(i) != ' ') {
								a++;
							}
						}

					}
				}
			}

			System.out.println("son " + a + " palabras");

			fr.close();
		} catch (IOException a) {
			System.out.println(a);
		}
	}

	public static void leeBytes() {
		try {
			FileInputStream archivo = new FileInputStream("pic.gif");
			boolean eof = false;
			int contador = 0;
			while (!eof) {
				int entrada = archivo.read();
				System.out.print(entrada + " ");
				if (entrada == -1)
					eof = true;
				else
					contador++;
			}
			archivo.close();
			System.out.println("\nBytes leídos: " + contador);
		} catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}
	}

	public static void escribeBytes() {
		int[] datos = { 71, 73, 70, 56, 57, 97, 13, 0, 12, 
				0, 145, 0, 0, 255, 255, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0,
				44, 0, 0, 0, 0, 13, 0, 12, 0, 0, 2, 38, 132, 45, 121, 11, 
				25, 175, 150, 120, 20, 162, 132, 51, 110, 106,
				239, 22, 8, 160, 56, 137, 96, 72, 77, 33, 130, 86, 37, 
				219, 182, 230, 137, 89, 82, 181, 50, 220, 103,
				20, 0, 59 };
		try {
			FileOutputStream archivo = new FileOutputStream("pic.gif");
			for (int i = 0; i < datos.length; i++)
				archivo.write(datos[i]);
			archivo.close();
		} catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {

		/*
		creaFichero01();
		leeFichero("texto.dat");
		anhadeFichero();
		leeFichero("texto.dat");
		copiaFicheroMejoradoBuffered("texto.dat", "textoCopia.dat");
		copiaFichero("pic.gif", "pic1.gif");
		copiaFicheroMejorado("pic1.gif", "pic2.gif");
		leeFichero("textoCopia.dat");
		creaFicheroTexto();
		leeFicheroTextoBuffer("textoWriter.txt");
		//copiaFicheroBuffer();
		 */
		leeFichero2("texto.dat");

		leeFicheroTexto2("textoWriter.txt");

		// cuentaPalabras();
		//leeBytes();

	}
}
