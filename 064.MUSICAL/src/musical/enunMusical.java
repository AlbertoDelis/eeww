package musical;

public class enunMusical {
	/*
		Una compañía organiza una encuesta para determinar el éxito de sus productos musicales. 
		La población encuestada se va a dividir en cuatro categorías según sexo y edad (por ejemplo menores o iguales a veinte años y mayores de veinte años). 
		A cada persona se le pide que dé el número de cinco éxitos según su orden de preferencia. Los éxitos se identifican por los números de 1 a N. 
		Los resultados se almacenan en un fichero, donde cada elemento del fichero representa a un encuestado que incluye los datos de su nombre y apellidos, 
		además de los mencionados anteriormente. Se pide:
		* Codifica una clase Persona con los atributos del enunciado.
		* Codifica una clase para acceder al fichero de personas: método para crear fichero, métodos para leer y grabar personas, ...
		* Crea el archivo con los datos de las encuestas.
		* Codifica una clase Álbum musical con, al menos, las siguientes propiedades privadas: número, título y votos obtenidos.
		* Codifica una clase para acceder a los datos de los álbumes almacenados en disco o en un array.
		* Listar los éxitos en orden de popularidad. Para cada uno se lista el número del éxito y el número de veces que ha sido mencionado.
		* Obtener cuatro archivos de texto con las listas de los nombres y apellidos de todos los encuestados, según su categoría, 
		que habían mencionado en primer lugar uno de los tres éxitos más populares.
			Para que todos trabajemos con el mismo archivo

		public void crea(){
		// Debería introducirse porteclado
		Persona[] encuestado = {
		new Persona(1, "Uno", 18, 'H', new int[] { 5, 2, 3 }),
		new Persona(3, "Dos", 18, 'M', new int[] { 3, 4, 5 }),
		new Persona(5, "Tres", 19, 'H', new int[] { 5, 6, 7 }),
		new Persona(7, "Cuatro", 19, 'M', new int[] { 7, 8, 9 }),
		new Persona(9, "Cinco", 20, 'M', new int[] { 1, 2, 3 }),
		new Persona(11, "Seis", 20, 'H', new int[] { 3, 4, 5 }),
		new Persona(14, "Siete", 21, 'M', new int[] { 5, 6, 7 }),
		new Persona(16, "Ocho", 21, 'M', new int[] { 7, 8, 9 }),
		new Persona(18, "Nueve", 18, 'H', new int[] { 3, 4, 5 }),
		new Persona(20, "Diez", 21, 'M', new int[] { 9, 4, 1 }),
		new Persona(21, "Once", 18, 'H', new int[] { 4, 1, 6 }),
		new Persona(23, "Doce", 25, 'M', new int[] { 3, 4, 2 }) ,
		new Persona(25, "Trece", 22, 'M', new int[] { 7, 3, 5 }) ,
		new Persona(27, "Catorce", 21, 'M', new int[] { 3, 2, 5 }),
		new Persona(29, "Quince", 20, 'H', new int[] { 8, 4, 9 }) ,
		new Persona(30, "Dieciseis", 18, 'M', new int[] { 7, 3, 1 }),
		new Persona(32, "Diecisiete", 19, 'H', new int[] { 9, 1, 3 }),
		new Persona(34, "Dieciocho", 21, 'H', new int[] { 2, 4, 1 }) ,
		new Persona(36, "Diecinueve", 21, 'M', new int[] { 1, 7, 6 }),
		new Persona(38, "Veinte", 18, 'M', new int[] { 3, 6, 5 })
		};
		try {
		PersonaAccesoDatos gestion = new PersonaAccesoDatos('w');
		for(Persona p: encuestado)
		// Toma la información, array, teclado, archivo, ...
		// Validar los votos emitidos
		gestion.graba(p);
		gestion.cierra();
		} catch (IOException e) {
		System.out.println(e.getMessage());
		}
		}



		3.
		El fichero PERSONAL tiene la siguiente información:
		NUMERO de tipo numérico entero
		NOMBRE de tipo alfanumérico
		EDAD de tipo numérico entero
		DIRECCIÓN de tipo alfanumérico
		SUELDOBRUTO de tipo numérico entero
		ESTADOCIVIL de tipo numérico entero
		TIPOCATEGORIA de tipo numérico entero

		NOTAS:
		El número de registros es el que necesite el usuario.
		La categoría está comprendida entre 1 y 10.
		Los valores posibles del estado civil(EC) son: 0, 1, 2 ó 3.

		El fichero CATEGORÍA tiene la siguiente información:
		TIPOCATEGORIA de tipo numérico entero
		DESCUENTO de tipo numérico entero
		DESCRIPCIÓN de tipo alfanumérico

		NOTAS:
		Hay 10 categorías, del 1 al 10.


		Con las indicaciones descritas en el ejercicio anterior realiza los siguientes apartados:
		Crea el fichero de PERSO­NAL. Ya sabes, sus atributos y métodos y lo que dicen las notas.
		Crea el fichero de CATEGORÍA. Ya sabes, sus atributos y métodos y lo que dicen las notas.
		Obtén el listado de personas con el sueldo que les corresponda.
		El sueldo neto se calcula mediante la siguiente operación: SUELDONETO= SUEDOBRUTO - DESCUENTO.
		El descuento se extrae del fichero CATEGORÍA (el campo CATEGORÍA se corresponde con el campo TIPOCATEGORIA).
		(Si tienes tiempo) Cada vez que se cambie de categoría o escribamos 55 líneas(registros), escribir la cabecera del listado e incre­mentar el número de página; así mismo, cuando se cambie de categoría escribir el sueldo neto total para la categoría.
		Imprimir el número de personas que cumplen la condición de edad mayor que una determinada introducida por teclado y su sueldo neto sea mayor que una cantidad también introducida por teclado.

*/
}
