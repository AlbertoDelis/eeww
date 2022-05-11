package za_flujos_menu;

public class GestionGrupoException extends Exception{
	public GestionGrupoException() {
		super("Error en la gestión");
	}
	public GestionGrupoException(String texto) {
		super(texto);
	}

}
