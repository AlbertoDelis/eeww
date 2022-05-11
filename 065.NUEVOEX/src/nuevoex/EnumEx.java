package nuevoex;

public class EnumEx {
	/*Una peque�a empresa necesita una aplicaci�n que permita gestionar las compras que realizan.
El nombre de las clases, propiedades y m�todos es el que se indica a continuaci�n.

Codifica la clase Producto con las propiedades que se describe a continuaci�n:
	
	descripci�n: cadena que describe el producto.
	unidades: unidades vendidas del producto.
	precio: precio del producto.

a) Codifica un constructor general con todas las propiedades pasadas como par�metro.
b) Valida las unidades y el precio usando setter. Informa del error lanzando una excepci�n de usuario.
c) Todas las propiedades son consultables y el precio y las unidades tambi�n son modificables.
d) Dos productos son iguales si coincides sus descripciones.
e) Dos productos se clasifican por orden natural atendiendo a la descripci�n y al n�mero de unidades.

Codifica la clase Compra con las propiedades que se describe a continuaci�n:

	identificador: n�mero entero que identifica la compra. Se asignar� autom�ticamente y ser�n n�meros consecutivos.
	empresa: cadena que identifica a la empresa a la que se le realiza la compra.
	fecha: fecha de la compra.
	productos: estructura de datos que almacenar� como m�ximo 20 productos. El�gela entre:
		- Una de tipo Collection, la que mejor se le adapte (Set o List) y
		- Una de tipo Map con clave descripci�n del producto y como valor un producto.

f) Codifica un constructor general con todas las propiedades pasadas como par�metro excepto el identificador, autoincrementado.
g) Codifica un constructor general con todas las propiedades pasadas como par�metro excepto productos,
 	que se crear� vac�a en el propio constructor, y el identificador que se asigna autom�ticamente, igual que antes.
h) Codifica el m�todo anhadeProducto(�) para a�adir un producto a la compra.
 	Se almacenar� si hay capacidad y si no se arrojar� la excepci�n de RuntimeException m�s adecuada. Si el producto ya est� a�adido:
	- No se podr� a�adir el mismo producto m�s de una vez. No repetidos.
	- O bien suma las unidades vendidas.
i) Codifica el m�todo contieneProducto(String descripcion) que retorne el producto buscado
 	o null si el producto no est� contenido en la compra.
j) Codifica el m�todo contieneProducto(Producto producto) que retorne true o false si el producto ya est� contenido en la compra.
k) Codifica el m�todo borrarProducto(�) que elimine un producto de la compra.
l) Codifica el m�todo calcularPrecio(�) que retorne el precio total de la compra,
 	calculado a partir del precio de los productos de la compra.
m) Codifica el m�todo masComprado( ) que retorna el producto m�s comprado.

Dada la clase:
	public class GestionCompras {
		private List<Compra> listaFacturas;
		public GestionCompras(){
			listaFacturas= new LinkedList<>();
		}
	}
n) Codifica el m�todo ordenaComprasPorPrecio(�) para ordenar listaFacturas por el precio total de la compra de menor a mayor.
o) Codifica el m�todo productoMasComprado(�) que retorne el producto del que m�s unidades se han comprado. Pi�nsalo detenidamente.
*/

}
