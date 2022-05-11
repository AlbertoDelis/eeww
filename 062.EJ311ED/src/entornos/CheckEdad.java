package entornos;

public class CheckEdad {

	private int edad;
	private int rEdad=-1; //se podria inicializar en el constructor
	private String codigoError="ERROR 3";

	public CheckEdad(String Edad) {
		try {
			this.edad=Integer.parseInt(Edad);
			if(edad>=10&&edad<=99) {
				rEdad=edad;
				codigoError=null;
			}
		}catch (Exception e){
			//Error en el tipo de dato de entrada.
		}
	}

	public int getEdad() {
		return rEdad;
	}
	public String getCodigoError() {
		return codigoError;
	}



}
