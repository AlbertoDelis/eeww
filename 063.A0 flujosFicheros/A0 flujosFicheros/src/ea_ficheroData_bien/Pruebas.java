package ea_ficheroData_bien;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Pruebas {

	static void prueba01() throws IOException {
		FileWriter fw = null;
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		Random rnd = new Random();
		int n;
		try {
			fw = new FileWriter("prueba01.txt");
			fos = new FileOutputStream("pruena01.bin");
			dos = new DataOutputStream(fos);
			for (int i = 0; i < 1000; i++) {
				n = rnd.nextInt(1000);
				fw.write(Integer.toString(n));
				
				dos.writeInt(n);
			}
		} finally {
			try {
				if (fw != null)
					fw.close();
				if (dos != null)
					dos.close();
				if (fos != null)
					fos.close();
			} finally {
				fw = null;
				fos = null;
				dos = null;
			}

		}

	}

	public static void main(String[] args) throws IOException {
		prueba01();
	}

}
