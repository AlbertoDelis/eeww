package clase0404;

/*
Crea una clase que contenga:
Un mínimo de cuatro atributos, uno o dos de tipo numérico, uno o dos de tipo cadena y un array de N componentes numéricas.
Los métodos get y set correspondientes.
Un método que reciba como parámetro DataOutputStream para grabar la información en un fichero de datos. Lanza la excepción IOException.
Un método que reciba como parámetro DataInputStream para leer la información de un fichero de datos. Lanza las excepciones EOFException e IOException.
Un método toString para visualizar los atributos en el formato adecuado.

Crea una nueva clase que permita crear un archivo de datos con la información anterior.
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
