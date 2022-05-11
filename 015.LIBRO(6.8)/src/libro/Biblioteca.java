package libro;

import java.util.ArrayList;

public class Biblioteca {

	public static void main(String[] args) {
		ArrayList<Libro> lista;
		lista=new ArrayList<>();
		Libro l, l1;
		l = new Libro("1984");
		//System.out.println(l);
		l1 = new Libro(l);
		//System.out.println(l1);
		lista.add(l);
		lista.add(l1);
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));	
		}
		for (Libro libro : lista) {
			System.out.println(libro);
			
		}
		
		System.out.println(lista.get(0));
		
		//ArrayList<String>lNombres=new ArrayList<String>();
		//lNombres.add("Alberto");
		//lNombres.add("Ana");
		

	}

}
