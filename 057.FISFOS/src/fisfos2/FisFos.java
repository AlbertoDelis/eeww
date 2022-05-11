package fisfos2;

import java.io.*;

public class FisFos {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File f = new File("prueba.txt");
		int array[] = new int[1024];
		int d;
		try (FileOutputStream fos = new FileOutputStream(f);
				DataOutputStream dos = new DataOutputStream(fos);
				FileInputStream fis = new FileInputStream(f);
				DataInputStream dis = new DataInputStream(fis)) {
			for (int i = 0; i < 234; i++) {
				dos.writeDouble((int) (Math.random() * 255));
				d=dis.readInt();
				System.out.print(d+"");
			}

		}

	}

}
