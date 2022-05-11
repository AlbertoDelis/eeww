package ga_ficheroDirecto;

import java.io.EOFException;
import java.io.IOException;

public interface GestionInterface {
	void grabaPersona(Persona p) throws validacionEntrada, IOException;
	void modificaPersona(Persona p) throws validacionEntrada, IOException;
	Persona leePersona(int nP) throws validacionEntrada, IOException, EOFException;
	void borraPersona(int nP) throws validacionEntrada, IOException;

}
