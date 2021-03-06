package ejercicio;

import java.io.Serializable;
import java.util.Scanner;

import org.json.JSONObject;

public class Autor implements Comparable<Autor>, Serializable {
	private Integer id;
	private String nombre;
	private String nacionalidad;
	private String blog;

	public Autor(Integer id, String nombre, String nacionalidad, String blog) throws NombreAutorException {
		super();
		this.id = id;
		setNombre(nombre); // this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.blog = blog;
	}

	public Autor(String linea) throws NombreAutorException {
		Scanner sc = new Scanner(linea).useDelimiter(",");
		this.id = sc.nextInt();
		setNombre(sc.next()); // this.nombre = nombre;
		this.nacionalidad = sc.next();
		this.blog = sc.next();
	}

	public Autor() {
	}

	public static Autor getInstancia(String json) throws NombreAutorException {
		return getInstancia(new JSONObject(json));
	}

	public static Autor getInstancia(JSONObject json) throws NombreAutorException {
		int id = json.getInt("id");
		String nombre = json.getString("nombre");
		String nacionalidad = json.getString("nacionalidad");
		String blog = json.getString("blog");
		return new Autor(id, nombre, nacionalidad, blog);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws NombreAutorException {
		if (nombre.isBlank() || nombre == null || nombre.length() < 10)
			throw new NombreAutorException("Nombre incorrecto!!!");
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getBlog() {
		return blog;
	}

	public void setBlog(String blog) {
		this.blog = blog;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", blog=" + blog + "]";
	}

	public int compareTo(Autor autor) {
		int estado = this.nombre.compareTo(autor.nombre);
		if (estado == 0)
			estado = this.id - autor.id;
		return estado;
	}

}
