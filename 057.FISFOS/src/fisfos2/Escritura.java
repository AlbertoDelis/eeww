package fisfos2;

public class Escritura {
	/*
	escritura en archivos binarios
	El proceso ser�a:
	(1) Crear un objeto FileOutputStream a partir de un objeto File que posea
	la ruta al archivo que se desea escribir (para a�adir usar el segundo
	par�metro del constructor indicando true)
	(2) Crear un objeto DataOutputStream asociado al objeto anterior. Esto se
	realiza mediante el constructor de DataOutputStream.
	(3) Usar el objeto del punto 2 para escribir los datos mediante los m�todos
	writeTipo donde tipo es el tipo de datos a escribir (int, double, ...). A
	este m�todo se le pasa como �nico argumento los datos a escribir.
	(4) Se cierra el archivo mediante el m�todo close del objeto
	DataOutputStream.
	Ejemplo:
	File f=new File("d:/prueba.out"); Random r=new Random();
	double d=18.76353;
	try{
	 FileOutputStream fis=new FileOutputStream(f);
	 DataOutputStream dos=new DataOutputStream(fis);
	 for (int i=0;i<234;i++){ //Se repite 233 veces
	 dos.writeDouble(r.nextDouble());//N� aleatorio
	 }
	 dos.close();
	}
	catch(FileNotFoundException e){
	 System.out.println("No se encontro el archivo");
	}
	catch(IOException e){
	 System.out.println("Error al escribir");
	}
	*/

}
