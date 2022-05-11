package entornos;

public class CheckNombre {

	String rNombre = ""; // Valor comprobado.
	String codigoError = "ERROR 2";

	public CheckNombre(String Nombre) {
		System.out.println("el nombre es " + Nombre + " y su longitud es " + Nombre.length());

		if (Nombre.length() > 0 && Nombre.length() <= 30) { // La cadena no puede estar vacía, no puede tener longitud 0
			if (Character.isAlphabetic(Nombre.charAt(0))) {
				codigoError = null;
				rNombre = Nombre;
			}
		}
	}

	public String getError() {
		return codigoError;
	}

	public String getNombreComprobado() {
		return rNombre;
	}

}
