package ha_serializacion;

/* Tenemos que importar el interface Serializable del paquete java.io., para que el compilador la reconozca.  */
import java.io.Serializable;

/* La clase PersonaSerializable es básicamente igual a  la clase Persona vista en el ejemplo de la unidad 11, pero le cambiamos el
 * nombre para distinguirlas claramente. La única diferencia es que la clase PersonaSerializable se declara para qeu implemente (implements)
 * el interface Serializable. Eso nos va a permitir serializar los objetos de tipo PersonaSerializable. Como puedes comprobar, el hecho 
 * de implementar Serializable no nos obliga a definir ningún método adicional ni a modificar en nada el funcionamiento de la clase. Es
 * sólo una etiqueta para tener en cuenta por el compilador. 
 */

public class PersonaSerializable implements Serializable {

	/*
	 * La clase Persona define una nueva estructura de datos. Concretamente define qué va a ser para nosotros una Persona,
	 * indicando qué datos constituyen a una persona, y qué operaciones podremos hacer sobre una Persona concreta. Sobre cada
	 * Persona necesitamos almacenar su nombre, que será de tipo String, su edad, que será de tipo int , y su sexo, que será de
	 * tipo char y que podrá tomar los valores H para hombre, M para mujer y D para Desconocido. Al definir esos campos como
	 * privados, nos aseguramos que ninguna otra clase va a poder acceder a ellos para modificarlos directamente asignándoles
	 * valores que no sean correctos. Sólo podrán consultar su valor o modificarlos mediante los métodos públicos que se declaran
	 * en la clase Persona, y que comprobarán todas las condiciones necesarias para garantizar que los valores asignados son
	 * correctos. Así la única forma de modificar la edad de una Persona para cualquier clase que cree objetos de tipo Persona va
	 * a ser a través del método público ponEdad(), que se encarga de analizar si la edad a asignar es correcta o no mediante el
	 * método analizaEdad(). Si este método devuelve verdadero, es que la edad en cuestión es correcta, y se asigna. En caso
	 * contrario, se envía un mensaje indicando que no es correcta, y que no se ha modificado el campo edad.
	 */
	private String nombre;
	private int edad;
	private char sexo; // H hombre, M mujer, D desconocido

	/*
	 * Constructor básico. Crea una nueva persona, sin asignarle nombre, con la edad a cero, y sexo desconocido (D).
	 * Posteriormente habrá que asignarle valor a esos campos, mediante los métodos públicos de acceso y modificación de a los
	 * campos privados.
	 */
	public PersonaSerializable() {
		nombre = "";
		edad = 0;
		sexo = 'D';
	}

	/*
	 * Otro Constructor que permite crear objetos Persona directamente con un nombre, una edad, y un sexo. Como los parámetros
	 * locales se llaman igual que los campos de la clase, debemos usar la referencia this para distinguirlos. En el método cuando
	 * el compilador se encuentra un identificador, primero intenta buscar una declaración en el propio método (local). Como no la
	 * hay, intenta buscar algún parámetro local que se llame así, y si lo encuentra, lo asocia al identificador. Por eso es
	 * necesario distinguir de alguna forma el campo nombre del objeto que estamos creando, y que está definido en la clase, del
	 * parámetro nombre que recibe el método. La forma de distinguirlos es mediante la referencia this. La referencia this siempre
	 * apunta al objeto actual, que en este caso es el objeto que está creando el constructor. Por tanto, this.nombre es el campo
	 * nombre del objeto que estamos creando y this.nombre = nombre asigna al campo nombre del objeto que estamos creando el valor
	 * recibido a través del parámetro nombre del constructor. Algo similar ocurre para los demás parámetros. Si los parámetros se
	 * llamaran de forma distinta a los campos del objeto, no sería necesario usar this, pero nos obligaría a usar identificadores
	 * distintos para variables que conceptualmente representan lo mismo. Si el parámetro nombre se va a usar para darle valor al
	 * campo nombre, que se llamen igual ayuda a que sea evidente ese uso. Así los programas son claros sin necesidad de que
	 * estemos inventando montones de identificadores distintos, que luego tendremos que recordar para qué los usamos. Y programas
	 * más claros significa programas más fáciles de entender, modificar y mantener. Y programas más fáciles de mantener,
	 * significa mayor productividad por programador, y menor coste de desarrollo y mantenimiento, lo que se traduce en software
	 * más competitivo. Al final la pela es la pela.Además, este constructor también comprueba que los valores con los que se
	 * pretende crear la persona son correctos, y si no lo son, creará laPersona, pero con los valores por defecto.
	 */
	public PersonaSerializable(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		if (analizaEdad(edad))
			this.edad = edad;
		else {
			System.out.println("Edad no válida. No se ha modificado la edad de la persona. ");
			this.edad = 0;
		}
		if (analizaSexo(sexo))
			this.sexo = sexo;
		else {
			System.out.println("Sexo no válido. No se ha modificado el sexo de la persona. ");
			this.sexo = 'D';
		}
	}

