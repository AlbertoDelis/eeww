package agenda;

import java.util.Scanner;

public class Gestion {
	Agenda agenda;

	public Gestion() {
		agenda = new Agenda();
	}

	public void menu() {
		Amigo a;
		// opciones
		// a= leeInformacion();
		a = new Amigo("uno", "tlf", 12);
		agenda.alta(a);
		agenda.alta(new Amigo("Antonio", "tlf", 14));
		// consulta
		a = agenda.consulta("Antonio");
		if (a != null)
			visualiza(a);
		agenda.baja(a);

		a = agenda.consulta("Antonio");
		if (a != null)
			visualiza(a);
	}

	public Amigo leeInformacion() {
		Scanner teclado = new Scanner(System.in);
		// Amigo a= new Amigo(nombre, telefono, edad)
		System.out.print("Nombre: ");
		String nombre = teclado.nextLine();
		System.out.print("telefono: ");
		String telefono = teclado.nextLine();
		System.out.print("edad: ");
		int edad = teclado.nextInt();
		Amigo amigo;
		return new Amigo(nombre, telefono, edad);

	}

	public void visualiza(Amigo amigo) {
		System.out.println(amigo);
	}

	public static void main(String[] args) {
		Gestion gestion = new Gestion();
		gestion.menu();

	}

}