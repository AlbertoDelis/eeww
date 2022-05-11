package juegoca;

public class Main {

	public static void main(String[] args) {
		TableroDeJuego oca=null;
		while(true)
			try {
				oca=new TableroDeJuego(4);
				break;
				
			}catch (OcaExcepcion e) {
				e.printStackTrack();
			}
		while(!oca.getFinOca()) {
			oca.getTirada();
			for (Casilla casilla: oca.getRecorrido()) {
				System.out.println(casilla);
			}
		}

	}

}
