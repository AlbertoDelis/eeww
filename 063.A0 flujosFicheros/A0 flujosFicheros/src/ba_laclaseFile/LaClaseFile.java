/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ba_laclaseFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author ali
 */
public class LaClaseFile {
	/*
	 * La clase File en java representa un fichero y nos permite obtener información sobre él. Al instanciar la clase File con un
	 * fichero, no se abre el fichero ni es necesario que este exista y precisamente esa es la primera información útil que
	 * podemos obtener del fichero: saber si existe o no.
	 */

	public static void existe(File f) {
		if (f.exists()) {
			System.out.println("Existe");
		} else {
			System.out.println("No Existe");
		}
	}

	/*
	 * Si el fichero existe, podemos no tener permisos para leerlo, así que otra comprobación útil es si se puede hacer en él la
	 * operación deseada.
	 * 
	 * Tenemos, además, los correspondientes métodos setReadable(), setReadOnly(), setWritable() y setExcutable() que nos permiten
	 * cambiar las propiedades del fichero siempre que seamos los propietarios del mismo o tengamos permisos para hacerlo.
	 */

	public static void permisos(File f) {
		if (f.canRead()) {
			System.out.println("El fichero existe y se puede leer.");
		}
		if (f.canWrite()) {
			System.out.println("El fichero existe y se puede escribir en él.");
		}
		if (f.canExecute()) {
			System.out.println("El fichero existe y se puede ejecutar");
		}
		f.setReadable(false);
		if (f.canRead()) {
			System.out.println("El fichero existe y se puede leer.");
		} else {
			System.out.println("El fichero existe y NO se puede leer.");
		}
		f.setReadable(true);
		System.out.println(File.separator);
		try {
			System.out.println("1" + f.getCanonicalFile());
			System.out.println(f.getCanonicalPath());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void listaDirectorio() {
		// Se crea el File del directorio
		// File directorio = new File("/home/ali11");
		File directorio = new File("/Users/ali");
		// Si es un directorio
		if (directorio.isDirectory()) {
			// obtenemos su contenido
			File[] ficherosFile = directorio.listFiles();
			// y lo sacamos por pantalla
			for (File fichero : ficherosFile) {
				if (!fichero.isHidden()) {
					String date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date(fichero.lastModified()));
					System.out.println(fichero.getName() + " " + date);
				}
			}
			/*
			 * System.out.println(); String[] ficherosTexto = directorio.list(); for (String fichero : ficherosTexto) {
			 * System.out.println(fichero); }
			 */
		}
	}

	public static void borra(String dirString) {
		// Se crea el File del directorio
		File fichero = new File(dirString);
		if (fichero.exists()) {
			if (fichero.isFile()) // si es un fichero se borra
				fichero.delete();
			else {
				// es una carpeta obtenemos su contenido
				File[] archivos = fichero.listFiles();
				// tratamos todos los archivos de la carpeta
				for (File archivo : archivos)
					borra(archivo.getAbsolutePath());
				// una vez que esta vacia se borra
				fichero.delete();
			}
		}
	}

	public static void lsDirectory2(String dirString) {
		// Se crea el File del directorio
		File directorio = new File(dirString);
		// Si es un directorio
		if (directorio.isDirectory()) {
			System.out.println();
			// obtenemos su contenido
			File[] archivos = directorio.listFiles();
			for (int i = 0; i < archivos.length; i++) {
				System.out.print(i + ") " + archivos[i].getName() + "\t");
				String date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date(archivos[i].lastModified()));
				System.out.println(date);
				lsDirectory2(archivos[i].getAbsolutePath());
			}
			System.out.println();
		}
	}

	public static void lsDirectory(File dir) {

		File[] archivos = dir.listFiles();
		for (int i = 0; i < archivos.length; i++) {
			System.out.print(i + ") " + archivos[i].getName() + "\t");
			String date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date(archivos[i].lastModified()));
			System.out.println(date);
			if (archivos[i].isDirectory()) {
				System.out.println();
				lsDirectory(archivos[i]);
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		/*
		File f1 = new File("/home/ali11/", "bookmarks.xml");
		File f2 = new File("/home/ali11/archivo2.txt");
		File f3 = new File("/home/ali11/NetBeansProjects");
		f1.toString();
		existe(f1);
		if (f1.exists()) {
			permisos(f1);
		} else
			try {
				f1.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		try {
			System.out.println(f1.toURI());
			System.out.println(f1.toURL());
		} catch (Exception e) {
			System.out.println(e);
		}
		*/
		//listaDirectorio();
		lsDirectory(new File("/Users/ali/Dropbox"));
		// lsDirectory2("/Users/ali/Dropbox");
		// borra("/home/ali11/NetBeansProjectsBorra");

	}
}
