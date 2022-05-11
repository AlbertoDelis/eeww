import java.io.*;

public class Scanner2 {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("vuelos2.txt");
		PrintWriter pw= new PrintWriter(f);
		pw.println("Listado de vuelos: ");
		for (String string : args) {
			
		}
		pw.close();

	}

}