	/* MÉTODOS PÚBLICOS DE ACCESO A LOS CAMPOS PRIVADOS DE LA CLASE */

	/*
	 * El método ponNombre() asigna como nombre del objeto que recibe el método el valor especificado por el parámetro nombre.
	 */
	public void ponNombre(String nombre) {
		this.nombre = nombre;
	}

	/*
	 * El método ponEdad() asigna como edad del objeto que recibe el método el valor espedificado por el parámetro edad, siempre y
	 * cuando ese valor cumpla con las condiciones establecidad para considerarse correcto. Esas condiciones se comprueban con una
	 * llamada al método analizaEdad(). Si no se cumplen las condiciones, el valor no se considera correcto, no se asigna al campo
	 * edad del objeto, y se envía un mensaje de error para indicarlo.
	 */

	public void ponEdad(int edad) {
		if (analizaEdad(edad))
			this.edad = edad;
		else
			System.out.println("Edad no válida. No se ha modificado la edad de la persona. ");
	}

	/*
	 * El método ponSexo() asigna como edad del objeto que recibe el método el valor especificado por el parámetro sexo, siempre y
	 * cuando sea uno de los valores correctos. De comprobarlo se encarga el método analizaSexo(), y si no es un valor correcto,
	 * no se asigna al campo sexo y se envía un mensaje de error para indicarlo.
	 */

	public void ponSexo(char sexo) {
		if (analizaSexo(sexo))
			this.sexo = sexo;
		else
			System.out.println("Sexo no válido. No se ha modificado el sexo de la persona. ");
	}

	/*
	 * El método obtenerNombre() sólo permite consultar desde otras clasesel valor del campo privado nombre del objeto que recibe
	 * el método, que es el valor que devuelve.
	 */
	public String obtenerNombre() {
		return nombre;
	}

	/*
	 * Permite consultar desde otras clases el valor del campo privado edad del objeto
	 */
	public int obtenerEdad() {
		return edad;
	}

	/* Permite consultar desde otras clases el valor del campo sexo del objeto */
	public char obtenerSexo() {
		return sexo;
	}

	/*
	 * Permite comprobar que la edad indicada como parámetro es válida, en cuyo caso devuelve verdadero (true) y falso (false) en
	 * caso contrario. Una edad se considera correcta siempre que sea mayor o igual que cero.
	 */
	public boolean analizaEdad(int edad) {
		boolean correcta = true;
		if (edad < 0) {
			correcta = false;
		}
		return correcta;
	}

	/*
	 * Permite comprobar que el sexo indicado como parámetro es válido, en cuyo caso devuelve verdadero (true) y falso (false) en
	 * caso contrario. Es sexo se considera correcto siempre que sea alguno de los caracteres 'M','H' o 'D'.
	 */
	public boolean analizaSexo(char sexo) {
		boolean correcto = true;
		if (sexo != 'D' && sexo != 'M' && sexo != 'H') {
			correcto = false;
		}
		return correcto;
	}

	/*
	 * El método toString() es recomendable definirlo en todas las clases. En caso de que no lo hagamos, lo heredará de la
	 * superclase Object, ya que en Java cualquier clase siempre es una subclase de Object. Pero el método genérico de Object es
	 * poco significativo. Tiene el propósito sólo de que los programas funcionen sin dar errores. Explicamos la utilidad del
	 * método toString y como funciona, para que lo entiendas mejor. Siempre que el compilador espere un String y en su lugar se
	 * encuentre cualquier otro tipo de objeto, antes de dar error, buscará la definicióndel método toString() en la clase del
	 * objeto. Este método lo que hace es devolver un String, que viene a ser como una "versión imprimible" de la información que
	 * contiene el objeto. Si lo encuentra, el compilador sustituye el objeto en cuestión por la cadena String que devuelve el
	 * método toString () para ese objeto. Pero si no lo encuentra, lo buscará en la superclase de la clase del objeto, y así
	 * sucesivamente hasta que en el peor de los casos llegue hasta la superclase Object, en la que seguro que lo va a encontrar.
	 * Lo que pasa es que la clase Object no puede tenerinformación muy detallada de los objetos genéricos que representa, por lo
	 * que se limita a devolver un String no muy significativo para el usuariode la aplicación, y que consiste en el nombre de la
	 * clase del objeto, seguido del carácter @ y de un número hexadecimal que representa el valorde la referencia del objeto.
	 * Algo ininteligible para la mayoría de nosotros, pero que permite que el programa funcione sin generar un error.
	 */

	public String toString() {
		String personaImprimible = "Nombre: " + nombre + " Edad: " + edad + " Sexo: " + sexo;
		return personaImprimible;
	}
}
