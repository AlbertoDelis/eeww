package ha_serializacion;

import java.io.*;

/* Básicamente vamos a modificar la clase VectorPersonas, de forma que lo único que vamos a hacer es llenarlo introduciendo datos para algunas personas.
 * La primera opción disponible en el menú del programa será  introducir personas.
 * Otra opción será guardar las que se han dado de alta en un fichero. 
 * Otra opción nos permitirá cargar el vector con las Personas que habíamos guardado antes en un fichero.
 * Otra opción será borrar una persona del vector.
 * Por último tendremos una opción que consistirá en mostrar las personas introducidas en el vector.
 * El vector se va a dimensionarpara almacenar 50 personas. Mantendremos siempre una variable totalPersonas que contendrá el total de Personas que 
 * contiene el número real de personas que se han introducido en el vector.  
 * El ejemplo está deliberadamente simplificado, ya que sólo se trata de poder comprobar cómo se realizan las operaciones de lectura y escritura 
 * en ficheros usando serialización. 
 *
 * En este ejemplo comento principalmente el código relativo al uso de Serialización. El resto, es bastante similar a otros ejemplos, y a estas alturas
 * debe resultar más o menos comprensible para todos. 
 */

public class VectorPersonasSerializable {
	private static int totalPersonas = 0;

	private static PersonaSerializable[] personas = new PersonaSerializable[50];

	public static void main(String[] args) {
		int opcion;
		do {
			System.out.println();
			System.out.println("==================== MENÚ PRINCIPAL DE GESTIÓN DEL VECTOR DE 50 PERSONAS ====================");
			System.out.println("               ===============================================================");
			System.out.println(" [1] --> Dar de alta una nueva persona en el vector. ");
			System.out.println(" [2] --> Dar de baja una persona del vector. ");
			System.out.println(" [3] --> Listado de personas que contiene el vector. ");
			System.out.println(" [4] --> Guardar el vector de personas en el fichero C:/PruebasJava/vectorpersonas.dat. ");
			System.out.println(" [5] --> Cargar las personas en el vector desde el fichero C:/PruebasJava/vectorpersonas.dat. ");
			System.out.println(" [6] --> Salir y terminar el programa. ");

			opcion = ES.leeNº("Elije una opción del menú: ", 1, 6);
			System.out.println();

			switch (opcion) {
			case 1:
				anadirNuevaPersona();
				break;
			case 2:
				eliminarPersona();
				break;
			case 3:
				listado();
				break;
			case 4:
				guardar();
				break;
			case 5:
				cargar();
				break;
			case 6:
				System.out.println("Terminando el programa...");
				System.out.println("Programa Finalizado");
				break;
			}
		} while (opcion != 6);
	}

	public static void anadirNuevaPersona() {
		String nombre, cadena;
		int edad;
		char sexo;

		if (totalPersonas < personas.length) {
			nombre = ES.leeDeTeclado("Introduce el nombre de la persona :");
			nombre = nombre.toUpperCase();
			edad = ES.leeNº("Introduce la edad de la persona :", 0);
			boolean correcto = false;
			do {
				cadena = ES.leeDeTeclado("Introduce el Sexo de la persona :(H:hombre M:Mujer D:Desconocido)");
				if (cadena.length() != 1) {
					System.out.println("El sexo se indica con una letra.--> H:hombre, M:mujer, D:desconocido");
				} else
					switch (cadena.charAt(0)) {
					case 'H':
					case 'h':
					case 'M':
					case 'm':
					case 'D':
					case 'd':
						correcto = true;
						break;
					default:
						correcto = false;
						System.out.println("Letra no válida para el sexo. Son válidas H:hombre, M:mujer, D:desconocido");
					}
			} while (cadena.length() != 1 || !correcto);
			cadena = cadena.toUpperCase();
			sexo = cadena.charAt(0);
			/*
			 * totalPersonas siempre tiene el valor de la primera posición libre dentro del vector, y no tenemos más que guardar
			 * en ella la nueva persona que creamos con los datos que acabamos de leer.
			 */
			personas[totalPersonas] = new PersonaSerializable(nombre, edad, sexo);
			/* Tomamos nota de que hay una persona más en el vector */
			totalPersonas++;
		} else {
			System.out.println("El vector está lleno. No se pueden dar de alta más personas por el momento.");
		}

	}

	public static void eliminarPersona() {
		String nombreABuscar = ES.leeDeTeclado("¿Cómo se llama la persona que hay que dar de baja?");
		int posicion = buscarPersona(nombreABuscar, personas);
		if (posicion == personas.length) {
			System.out.println("No hay ninguna persona llamada " + nombreABuscar + " en el vector. No se dio de baja a nadie.");
		} else {
			/*
			 * Desplazamos todas las personas por encima de la eliminada una posición hacia abajo, para mantener todos los huecos
			 * juntos al final del vector
			 */
			for (int i = posicion; i <= personas.length - 2; i++) {
				personas[i] = personas[i + 1];
			}
			/*
			 * Nos aseguramos de que la última posición apunta a null, para asegurar que se ha borrado una persona.
			 */
			personas[personas.length - 1] = null;
			/*
			 * Tomamos nota de que hay una persona menos en el vector. Así, totalPersonas sigue guardando la primera posición
			 * libre.
			 */
			totalPersonas--;
			System.out.println("Se ha borado la persona llamada " + nombreABuscar);
		}

	}

	public static void listado() {
		System.out.println("LISTADO DE LAS " + totalPersonas + " PERSONAS DEL VECTOR. ");
		for (int i = 0; i < personas.length && personas[i] != null; i++) {
			System.out.println(personas[i]);
		}

	}

