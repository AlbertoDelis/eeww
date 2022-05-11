package hb_selializacion_alumnos_AD;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MiObjectOutputStream extends ObjectOutputStream{

	/** Constructor que recibe OutputStream */
    public MiObjectOutputStream(OutputStream salida) throws IOException {
        super(salida);
    }

    /** Constructor sin par·metros */
    protected MiObjectOutputStream() throws IOException, SecurityException {
        super();
    }
    protected void writeStreamHeader() throws IOException	{
    		// No hacer nada.
	}

}
