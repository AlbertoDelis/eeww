package bicho;

public class TestBicho {

	public static void main(String[] args) {
		Bicho bi = new Bicho();
		BichoDormilon bd = new BichoDormilon();
		System.out.println("bi -> hambre: " + bi.hambre);
		System.out.println("bd -> hambre: " + bd.hambre);
		System.out.println("bd -> sueño: " + bd.sueño);
		System.out.println("bd -> peso: " + bd.getPeso());

	}

}
