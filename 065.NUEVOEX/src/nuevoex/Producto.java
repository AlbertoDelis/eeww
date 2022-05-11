package nuevoex;

public class Producto {
	private String descripcion;
	private Integer unidades;
	private Double precio;

	public Producto(String descripcion, Integer unidades, Double precio) throws ProductoException {
		super();
		this.descripcion = descripcion;
		setUnidades(unidades);
		setPrecio(precio);
	}

	public Integer getUnidades() {
		return unidades;
	}

	public void setUnidades(Integer unidades) throws ProductoException {
		if (unidades < 0)
			throw new ProductoException("Unidades menor que 0!!!");
		else
			this.unidades = unidades;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) throws ProductoException {
		if (precio < 0)
			throw new ProductoException("Precio menor que 0!!!");
		else
			this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public String toString() {
		return "Producto [descripcion=" + descripcion + ", unidades=" + unidades + ", precio=" + precio + "]";
	}

	public int compareTo(Producto prod) {
		int comp = -1;
		if (this.descripcion.equalsIgnoreCase(prod.descripcion)) {
			comp = 0;
			if (this.unidades > prod.unidades)
				comp = 1;
			else if (this.unidades == prod.unidades)
				comp = 0;
			else
				comp = -1;
		}
		return comp;
	}

}
