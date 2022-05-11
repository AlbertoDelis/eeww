package za_flujos_object_menu;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grupo {
	private String nombre;
	private Map<Integer, Alumno> grupo;
	
	public Grupo(String nombre) {
		this.nombre= nombre;
		this.grupo= new HashMap<Integer, Alumno>();
	}
	
	public Map<Integer, Alumno> getGrupo(){
		return grupo;
	}
	
	public void alta(Alumno a) throws GestionGrupoException {
		if(this.grupo.containsKey(a.getnAlumno()))
			throw new GestionGrupoException("Código alumno ya existe:" + a.getnAlumno());
		this.grupo.put(a.getnAlumno(), a);
	}
	public void listado() throws IOException {
		for (Alumno a : getGrupo().values()) {
			System.out.println(a);
		}
	}

}













