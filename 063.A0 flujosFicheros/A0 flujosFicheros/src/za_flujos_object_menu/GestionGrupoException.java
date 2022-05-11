package za_flujos_object_menu;

public class GestionGrupoException extends Exception{
	public GestionGrupoException() {
		super("Error en la gestión");
	}
	public GestionGrupoException(String texto) {
		super(texto);
	}

}
