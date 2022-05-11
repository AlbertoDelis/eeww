package list;

import java.sql.Array;
import java.util.*;

public class ListaValores {
	private ArrayList<Integer>lista;
	
	
	
	public ListaValores() {
		this.lista = new ArrayList<Integer>();
	}
	
	public ListaValores(int in, int fin) {
		this();
		int num;
		for (int i = 0; i <100; i++) {
			int x=(int)(Math.random()*101);
			num=(int)(Math.random()*(fin-in)+in);
			this.lista.add(num);
		}
	}

	public ArrayList<Integer> getLista() {
		return lista;
	}
	
	public void getAnadeElem(Integer num) {
		lista.add(num);
	}
	
	public void getUnion(ListaValores listaValores) {
		lista.addAll(listaValores.lista);
		
	}
	
	public ArrayList<Integer> getOrdenar() {
		this.lista.sort(null);
		return lista;
	}
	
	public ArrayList<Integer> getOrdenarMayor(){
		 Collections.sort(this.lista, Collections.reverseOrder());
		 return lista;
	}
	
	public int getContador(int valor) {
		int cont=0;
		for (Integer integer : lista) {
			if (integer==valor) {
				cont++;
			}
			
		}
		return cont;
	}
	
	public boolean getCuenta(int valor) {
		boolean mayores=true;
		for (Integer integer : lista) {
			if (integer<valor) {
				mayores=false;
			}
			
		}
		return mayores;
	}
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	

}
