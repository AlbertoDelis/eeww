package fa_encuesta;

public class Exito implements Comparable<Exito> {
	private int numero;
	private String titulo;
	private int votos;

	public Exito(int numero, String titulo) {
		super();
		this.numero = numero;
		this.titulo = titulo;
		this.votos = 0;
	}
	public Exito(int numero, String titulo, int votos) {
		super();
		this.numero = numero;
		this.titulo = titulo;
		this.votos = votos;
	}

	public void incrementaVotos() {
		this.votos++;
	}

	public int getNumero() {
		return numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getVotos() {
		return votos;
	}

	@Override
	public String toString() {
		return "Exito [" + numero + ", " + titulo + ", " + votos + "]";
	}

	@Override
	public int compareTo(Exito o) {
		//return this.getNumero() - o.getNumero();
		if (this.numero > o.numero)
			return -1;
		else if (this.numero < o.numero)
			return 1;
		else
			return 0;
	}
}
