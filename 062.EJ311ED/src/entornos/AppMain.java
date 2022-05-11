package entornos;

public class AppMain {

	public static void main(String[] args) {

		/*
		 * La siguiente aplicación es un ejemplo de interfaz de formulario para
		 * introducir datos en un registro. Se basa en el control de una serie de
		 * condiciones de los valores de entrada. Como ejemplo, se ha implementado el
		 * metodo funcionGuardado() en la clase Guardado como ejemplo de lo que se
		 * enviaría para su registro.
		 *
		 * La aplicación debe de mostrar en la pantalla de textArea de la interfaz, los
		 * valores validas separados por ; en el caso de estar todos bien , o indidicar
		 * un listado con los codigos de errores producidos. Error 1: error en codigo de
		 * viajero. Error 2: error en nombre. Error 3: error en edad. Error 4: Destino
		 * no seleccionado.
		 *
		 * Los valores validos para cada campos son:
		 *
		 * Cod. Viajero: numero 6 dígitos, el primero de ellos debe ser un 1. Nombre:
		 * Cadena de 30 caracteres como máximo, que debe de empezar por letra. Edad:
		 * numero positivo de 2 digitos entre 10 y 99. Destino: a elegir entre
		 * "Talavera", "Toledo" y "Madrid".
		 *
		 */

		CheckCodViajero v = new CheckCodViajero();
		v.inicializa();

	}

}
