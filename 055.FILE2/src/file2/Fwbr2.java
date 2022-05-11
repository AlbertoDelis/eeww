package file2;

import java.io.*;

public class Fwbr2 {
	public static void main(String[] args) {
		File f = new File("salida.txt");
		int x = 105;
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String s = "";
			s = br.readLine();
			while (s != null) {
				System.out.println(s);
				s = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
