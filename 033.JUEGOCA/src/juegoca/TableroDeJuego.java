package juegoca;

import java.util.ArrayList;

public class TableroDeJuego {
	static final int NC=64;
	private List<Casilla>recorrido;
	private List<Jugador>jugadores;
	private int turno;
	private int dado;
	private boolean finOca;
	
	public TableroDeJuego(List<Casilla> recorrido, List<Jugador> jugadores, int turno, int dado, boolean finOca) {
		super();
		recorrido = new ArrayList<>();
		jugadores = new ArrayList<>();
		this.turno = turno;
		this.dado = 0;
		this.finOca = false;
	}
	
	

}
