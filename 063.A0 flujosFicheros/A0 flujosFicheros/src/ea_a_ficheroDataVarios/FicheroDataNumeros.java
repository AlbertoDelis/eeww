package ea_a_ficheroDataVarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class FicheroDataNumeros {
	static final int N = 100;

	static void graba() {
		Random a = new Random();
		try {
			FileOutputStream fSalida = new FileOutputStream("numeros.dat");
			DataOutputStream dOS = new DataOutputStream(fSalida);
			for (int n = 0; n < N; n++) {
				dOS.writeInt(a.nextInt(1000));
			}
			dOS.close();
			fSalida.close();
		} catch (IOException e) {
		} finally {
		}
	}

	static void lee() {
		DataInputStream dIS = null;
		boolean ff = false;
		try {
			dIS = new DataInputStream(new FileInputStream("numeros.dat"));
			while (!ff)
				try {
					System.out.println(dIS.readInt());
				} catch (EOFException eof) {
					ff = true;
					//System.out.println("Fin: " + eof.toString());
				}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(dIS != null)
					dIS.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		graba();
		lee();
	}

}
