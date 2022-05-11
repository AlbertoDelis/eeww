package libreria;

public interface Libro extends Comparable<Libro> {
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
	int compare(Libro l1, Libro l2);
}
