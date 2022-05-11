package musical;

public class enunMusical {
	/*
		Una compa��a organiza una encuesta para determinar el �xito de sus productos musicales. 
		La poblaci�n encuestada se va a dividir en cuatro categor�as seg�n sexo y edad (por ejemplo menores o iguales a veinte a�os y mayores de veinte a�os). 
		A cada persona se le pide que d� el n�mero de cinco �xitos seg�n su orden de preferencia. Los �xitos se identifican por los n�meros de 1 a N. 
		Los resultados se almacenan en un fichero, donde cada elemento del fichero representa a un encuestado que incluye los datos de su nombre y apellidos, 
		adem�s de los mencionados anteriormente. Se pide:
		* Codifica una clase Persona con los atributos del enunciado.
		* Codifica una clase para acceder al fichero de personas: m�todo para crear fichero, m�todos para leer y grabar personas, ...
		* Crea el archivo con los datos de las encuestas.
		* Codifica una clase �lbum musical con, al menos, las siguientes propiedades privadas: n�mero, t�tulo y votos obtenidos.
		* Codifica una clase para acceder a los datos de los �lbumes almacenados en disco o en un array.
		* Listar los �xitos en orden de popularidad. Para cada uno se lista el n�mero del �xito y el n�mero de veces que ha sido mencionado.
		* Obtener cuatro archivos de texto con las listas de los nombres y apellidos de todos los encuestados, seg�n su categor�a, 
		que hab�an mencionado en primer lugar uno de los tres �xitos m�s populares.
			Para que todos trabajemos con el mismo archivo

		public void crea(){
		// Deber�a introducirse porteclado
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
		// Toma la informaci�n, array, teclado, archivo, ...
		// Validar los votos emitidos
		gestion.graba(p);
		gestion.cierra();
		} catch (IOException e) {
		System.out.println(e.getMessage());
		}
		}



		3.
		El fichero PERSONAL tiene la siguiente informaci�n:
		NUMERO de tipo num�rico entero
		NOMBRE de tipo alfanum�rico
		EDAD de tipo num�rico entero
		DIRECCI�N de tipo alfanum�rico
		SUELDOBRUTO de tipo num�rico entero
		ESTADOCIVIL de tipo num�rico entero
		TIPOCATEGORIA de tipo num�rico entero

		NOTAS:
		El n�mero de registros es el que necesite el usuario.
		La categor�a est� comprendida entre 1 y 10.
		Los valores posibles del estado civil(EC) son: 0, 1, 2 � 3.

		El fichero CATEGOR�A tiene la siguiente informaci�n:
		TIPOCATEGORIA de tipo num�rico entero
		DESCUENTO de tipo num�rico entero
		DESCRIPCI�N de tipo alfanum�rico

		NOTAS:
		Hay 10 categor�as, del 1 al 10.


		Con las indicaciones descritas en el ejercicio anterior realiza los siguientes apartados:
		Crea el fichero de PERSO�NAL. Ya sabes, sus atributos y m�todos y lo que dicen las notas.
		Crea el fichero de CATEGOR�A. Ya sabes, sus atributos y m�todos y lo que dicen las notas.
		Obt�n el listado de personas con el sueldo que les corresponda.
		El sueldo neto se calcula mediante la siguiente operaci�n: SUELDONETO= SUEDOBRUTO - DESCUENTO.
		El descuento se extrae del fichero CATEGOR�A (el campo CATEGOR�A se corresponde con el campo TIPOCATEGORIA).
		(Si tienes tiempo) Cada vez que se cambie de categor�a o escribamos 55 l�neas(registros), escribir la cabecera del listado e incre�mentar el n�mero de p�gina; as� mismo, cuando se cambie de categor�a escribir el sueldo neto total para la categor�a.
		Imprimir el n�mero de personas que cumplen la condici�n de edad mayor que una determinada introducida por teclado y su sueldo neto sea mayor que una cantidad tambi�n introducida por teclado.

*/
}
