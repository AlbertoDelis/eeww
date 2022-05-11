package file2;

import java.io.*;

public class Fwbr3 {
	public static void main(String[] args) {
		try (FileReader fr = new FileReader("datos.txt");
				FileWriter fw = new FileWriter("datos.txt");
				BufferedReader entrada = new BufferedReader(fr);
				BufferedWriter salida = new BufferedWriter(fw);) {
			System.out.println("INICIO");
			int car = entrada.read();
			while (car != -1) {
				salida.write((char) car);
				car = entrada.read();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("FIN");
	}

}
