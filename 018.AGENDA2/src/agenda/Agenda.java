package agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	private ArrayList<Amigo> listaAmigos;

	// contructores
	public Agenda() {
		this.listaAmigos = new ArrayList<>();
	}
	// codificamos metodos

	public void alta(Amigo amigo) {
		this.listaAmigos.add(amigo);
	}

	public void alta(String nombre, String telefono, int edad) {
		// this.listaAmigos.add(new Amigo(nombre, telefono, edad));
		alta(new Amigo(nombre, telefono, edad));
	}

	public Amigo consulta(String nombreBusca) {
		boolean encontrado = false;
		int indice = 0;
		while (!encontrado && indice < this.listaAmigos.size()) {
			if (nombreBusca.equalsIgnoreCase(listaAmigos.get(indice).getNombre()))
				encontrado = true;
			else
				indice++;
		}
		return encontrado == true ? this.listaAmigos.get(indice) : null;
	}

	public boolean baja(String nombre) {
		Amigo a = consulta(nombre);
		return baja(a);
	}

	public boolean baja(Amigo amigo) {
		if (amigo != null) {
			this.listaAmigos.remove(amigo);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Agenda [listaAmigos=" + listaAmigos + "]";
	}
	
	

}