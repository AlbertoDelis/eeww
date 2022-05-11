package ea_ficheroData_General;

import java.io.EOFException;
import java.io.IOException;
import java.io.PrintWriter;

public class Principal {
	public static void graba(boolean append) throws IOException {
		AccesoDatos ad= new AccesoDatos();
		ad.abreSalida(false);

		Alumno[] alumnos = new Alumno[] { 
				new Alumno(1, "María 1", new byte[] { 10, 5, 5, 5 }),
				new Alumno(12, "Andrés 2", new byte[] { 6, 10, 6, 6 }),
				new Alumno(113, "Pedro 3", new byte[] { 8, 3, 7, 3 }),
				new Alumno(1114, "Virginia 4", new byte[] { 10, 3, 7, 3 }),
				new Alumno(11115, "Antonio 5", new byte[] { 9, 3, 7, 3 }),
				new Alumno(1116, "Pedro 6", new byte[] { 9, 7, 10, 10 }),
				new Alumno(117, "Marta 7", new byte[] { 3, 3, 7, 3 }),
				new Alumno(18, "Luís 8", new byte[] { 4, 6, 5, 4 }) };
		try {
			for (Alumno uno : alumnos) {
				//AccesoDatos.getInstancia().grabaAlumno(uno);
				ad.grabaAlumno(uno);
				System.out.println(uno);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		ad.cierra();
	}

	public static void lee(String nombre) throws IOException {
		AccesoDatos ad= new AccesoDatos(nombre);
		ad.abreEntrada();
		Alumno a;
		boolean eof = false;
		try {
			a = ad.leeAlumno();
			while (!eof) {
				System.out.println(a);
				a = ad.leeAlumno();
			}
		} catch (EOFException e) {
			eof = true;
		}
		ad.cierra();
	}

	public static void parte(){
		AccesoDatos ad_origen= null;
		AccesoDatos ad_destino1= null;
		AccesoDatos ad_destino2= null;
		boolean eof= false;
		boolean cierto= true;
		try {
			ad_origen= new AccesoDatos();
			ad_destino1= new AccesoDatos("aprobados.dat");
			ad_destino2= new AccesoDatos("suspensos.dat");
			ad_origen.abreEntrada();
			ad_destino1.abreSalida(false);
			ad_destino2.abreSalida(false);
			Alumno a= ad_origen.leeAlumno();
			while(!eof){
				if(cierto)
					ad_destino1.grabaAlumno(a);
				else
					ad_destino2.grabaAlumno(a);
				a= ad_origen.leeAlumno();		
				cierto= !cierto;
			}
				
		}catch(EOFException e){
			eof= true;
		}
		catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				ad_origen.cierra();
				ad_destino1.cierra();
				ad_destino2.cierra();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	public static void main(String[] args) throws Throwable {
		//graba(false);
		lee("alumnos.dat");
		//parte();
		lee("aprobados.dat");
		lee("suspensos.dat");
		
		// graba(true);
		// lee();
		// parte();
	}
}

















