package ex2ev;

import java.util.Comparator;

public class ComparadorUnidades implements Comparator<Producto>{

	@Override
	public int compare(Producto o1, Producto o2) {
		int r=o1.getUnidades().compareTo(o2.getUnidades());
		if(r==0)
			r=o1.compareTo(o2);
		return r;
	}
	

}
