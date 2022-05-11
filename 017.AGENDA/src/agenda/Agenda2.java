package agenda;

import java.util.*;

public class Agenda2 {
	private ArrayList<Amigo> listaAmigos;

	public Agenda2() {
		this.listaAmigos = new ArrayList<>();
	}

	public void alta(Amigo amigo) {
		this.listaAmigos.add(amigo);
	}

	public void alta(String nombre, String tlf, int edad) {
		alta(new Amigo(nombre, tlf, edad));
	}

	public void alta() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("NOMBRE: ");
		String nombre = teclado.nextLine();
		System.out.print("Tlf: ");
		String tlf = teclado.nextLine();
		System.out.print("EDAD: ");
		int edad = teclado.nextInt();
		Amigo amigo = new Amigo(nombre, tlf, edad);
		alta(amigo);
	}
	
	public void visualiza(int indice) {
		System.out.println(this.listaAmigos.get(indice));
	}
	
	public void visualiza(Amigo amigo) {
		System.out.println(this.listaAmigos.get(0));
	}

	public Amigo consulta(String nombreBusca) {
		boolean encontrado = false;
		int indice = 0;
		while (!encontrado && indice < this.listaAmigos.size()) {
			if (nombreBusca.equalsIgnoreCase(listaAmigos.get(indice).getNombre()))
				encontrado = true; // return indice;
			else
				indice++;
		}
		return encontrado == true ? this.listaAmigos.get(indice) : null;
	}

}
