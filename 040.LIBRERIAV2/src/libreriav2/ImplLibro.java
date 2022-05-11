package libreriav2;

public class ImplLibro implements Libro{
	private Integer codigo;
	private String autor;
	private String titulo;
	private Integer numPaginas;
	private Integer NumCopiasVendidas;
	private Double precio;
	private boolean bestSeller;
	private TipoPrestamo tipoPrestamo;
	

	public ImplLibro(Integer codigo, String autor, String titulo, Integer numPaginas, Integer numCopiasVendidas,
			Double precio, boolean bestSeller, TipoPrestamo tipoPrestamo) {
		super();
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.numPaginas = numPaginas;
		NumCopiasVendidas = numCopiasVendidas;
		this.precio = precio;
		this.bestSeller = bestSeller;
		this.tipoPrestamo = tipoPrestamo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setNumPaginas(Integer numPaginas) {
		this.numPaginas = numPaginas;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public void setBestSeller(boolean bestSeller) {
		this.bestSeller = bestSeller;
	}

	@Override
	public int compareTo(Libro o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getCodigo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAutor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getNumPaginas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getNumCopiasVendidas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getPrecio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean getBestSeller() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoPrestamo getTipoPrestamo() {
		
		return null;
	}

	@Override
	public void setNumCopiasVendidas(Integer nc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTipoPrestamo(TipoPrestamo tp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "ImplLibro [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", numPaginas=" + numPaginas
				+ ", NumCopiasVendidas=" + NumCopiasVendidas + ", precio=" + precio + ", bestSeller=" + bestSeller
				+ ", tipoPrestamo=" + tipoPrestamo + "]";
	}
	

}
