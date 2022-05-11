package ejprog0504;

import java.io.*;

public class DAOAlumnoEntradaDatos implements DAO {
	public DAOAlumnoEntradaDatos() {
		if(dis==null)
			
		
	}

	@Override
	public void leerAlumnoFichero() {
		try(DataInputStream dis=new DataInputStream(new File("alumnos.dat"))){
			int numAl = dis.readInt();
			String nomAl = dis.readUTF();
			byte[] nota = new byte[4];
			dis.read(nota);	
		}
		}
		

	@Override
	public void cerrarFichero() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void grabarAlumnoFichero() {
		// TODO Auto-generated method stub
		
	}

}
