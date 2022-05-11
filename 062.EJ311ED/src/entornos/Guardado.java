package entornos;

public class Guardado {

	/**
	 * Revisa y guarda los valores de la interfaz.
	 */

	//Valores validados:
	private String cv; // Codigo Viajero;
	private String nombre; // nombre;
	private int edad; // Edad.
	private String destino; // Destino;

	//Variables:
	private String[] destinos; //Destinos de interfaz.
	private boolean error = false; // Codigo de control de error.
	private String mensajeError=""; //Mensaje de error.
	private CheckCodViajero v; // Objeto interfaz.
	private boolean errores[]=new boolean[4]; //Array de errores para consulta externa.

	public Guardado(CheckCodViajero v, String destinos[]) {

		// Comprueba nombre:
		this.v = v;
		this.destinos=destinos;

		//Chequea coda uno de los campos de la interfaz.
		guardaCodViajero();
		guardaNombre();
		guardaEdad();
		guardaDestino();

		//Han habido erroes?:
		if (!error) {
			//Todo ha ido bien, sin errores:
			funcionGuardado();
		} else {
			//Algo ha pasado, muestra mensajes de error en interfaz.
			v.setAddTextArea(mensajeError);
		}
	}


	//Revision de datos:
	private void guardaCodViajero() {
		CheckCodViajero cCV = new CheckCodViajero();
		String codError = cCV.getErrorCodViajero();
		if (codError == null) {
			this.cv= cCV.getErrorCodViajero();
			errores[0]=false;
		} else {
			error = true; // asigna valor verdadero a la bandera de error.
			errores[0]=true;
			mensajeError += codError + "\n";
		}
	}
	private void guardaNombre() {
		CheckNombre cN = new CheckNombre(v.getTfNombre());
		String codError = cN.getError();
		if (codError == null) {
			this.nombre = cN.getNombreComprobado();
			errores[1]=false;
		} else {
			error = true; // asigna valor verdadero a la bandera de error.
			errores[1]=true;
			mensajeError += codError + "\n";
		}
	}

	private void guardaEdad() {
		CheckEdad cE = new CheckEdad(v.getTfEdad());
		String codError = cE.getCodigoError();
		if (codError == null) {
			this.edad = cE.getEdad();
			errores[2]=false;
		} else {
			error = true; // asigna valor verdadero a la bandera de error.
			errores[2]=true;
			mensajeError += codError + "\n";
		}
	}
	private void guardaDestino() {
		CheckDestino cD = new CheckDestino(destinos, v.getcbDestino());
		String codError= cD.getcodError();
		if(codError==null) {
			this.destino=cD.getDestino();
			errores[3]=false;
		}else {
			error = true; // asigna valor verdadero a la bandera de error.
			errores[3]=true;
			mensajeError += codError + "\n";
		}
	}

	//Funcion de guardado de datos:
	private void funcionGuardado() {
		//Funcion de ejemplo, aquí iría el enlace con otras funciones con los datos obtenidos
		//de la interfaz.
		String msg;
		msg = "Valor de ejemplo:\n";
		msg += "===================\n";
		msg += cv + "; ";
		msg += nombre + "; ";
		msg += edad + "; ";
		msg += destino + "; ";
		msg += "\n";
		msg += "===================\n";
		v.setAddTextArea(msg);
	}

	public boolean[] getErrores() {
		//Metodo para tomar un array de control de errores desde el exterior.
		return errores;
	}




}
