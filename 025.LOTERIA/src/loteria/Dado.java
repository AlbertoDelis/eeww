package loteria;

public class Dado extends Sorteo{

	public Dado(int posibilidades, String numero) {
		super(posibilidades);
	}

	
	@Override
	public String Lanzar() {
		int caras=(int)(Math.random()*getPosibilidades()+1);
		return String.format("%d", caras);	
	}

}
