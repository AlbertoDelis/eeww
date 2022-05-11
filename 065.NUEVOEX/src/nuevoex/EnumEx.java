package nuevoex;

public class EnumEx {
	/*Una pequeña empresa necesita una aplicación que permita gestionar las compras que realizan.
El nombre de las clases, propiedades y métodos es el que se indica a continuación.

Codifica la clase Producto con las propiedades que se describe a continuación:
	
	descripción: cadena que describe el producto.
	unidades: unidades vendidas del producto.
	precio: precio del producto.

a) Codifica un constructor general con todas las propiedades pasadas como parámetro.
b) Valida las unidades y el precio usando setter. Informa del error lanzando una excepción de usuario.
c) Todas las propiedades son consultables y el precio y las unidades también son modificables.
d) Dos productos son iguales si coincides sus descripciones.
e) Dos productos se clasifican por orden natural atendiendo a la descripción y al número de unidades.

Codifica la clase Compra con las propiedades que se describe a continuación:

	identificador: número entero que identifica la compra. Se asignará automáticamente y serán números consecutivos.
	empresa: cadena que identifica a la empresa a la que se le realiza la compra.
	fecha: fecha de la compra.
	productos: estructura de datos que almacenará como máximo 20 productos. Elígela entre:
		- Una de tipo Collection, la que mejor se le adapte (Set o List) y
		- Una de tipo Map con clave descripción del producto y como valor un producto.

f) Codifica un constructor general con todas las propiedades pasadas como parámetro excepto el identificador, autoincrementado.
g) Codifica un constructor general con todas las propiedades pasadas como parámetro excepto productos,
 	que se creará vacía en el propio constructor, y el identificador que se asigna automáticamente, igual que antes.
h) Codifica el método anhadeProducto(…) para añadir un producto a la compra.
 	Se almacenará si hay capacidad y si no se arrojará la excepción de RuntimeException más adecuada. Si el producto ya está añadido:
	- No se podrá añadir el mismo producto más de una vez. No repetidos.
	- O bien suma las unidades vendidas.
i) Codifica el método contieneProducto(String descripcion) que retorne el producto buscado
 	o null si el producto no está contenido en la compra.
j) Codifica el método contieneProducto(Producto producto) que retorne true o false si el producto ya está contenido en la compra.
k) Codifica el método borrarProducto(…) que elimine un producto de la compra.
l) Codifica el método calcularPrecio(…) que retorne el precio total de la compra,
 	calculado a partir del precio de los productos de la compra.
m) Codifica el método masComprado( ) que retorna el producto más comprado.

Dada la clase:
	public class GestionCompras {
		private List<Compra> listaFacturas;
		public GestionCompras(){
			listaFacturas= new LinkedList<>();
		}
	}
n) Codifica el método ordenaComprasPorPrecio(…) para ordenar listaFacturas por el precio total de la compra de menor a mayor.
o) Codifica el método productoMasComprado(…) que retorne el producto del que más unidades se han comprado. Piénsalo detenidamente.
*/

}
