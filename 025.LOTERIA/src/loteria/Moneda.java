package loteria;

import java.util.Arrays;

public class Moneda extends Sorteo{
	
	public Moneda(int posibilidades, String[] array) {
		super(posibilidades);
	}

	@Override
	public String lanzar() {
		int caras=(int)(Math.random()*getPosibilidades());
		Ppt array[]=Ppt.values();
		return array[caras]
		
	}

	

	@Override
	public String toString() {
		return "Moneda [array=" + Arrays.toString(array) + ", lanzar()=" + lanzar() + "]";
	}

	@Override
	public String lanzar() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	

}