	public static void guardar() {
		if (totalPersonas > 0) {
			try {
				/*
				 * Declaramos un flujo de salida de tipo ObjectOutputStream sobre un flujo de salida FileOutputStream, que conecta
				 * con el fichero vectorpersonas.dat de la carpeta PruebasJava del directorio raíz de la unidad C: Como en otros
				 * flujos, podría haberse creado el objeto File de forma explícita en una sentencia, sobre él crear el flujo
				 * FileOutputStream en otra sentencia, y por último usar otra tercera sentencia para crear el flujo
				 * ObjectOutputStream sobre el FiliOutputStream. Recuerda que FileOutputStream define el destino de los datos, que
				 * va a ser un fichero, y que ObjectOutputStream modifica la manera de trabajar con el flujo, permitiendo la
				 * escritura de objetos.
				 */
				ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream(
						"C:\\PruebasJava\\vectorpersonas.dat"));
				/*
				 * Escribimos en el flujo la variable entera totalPersonas usando el método writeInt(), ya que cuando carguemos el
				 * vector con los datos del fichero, necesitamos saber su valor, ya que nos va a decir cual es la primera posición
				 * libre del vector, que es algo que necesitamos saber, ya que el método de añadir personas al vector guarda a la
				 * nueva persona directamente en la posición que indique esa variable.
				 */

				flujoSalida.writeInt(totalPersonas);

				/*
				 * Recorremos todas las posiciones del vector donde realmente hay guardada alguna persona, y las vamos escribiendo
				 * una a una en el flujo usando el método writeObject(), que nos permite escirbir todo el objeto, tal cual.
				 */
				for (int i = 0; i < totalPersonas; i++) {
					flujoSalida.writeObject(personas[i]);
				}
				System.out.println("Datos guardados correctamente en el fichero");
				/*
				 * Capturamos las dos excepciones siguientes, que el fichero no se haya encontrado, o un error genérico de E/S
				 */
				// }catch (FileNotFoundException fnfe){
				// System.out.println("El fichero no existe");
			} catch (IOException ioe) {
				System.out.println("Error al intentar guardar los datos en el fichero");

			}
		} else {
			System.out.println("No hay ninguna persona en el vector. No se guardó nada");
		}
	}

	public static void cargar() {
		/*
		 * Declaramos el flujo ObjectOutputStream como flujo de entrada para leer del mismo fichero en que se guardaron los datos
		 * en el método guardar(). Si el fichero no existe, se captura la excepción, que lo indica.También hay que capturar la
		 * excepción ClassNotFoundException. Al leer los objetos del flujo, realmente leemos una serie de bytes, a partir de los
		 * que debe reconstruirse el objeto. Necesitamos disponer de la información sobre el objeto que tenemos que
		 * reconstruir(los "planos" del objeto podríamos decir) y esa información nos la proporciona la clase del objeto. Por eso
		 * la clase debe estar accesible, y por eso a la serie de bytes que leemos del flujo hay que aplicarle un casting
		 * explícito para convertirlos en los objetos deseados.
		 */
		try {
			ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("C:\\PruebasJava\\vectorpersonas.dat"));
			/*
			 * Leemos los datos en el mismo orden que los habíamos guardado. El método readInt() nos permite leer el valor entero
			 * que habíamos guardado antes, y que es el valor de totalPersonas. Antes de asignarle ese valor, tenemos que
			 * convertirlo en un dato de tipo entero, por eso aplicamos el casting explícito (int)
			 */
			totalPersonas = (int) flujoEntrada.readInt();
			/*
			 * Como ya hemos leído cuantas personas tiene el vector que se guardó en el fichero, hacemos un bucle for para leer
			 * del flujo exactamente ese número de personas, usando el método readObject() para leer directamente objetos del
			 * flujo. Cada persona leída del fichero se va guardando en una posición del vector, que queda reconstruido.
			 * Evidentemente, también tenemos que aplicar el castin explícito (PersonaSerializable)
			 */

			for (int i = 0; i < totalPersonas; i++) {
				personas[i] = (PersonaSerializable) flujoEntrada.readObject();
			}
			System.out.println("Datos leídos desde el fichero y cargados correctamente en el vector");

			/*
			 * Capturamos tres excepciones: que no podamos encontrar la clase para hacer el casting, que no exista el fichero del
			 * que tenemos que leer los datos y cualquier otro error genérico de E/S.
			 */
		} catch (ClassNotFoundException cnfe) {
			System.out.println("No se pudo acceder a la clase PersonasSerializable para completar la operación");
		} catch (FileNotFoundException fnfe) {
			System.out.println("El fichero no existe");
		} catch (IOException ioe) {
			System.out.println("Error al intentar cargar los datos del fichero");

		}

		/*
		 * Nos aseguramos de borrar cualquier otra persona que hubiera en el vector en las posiciones siguientes a las leídas
		 * desde el fichero
		 */
		for (int i = totalPersonas; i < personas.length; i++) {
			personas[i] = null;
		}
	}

	public static int buscarPersona(String nombreABuscar, PersonaSerializable[] vector) {
		int i = 0;
		while (i < vector.length && vector[i] != null && !vector[i].obtenerNombre().equalsIgnoreCase(nombreABuscar)) {
			i++;
		}
		/*
		 * Tanto si hemos alcanzado el final del fichero sin encontrarlo, como si hemos encontrado un hueco sin encontrarlo,
		 * devolvemos una posición fuera del array para indicarlo. En caso contrario, se devolverá la posición en la que se
		 * encontró la primera persona con ese nombre.
		 */
		if (vector[i] == null) {
			i = vector.length;
		}

		return i;
	}
}
