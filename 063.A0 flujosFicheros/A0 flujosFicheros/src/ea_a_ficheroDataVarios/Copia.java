package ea_a_ficheroDataVarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copia {
	public static void copiaFichero(String fuente, String destino) {
		DataInputStream entrada = null;
		DataOutputStream salida = null;
		int c;
		try {
			entrada = new DataInputStream(new FileInputStream(fuente));
			salida = new DataOutputStream(new FileOutputStream(destino));

			while ((c = entrada.read()) != -1) {
				salida.write(c);
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

	public static void copiaFichero2(String fuente, String destino) {
		DataInputStream entrada = null;
		DataOutputStream salida = null;
		byte c = 0;
		boolean eof = false;
		try {
			entrada = new DataInputStream(new FileInputStream(fuente));
			salida = new DataOutputStream(new FileOutputStream(destino));

			while (!eof) {
				try {
					c = entrada.readByte();
					salida.writeByte(c);
				} catch (EOFException ff) {
					eof = true;
				}
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

	public static void main(String[] args) {
		copiaFichero2("pic.gif", "pic4.gif");
	}

}
