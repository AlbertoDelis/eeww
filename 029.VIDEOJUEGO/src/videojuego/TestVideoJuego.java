package videojuego;
/*
Como vemos, en principio, las clases anteriores no son padre-hija, 
pero si tienen en común, por eso vamos a hacer una interfaz llamada Entregable con los siguientes métodos:

entregar(): cambia el atributo prestado a true.
devolver(): cambia el atributo prestado a false.
isEntregado(): devuelve el estado del atributo prestado.
Método compareTo (Object a), compara las horas estimadas en los videojuegos y en las series el numero de temporadas. Como parámetro que tenga un objeto, no es necesario que implementes la interfaz Comparable. Recuerda el uso de los casting de objetos.
Implementa los anteriores métodos en las clases Videojuego y Serie. Ahora crea una aplicación ejecutable y realiza lo siguiente:

Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.
Crea un objeto en cada posición del array, con los valores que desees, puedes usar distintos constructores.
Entrega algunos Videojuegos y Series con el método entregar().
Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
Por último, indica el Videojuego tiene más horas estimadas y la serie con mas temporadas. Muestralos en pantalla con toda su información (usa el método toString()).
*/


public class TestVideoJuego {

	public static void main(String[] args) {
		Serie listaserie[] = new Serie[5];
		VideoJuego listavideojuego[] = new VideoJuego[5];
		for (int i = 0; i < listaserie.length; i++) {
			Serie serie = new Serie("H", "s", "a");
			listaserie[i] = serie;
			System.out.println(serie);

		}

		listavideojuego[0] = new VideoJuego("a", 10);
		listavideojuego[1] = new VideoJuego("k", 15, "Infantil", "Enix");
		listavideojuego[2] = new VideoJuego("cd", 55);
		listavideojuego[3] = new VideoJuego("cdfd", 65, "Adulto", "Blizzard");
		listavideojuego[4] = new VideoJuego("lik", 100);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

		for (VideoJuego videoJuego : listavideojuego) {
			System.out.println(videoJuego);
		}

	}

}
