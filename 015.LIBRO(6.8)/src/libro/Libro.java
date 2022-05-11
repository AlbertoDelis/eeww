package libro;

import java.time.LocalDate;
import java.util.ArrayList;

public class Libro {
	private String titulo;
	private LocalDate fechaCompra;
	private int numero;
	private boolean prestado;

	public Libro(String titulo) {
		this.titulo = titulo;
		this.fechaCompra = LocalDate.now();
		this.numero = 1;
		this.prestado = false;
	}

	public Libro(Libro libro) {
		this.titulo = libro.titulo;
		this.fechaCompra = libro.fechaCompra;
		this.numero = libro.numero + 1;
		this.prestado = libro.prestado;
	}

	public boolean prestar() {
		if (!this.prestado) {
			this.prestado = true;
			return true;
		}
		return false;
	}

	public boolean devolver() {
		if (this.prestado) {
			this.prestado = false;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", fechaCompra=" + fechaCompra + ", numero=" + numero + ", prestado="
				+ prestado + "]";
	}

	
}
