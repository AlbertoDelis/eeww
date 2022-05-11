package entornos;

public class CheckDestino {
	private String codError = "ERROR 4";
	private String rDestino = null; // destino devuelto.

	public CheckDestino(String destinos[], String destino) {

		int indiceDestino=-1;

		for (int i=0; i<destinos.length;i++) {
			if(destino.equalsIgnoreCase(destinos[i])) {
				indiceDestino=i;
			}
		}
		if(indiceDestino !=-1) {
			//Devuelve valor valido si no se ha producido error.
			codError=null; //No se puede dejar la cadena vacía, debía codError ser null.
			rDestino=destinos[indiceDestino];
		}
	}

	// Getters
	public String getDestino() {
		return rDestino;
	}
	public String getcodError() {
		return codError;
	}



}
