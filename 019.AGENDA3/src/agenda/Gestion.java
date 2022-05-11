package agenda;

import java.util.Scanner;

public class Gestion {
	Agenda agenda= new Agenda();
	
	public Gestion() {
		agenda= new Agenda();
	}
	
	public void menu() {
		Amigo a;
		//opciones
		a= new Amigo("uno", "tlf", 12);
		agenda.alta(a);
		agenda.alta(new Amigo("Antonio", "tlf", 14));
		//consulta
		a= agenda.consulta("Antonio");
		if (a != null) 
			visualiza(a);
		agenda.baja(a);
		a= agenda.consulta("Antonio");
		if (a != null) {
			visualiza(a);
		}
	} 
	
	static public Amigo leeInformacion() {
		Scanner teclado= new Scanner(System.in);
		//Amigo a= new Amigo(nombre, tlf, edad)
		System.out.println("Nombre: ");
		String nombre= teclado.nextLine();
		System.out.println("Tlf: ");
		String tlf= teclado.nextLine();
		System.out.println("Edad: ");
		int edad= teclado.nextInt();
		Amigo amigo;
		amigo= new Amigo(nombre, tlf, edad);
		return amigo;	
	}
	
	public void visualiza(Amigo amigo) {
		System.out.println(amigo);
		
	}
	
	public static void main(String[] args) {
		
	}

}
