package libreriav2;

public interface Libro extends Comparable<Libro>{
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


