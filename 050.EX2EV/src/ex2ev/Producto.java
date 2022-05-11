package ex2ev;

public class Producto implements Comparable<Producto> {
	private String descripcion;
	private Integer unidades;
	private Double precio;

	// a) Codifica un constructor general con todas las propiedades pasadas como
	// parámetro.
	// b) Valida las unidades y el precio usando setter. Informa del error lanzando
	// una excepción de usuario.
	public Producto(String descripcion, Integer unidades, Double precio) throws ProductoException {
		this.descripcion = descripcion;
		this.setUnidades(unidades);
		this.setPrecio(precio);
	}

	// c)Todas las propiedades son consultables y el precio y las unidades también
	// son modificables.
	public Integer getUnidades() {
		return unidades;
	}

	public void setUnidades(Integer unidades) throws ProductoException {
		if (unidades < 0)
			throw new ProductoException();
		else
			this.unidades = unidades;
	}

	public Double getPrecio() throws ProductoException {
		if (precio < 0)
			throw new ProductoException();
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	// d) 2 productos son = si coinciden sus descripciones.
	/*
	 * public boolean getIguales(Producto p) {
	 * if(this.descripcion==p.getDescripcion()) return true; return false; }
	 */
	

	// e) 2 productos se clasifican por orden natural atendiendo a la descripción y
	// al número de unidades.
	@Override
	public int compareTo(Producto p) {
		int estado = -1;
		if (this.descripcion.equalsIgnoreCase(p.getDescripcion())) {
			estado = 0;
			if (this.unidades < p.unidades) {
				estado = 1;
			} else if (this.unidades > p.unidades) {
				estado = -1;
			} else {
				estado = 0;
			}
		}
		return estado;
	}

}
