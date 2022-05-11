package file2;

import java.io.*;

public class Fwbr {

	public static void main(String[] args) {
		File f = new File("salida.txt");
		try ( FileWriter fw = new FileWriter(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)){
			String texto = " ";
			while (texto.length() > 0) {
				texto = br.readLine();
				fw.write(texto + "\r\n");
			}
		} 
	}

}
