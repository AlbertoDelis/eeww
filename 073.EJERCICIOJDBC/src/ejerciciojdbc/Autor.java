package ejerciciojdbc;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Autor implements Comparable<Autor>, Serializable{
	private Integer id;
	private String nombre;
	private String nacionalidad;
	private String blog;
	
	public Autor(Integer id, String nombre, String nacionalidad, String blog) throws NombreAutorException {
		super();
		this.id = id;
		setNombre(nombre);
		this.nacionalidad = nacionalidad;
		this.blog = blog;
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
		if(nombre.isBlank()||nombre.isEmpty()||nombre.length()<3)
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
	
	public void getAnade(Autor autor, Integer num) {
		HashMap<Integer, Autor>listaAutores=new HashMap<>();
		listaAutores.put(num, autor);	
	}

	@Override
	public String toString() {
		return "Autor\n [id=" + id + ",\n"
				+" nombre=" + nombre + ",\n"
				+" nacionalidad=" + nacionalidad + ",\n"
				+" blog=" + blog + "]\n";
	}

	@Override
	public int compareTo(Autor aut) {
		
		
		return 0;
	}
	
	
}
