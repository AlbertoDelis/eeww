package fc_encuesta;

import java.io.Serializable;

public class Exito implements Comparable<Exito>, Serializable {
	private int numero;
	private String titulo;
	private Fecha publicacion;
	private int votos;

	public Exito(int numero, String titulo, Fecha f) {
		super();
		this.numero = numero;
		this.titulo = titulo;
		this.publicacion= f;
		this.votos = 0;
	}
	public Exito(int numero, String titulo, Fecha f, int votos) {
		super();
		this.numero = numero;
		this.titulo = titulo;
		this.publicacion= f;
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
		return "Exito [" + numero + ", " + titulo + ", " + votos + ", " + publicacion + "]";
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
