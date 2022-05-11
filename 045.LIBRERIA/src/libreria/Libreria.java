package libreria;

import java.sql.Array;
import java.util.*;

public class Libreria implements Libro {
	private String codigo;
	private String autor;
	private String titulo;
	private Integer numPaginas;
	private Integer numCopiasVendidas;
	private Double precio;
	private Boolean bestSeller;
	private TipoPrestamo tipoPrestamo;
	private ArrayList<Libro> listaLibros;

	public Libreria(String codigo, String autor, String titulo, Integer numPaginas, Integer numCopiasVendidas,
			Double precio, Boolean bestSeller, TipoPrestamo tipoPrestamo) {
		super();
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.numPaginas = numPaginas;
		this.numCopiasVendidas = numCopiasVendidas;
		this.precio = precio;
		this.bestSeller = bestSeller;
		this.tipoPrestamo = tipoPrestamo;
		this.listaLibros = new ArrayList<Libro>();
	}
	/*
	 * public ArrayList<Libro> getListaLibros() { return listaLibros; }
	 */

	public String getCodigo() {
		return this.codigo;
	}

	public String getAutor() {
		return this.autor;

	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getNumPaginas() {
		return numPaginas;
	}

	public Integer getNumCopiasVendidas() {
		return numCopiasVendidas;
	}

	public Double getPrecio() {
		return precio;
	}

	public Boolean getBestSeller() {
		return bestSeller;
	}

	public TipoPrestamo getTipoPrestamo() {
		return tipoPrestamo;
	}

	public void setNumCopiasVendidas(Integer nc) {
		this.numCopiasVendidas = nc;
	}

	public void setTipoPrestamo(TipoPrestamo tp) {
		this.tipoPrestamo = tp;
	}

	// 1. Dado un valor real p devuelve cuántos libros tienen precio menor que p.
	public int getCantidadLibros(int p) {
		int cont = 0;
		for (Libro libro : listaLibros) {
			if (libro.getPrecio() < p) {
				cont++;
			}

		}
		return cont;
	}

	// 2. Dada una cadena de caracteres s devuelve cuántos libros contienen en su
	// título la palabra s.

	public int getPalabra(String s) {
		int cont = 0;
		for (Libro libro : listaLibros) {
			if (libro.getTitulo().contains(s)) {
				cont++;
			}
		}
		return cont;
	}

	// 3. Dado un tipo de préstamo devuelve si hay algún libro con ese tipo de
	// préstamo.

	public ArrayList<Libro> setTipoPrestado(TipoPrestamo tp) {
		ArrayList<Libro> listaAux = new ArrayList<Libro>();
		for (Libro libro : listaLibros) {
			if (libro.getTipoPrestamo() == tp) {
				listaAux.add(libro);
			}
		}
		return listaAux;
	}

	// 4. Devuelve la suma de los precios de los libros que son best sellers

	public double getSumaPrecios() {
		double cont = 0;
		for (Libro libro : listaLibros) {
			if (libro.getBestSeller()) {
				cont += libro.getPrecio();
			}
		}
		return cont;
	}

	// 5. Dado un autor devuelve la suma de las copias vendidas de libros de ese
	// autor.

	public int getLibrosAutor(String nombre) {
		int cont = 0;
		for (Libro libro : listaLibros) {
			if (libro.getAutor() == nombre) {
				cont += libro.getNumCopiasVendidas();
			}
		}
		return cont;
	}

	// 6. Dado un autor devuelve si todos los libros de ese autor son bestsellers.

	public boolean getTipoLibros(String nombre) {
		for (Libro libro : listaLibros) {
			if (libro.getAutor().equals(nombre)) {
				if (!libro.getBestSeller())
					return false;
			}
		}
		return true;
	}
	// 7. Dado un autor devuelve la recaudación obtenida por la venta de todos sus
	// libros

	public double getRecaudacion(String nombre) {
		double cont = 0;
		for (Libro libro : listaLibros) {
			if (libro.getAutor().equals(nombre)) {
				cont += libro.getPrecio();
			}
		}
		return cont;
	}

	// 8.Dado un entero n incrementa en esa cantidad el número de copias vendidas de
	// todos los libros que son bestsellers.

	public void getContadorBestSeller(Integer nc) {
		for (Libro libro : listaLibros) {
			if (libro.getBestSeller())
				libro.setNumCopiasVendidas(nc + libro.getNumCopiasVendidas());
		}
	}

	// 9. Devuelve el libro de más páginas.

	public Libro getMasPaginas() {
		int max=0;
		Libro libroAux=null;
		if (this.listaLibros.isEmpty()) {
			return null;
		} else {
			max=this.listaLibros.get(0).getNumPaginas();
			for (Libro libro : listaLibros) {
				if(libro.getNumPaginas()>max) {
					max=libro.getNumPaginas();
				}
			}	
		}
		for (Libro libro : listaLibros) {
			if(max==libro.getNumPaginas()) {
				libroAux=libro;
			}
		}
		return libroAux;
	}
	
	// 10. Devuelve el libro de menos precio.
	
	
	
	
	// Ordenar el ArrayList por atributo número de páginas y coger primer elemento.
	
	

	@Override
	public String toString() {
		return "Libreria [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", numPaginas=" + numPaginas
				+ ", numCopiasVendidas=" + numCopiasVendidas + ", precio=" + precio + ", bestSeller=" + bestSeller
				+ ", tipoPrestamo=" + tipoPrestamo + "]";
	}

	@Override
	public int compareTo(Libro o) {
		return 0;
	}

	@Override
	public int compare(Libro l1, Libro l2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
