package data;

import java.io.*;
import java.util.*;

public class DataEjemplo  {
	static void graba(DataOutputStream dos) throws IOException {
		Random r=new Random();
		int n=r.nextInt(256);
		dos.writeChar((char)n);
		dos.writeChar(n);
		dos.writeDouble(r.nextDouble());
	}
	
	static void lee(DataInputStream dis) throws IOException {
		char c=dis.readChar();
		int n=dis.readInt();
		double d=dis.readDouble();
		System.out.printf("%s %s %s",c,n,d);
	}
	
	public static void main(String[] args) {
		File f = new File("prueba.datos");
		Random r = new Random();
		try (FileOutputStream fis = new FileOutputStream(f); DataOutputStream dos = new DataOutputStream(fis);) {
			for (int i = 0; i < 24; i++) {
				graba(dos);
			}
			dos.close();

		} catch (FileNotFoundException e) {
			System.out.println("No se encontró el archivo!!!");

		} catch (IOException e) {
			System.out.println("Error al escribir!!!");

		}
	}

}
