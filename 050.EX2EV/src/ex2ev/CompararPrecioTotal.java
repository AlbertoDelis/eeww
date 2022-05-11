package ex2ev;

import java.util.Comparator;

public class CompararPrecioTotal implements Comparator<Compra>{
	public int compare(Compra c1,Compra c2) {
		Double precio1=c1.getCalcularPrecio();
		Double precio2=c2.getCalcularPrecio();
		//return precio1.compareTo(precio2);
		double r=precio1-precio2;
		r=precio1.compareTo(precio2);
		if(r>0)
			return 1;
		if(r<0)
			return -1;
		return 0;
	}
}
