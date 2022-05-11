package ejdaw11;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) throws NumeroException {
		ArrayList<Elemento> elementos= new ArrayList<Elemento>();
		HashMap<Integer, ArrayList<Elemento>> mapaElementos=new HashMap<>();
		
		Elemento o = new Elemento(1,"H","Hidrógeno",1,1,1766);
		Elemento o2 = new Elemento(2,"He","Helio",18,1,1895);
		Elemento o3 = new Elemento(3,"Li","Litio",1,2,1817);
		Elemento o4 = new Elemento(4,"Be","Berilio",2,2,1797);
		Elemento o5 = new Elemento(5,"B","Boro",13,2,1808);
		Elemento o6 = new Elemento(6,"C","Carbono",14,2,0);
		Elemento o7 = new Elemento(7,"N","Nitrógeno",15,2,1777);
		Elemento o8 = new Elemento(8,"O","Oxígeno",16,2,1774);
		
		elementos.add(o);
		System.out.println(o);
		elementos.add(o2);
		System.out.println(o2);
		elementos.add(o3);
		System.out.println(o3);
		elementos.add(o4);
		System.out.println(o4);
		elementos.add(o5);
		System.out.println(o5);
		elementos.add(o6);
		System.out.println(o6);
		elementos.add(o7);
		System.out.println(o7);
		elementos.add(o8);
		System.out.println(o8);
		
		mapaElementos.put(1, elementos);
		mapaElementos.put(2, elementos);
		mapaElementos.put(3, elementos);
		mapaElementos.put(4, elementos);
		mapaElementos.put(5, elementos);
		mapaElementos.put(6, elementos);
		mapaElementos.put(7, elementos);
		mapaElementos.put(8, elementos);
		
		System.out.println();
		System.out.println(elementos);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		System.out.println(mapaElementos);
		System.out.println(mapaElementos.size());

	}

}
