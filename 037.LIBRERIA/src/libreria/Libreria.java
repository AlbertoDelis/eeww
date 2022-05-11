package libreria;

import java.util.*;

public class Libreria implements Libro {
	private List<Libro>listaLibros;

	public Libreria() {
		super();
		this.listaLibros = new ArrayList<>();
	}

	@Override
	public int compareTo(Libro o) {
		
		return 0;
	}

	@Override
	public String getCodigo() {
		
		return null;
	}

	@Override
	public String getAutor() {
		
		return null;
	}

	@Override
	public String getTitulo() {
		
		return null;
	}

	@Override
	public Integer getNumPaginas() {
		
		return null;
	}

	@Override
	public Integer getNumCopiasVendidas() {
		
		return null;
	}

	@Override
	public Double getPrecio() {
		
		return null;
	}

	@Override
	public Boolean getBestSeller() {
		
		return null;
	}

	@Override
	public TipoPrestamo getTipoPrestamo() {
		
		return null;
	}

	@Override
	public void setNumCopiasVendidas(Integer nc) {
		
		
	}

	@Override
	public void setTipoPrestamo(TipoPrestamo tp) {
		
		
	}
	
	//1. Dado un valor real p devuelve cuántos libros tienen precio menor que p.
		public int getCuentaPrecio(double p) {
			int cuenta=0;
			for (Libro libro : listaLibros) {
				if(libro.getPrecio()<p)
					cuenta++;
			}
			return cuenta;
		}
	
	

}
