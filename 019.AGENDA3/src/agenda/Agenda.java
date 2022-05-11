package agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	private ArrayList<Amigo> listaAmigos;
	
	public Agenda() {
		this.listaAmigos= new ArrayList<>();
	}
	public void alta(Amigo amigo) {
		this.listaAmigos.add(amigo);
	}
	public void alta(String nombre, String tlf, int edad) {
		Amigo amigo= new Amigo(nombre, tlf, edad);
		this.listaAmigos.add(amigo);
		//alta(new Amigo(nombre, tlf, edad))
	}

	public Amigo consulta(String nombreBusca) {
		boolean encontrado = false;
		int indice= 0;
		indice= 0;
		while(!encontrado && indice < this.listaAmigos.size()) {
			if(nombreBusca.equalsIgnoreCase(listaAmigos.get(indice).getNombre()))
				encontrado = true;//return indice;
			else
				indice++;
		}
		return encontrado == true ? this.listaAmigos.get(indice) : null;
	}
	
	public boolean baja(String nombre, String tlf, int edad) {
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
	public void contactos() {
		for (int i = 0; i < listaAmigos.size(); i++) {
			System.out.println(listaAmigos.get(i));
		}
	}
	
	@Override
	public String toString() {
		return "Agenda [listaAmigos=" + listaAmigos + "]";
	}
	public void visualiza(int indice) {
		System.out.println(this.listaAmigos.get(indice));	
	}
}