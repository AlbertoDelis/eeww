package clase0404;

/*
Crea una clase que contenga:
Un m�nimo de cuatro atributos, uno o dos de tipo num�rico, uno o dos de tipo cadena y un array de N componentes num�ricas.
Los m�todos get y set correspondientes.
Un m�todo que reciba como par�metro DataOutputStream para grabar la informaci�n en un fichero de datos. Lanza la excepci�n IOException.
Un m�todo que reciba como par�metro DataInputStream para leer la informaci�n de un fichero de datos. Lanza las excepciones EOFException e IOException.
Un m�todo toString para visualizar los atributos en el formato adecuado.

Crea una nueva clase que permita crear un archivo de datos con la informaci�n anterior.
 */
import java.util.Arrays;

public class Alumno {
	private Integer id;
	private String nombre;
	private byte[] nota;

	public Alumno(Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.nota = new byte[4];
	}

	public Alumno(Integer id, String nombre, byte[] nota) {
		this.id = id;
		this.nombre = nombre;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte[] getNota() {
		return nota;
	}

	public void setNota(byte[] nota) {
		this.nota = nota;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", nota=" + Arrays.toString(nota) + "]";
	}

	public boolean isAprobado() {
		for (byte n : nota) {
			if (n < 5)
				return false;
		}
		return true;
	}
}
