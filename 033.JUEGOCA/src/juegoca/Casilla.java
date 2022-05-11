package juegoca;

public class Casilla {
	public static int contador=0;
	private int id;
	private Tipo tipo;
	private Casilla salto;
	private int turnos;
	
	public Casilla(Tipo tipo, Casilla salto, int turnos) {
		super();
		this.id = contador++;
		this.setCasilla(tipo,salto,turnos);
	}
	
	public void setCasilla(Tipo tipo, Casilla salto,int turnos) {
		setTipo(tipo);
		setSalto(salto);
		setTurnos(turnos);
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Casilla.contador = contador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Casilla getSalto() {
		return salto;
	}

	public void setSalto(Casilla salto) {
		this.salto = salto;
	}

	public int getTurnos() {
		return turnos;
	}

	public void setTurnos(int turnos) {
		this.turnos = turnos;
	}

	@Override
	public String toString() {
		return "Casilla [id=" + id + ", tipo=" + tipo + ", salto=" + salto + ", turnos=" + turnos + "]";
	}

	
	
	
	
	

}
