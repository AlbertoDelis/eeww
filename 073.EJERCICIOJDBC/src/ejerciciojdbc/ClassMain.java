package ejerciciojdbc;

import java.io.IOException;
import java.util.HashMap;

public class ClassMain {


	public static void main(String[] args) throws IOException, NombreAutorException{
		HashMap<Integer, Autor>listaAutores=new HashMap<>();
		Autor a1=new Autor(1,"Miguel de Cervantes","Espa?ol","www.cervantes.es");
		Autor a2=new Autor(2,"Lorenzo Silva","Espa?ol","www.lorenzosilva.es");
		Autor a3=new Autor(3,"Javier Cercas","Espa?ol","www.javiercercas.es");
		Autor a4=new Autor(4,"Gabriel Garc?a M?rquez","Colombia","www.garciamarquez.es");
		Autor a5=new Autor(5,"Arturo P?rez Reverte","Espa?ol","www.perezreverte.es");
		Autor a6=new Autor(6,"Almudena Grandes","Espa?a","www.almudenagrandes.es");
		System.out.print(a1);
		System.out.print(a2);
		System.out.print(a3);
		System.out.print(a4);
		System.out.print(a5);
		System.out.print(a6);
		
	

	}

}
