package fisfos2;

public class Lectura {
	/*
	lectura en archivos binarios
	El proceso es análogo. Sólo que hay que tener en cuenta que al leer se puede
	alcanzar el final del archivo. Al llegar al final del archivo, se produce una
	excepción del tipo EOFException (que es subclase de IOException), por lo
	que habrá que controlarla.
	Ejemplo, leer el contenido del archivo del ejemplo anterior:
	boolean finArchivo=false;//Para provocar bucle infinito
	try{
	 FileInputStream fis=new FileInputStream(f);
	 DataInputStream dis=new DataInputStream(fis);
	 double d;
	 while (!finArchivo){
	 d=dis.readDouble();
	 System.out.println(d);
	 }
	 dis.close();
	}
	catch(EOFException e){
	 finArchivo=true;
	}
	catch(FileNotFoundException e){
	 System.out.println("No se encontr el archivo");
	}
	catch(IOException e){
	 System.out.println("Error al leer");
	}
	*/

}
