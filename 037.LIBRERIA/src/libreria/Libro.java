package libreria;

public interface Libro extends Comparable<Libro> {
	Integer []PENALIZACION= {10,13,20,25};
	Integer BESTSELLER=1000;
	String getCodigo();
	String getAutor();
	String getTitulo();
	Integer getNumPaginas();
	Integer getNumCopiasVendidas();
	Double getPrecio();
	Boolean getBestSeller();
	TipoPrestamo getTipoPrestamo();
	void setNumCopiasVendidas(Integer nc);
	void setTipoPrestamo(TipoPrestamo tp);
	
}


