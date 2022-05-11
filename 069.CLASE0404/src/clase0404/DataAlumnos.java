package clase0404;
import java.io.*;

public class DataAlumnos {
	static Alumno []aAlumnos=new Alumno[] {
			new Alumno(11, "María", new byte[] {10,5,5,5}),
			new Alumno(12, "Andrés", new byte[] {6,10,6,6}),
			new Alumno(13, "Raquel", new byte[] {8,3,7,3}),
			new Alumno(14, "Pedro", new byte[] {10,3,7,3}),
			new Alumno(15, "Antonio", new byte[] {9,3,7,3}),
			new Alumno(16, "Virginia", new byte[] {9,7,10,10}),
			new Alumno(17, "Marta", new byte[] {3,3,7,3}),
			new Alumno(18, "Luís", new byte[] {4,6,5,4})};
	
	static void graba(DataOutputStream dos, Alumno alumno) throws IOException {
		dos.writeInt(alumno.getId());
		dos.writeUTF(alumno.getNombre());
		for (Byte b: alumno.getNota()) {
			dos.writeByte(b);
		}
	}
	
	static Alumno lee(DataInputStream dis) throws IOException {
		Integer id=dis.readInt();
		String nombre=dis.readUTF();
		byte []nota=new byte[4];
		for (int b = 0; b < 4; b++) 
			nota[b]=dis.readByte();
//		this.dis.read(nota);
		Alumno alumno=new Alumno(id, nombre, nota);
		return alumno;
	}
	
	static void creaFicheroDatos(String nombre) throws IOException {
		try(FileOutputStream fos=new FileOutputStream(new File(nombre));
			DataOutputStream dos=new DataOutputStream(fos)){
			for (Alumno alumno : aAlumnos) {
				graba(dos, alumno);
			}		
		}
	}
	
	static void creaFicheroSerializado(String origen, String texto) throws IOException {
		try(FileOutputStream fis=new FileOutputStream(new File(origen));
			ObjectInputStream ois=new ObjectInputStream(fis);
				PrintWriter pwa=new PrintWriter(texto+".ap");
				PrintWriter pws=new PrintWriter(texto+".su")){
//			oos.writeObject(aAlumnos);
			for (Alumno alumno : aAlumnos) {
				Alumno a=(Alumno)ois.readObject();
				if(a.isAprobado())
					pwa.println((Alumno)ois.readObject());
				else
					pws.println((Alumno)ois.readObject());
			}		
		}
	} 
	
	static void creaFicheroTexto(String nombre) throws IOException, ClassNotFoundException {
		try(FileInputStream fis=new FileInputStream(new File(nombre));
			ObjectInputStream ois=new ObjectInputStream(fis)){
			ois.readObject();
			for (Alumno alumno : aAlumnos) 
				System.out.println((Alumno)ois.readObject());
		}		
		
	} 
	
	public static void main(String[] args) {
		try {
			creaFicheroDatos("fichero.dat");
			creaFicheroSerializado("fichero.obj");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	
}
