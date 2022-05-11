package ex2ev;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Compra implements CompararPrecioTotal {
	private static Integer contador = 0;
	private Integer identificador;
	private String empresa;
	private Fecha fecha;
	private Set<Producto> listaProducto;// array 20 pos

	// f) Codifica un constructor general con todas las propiedades pasadas como
	// parámetro
	// excepto el indentificador, autoincrementado.
	public Compra(String empresa, Fecha fecha, Set<Producto> listaProducto) {
		super();
		this.identificador = contador++;
		this.empresa = empresa;
		this.fecha = fecha;
		this.listaProducto = listaProducto;
	}

	// g) Codifica un constructor general con todas las propiedades pasadas como
	// parámetro excepto productos,
	// que se creará vacía en el propio constructor, y el identificador que se
	// asigna
	// automáticamente, igual que antes.
	public Compra(String empresa, Fecha fecha) {
		this(empresa, fecha, new HashSet<Producto>());
	}

	public static Integer getContador() {
		return contador;
	}

	public static void setContador(Integer contador) {
		Compra.contador = contador;
	}

	public Integer getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public String getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Fecha getFecha() {
		return this.fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	// h) Codifica el método anhadeProducto(...) para añadir un producto a la
	// compra. Se almacenará si hay
	// capacidad y si no se arroja la excepción de RuntimeException más adecuada. Si
	// el producto ya
	// esta añadido:
	// -No se podrá añadir el mismo producto más de una vez. No repetidos.
	// -O bien suma las unidades vendidas.
	public void getAnhadeProducto(Producto p) throws IllegalArgumentException {
		if (listaProducto.size() >= 20) {
			p.setUnidades(p.getUnidades() + 1);
			throw new IllegalArgumentException("Conjunto lleno. No se puede añadir!!!");
		} else {
			listaProducto.add(p);
		}
	}

	// i) Codifica el método contieneProducto(String descripcion) que retorne el
	// producto buscado
	// o null si el producto no está contenido en la compra.
	public Producto getContieneProducto(String des) {
		for (Producto producto : listaProducto)
			if (producto.getDescripcion().equalsIgnoreCase(des))
				return producto;
		return null;
	}

	// j) Codifica el método contieneProducto(Producto producto) que retorne true o
	// false
	// si el producto ya está contenido en la compra.
	public Boolean getContieneProducto(Producto producto) {
		return this.listaProducto.contains(producto);
	}

	@Override
	public int hashCode() {
		return Objects.hash(identificador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compra other = (Compra) obj;
		return Objects.equals(identificador, other.identificador);
	}
	//l) Codifica el método calcularPrecio(…) que retorne el precio total de la compra, calculado a partir del precio de los productos de la compra.

	public double getCalcularPrecio() {
		double precioTotal = 0;
		for (Producto producto : listaProducto) {
			precioTotal += producto.getPrecio() * producto.getUnidades();
		}
		return precioTotal;
	}

	// k) Codifica el método borrarProducto(…) que elimine un producto de la compra.
	public void getborrarProducto(Producto p) {
		listaProducto.remove(p);
	}
	//m) Codifica el método masComprado( ) que retorna el producto más comprado.
	public Producto getMasComprado() throws ProductoException {
		/*
		 * Producto mas= new Producto("", 0, 0); for (Producto producto : listaProducto)
		 * { if(mas.getUnidades()<producto.getUnidades()) { mas=producto; } } return
		 * mas;
		 */

		return Collections.max(listaProducto); // revisar
		//System.out.println(listaProducto);
		
	}

}
