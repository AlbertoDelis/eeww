import java.io.*;
import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(new File("palabras.txt"));
		String linea;
		String nombre= "vuelos2.txt";
		File f=new File(nombre);
		try {
			//abre
			Scanner sc=new Scanner(f);
			Scanner vuelos2;
			//procesa
			while(sc.hasNextLine()) {
				linea=sc.nextLine();
				System.out.println();
				System.out.println(linea);
				vuelos2=new Scanner(linea);
				System.out.println("nombre: "+vuelos2.next());
				System.out.println("dni: "+vuelos2.next());
				System.out.println("edad: "+vuelos2.next());
				System.out.println("altura: "+vuelos2.next());
				
				
				
			}
			//cierra
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fichero NO existe: "+nombre);//+f.getName()
			e.printStackTrace();
		}	
	}
}
