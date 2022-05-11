package list;

import java.util.*;

public class TestList {

	public static void main(String[] args) {
		ListaValores lista=new ListaValores(1000, 2000);
		lista.getUnion(lista);
		System.out.println(lista.getLista());
		System.out.println(lista.getOrdenar());
		System.out.println(lista.getOrdenarMayor());
		System.out.println(lista.getContador(1983));
		System.out.println(lista.getCuenta(90));

	}

}
