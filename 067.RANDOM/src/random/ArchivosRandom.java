package random;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ArchivosRandom {
//	int+cad(40)+2
	static int NR=30;
	static int LR = Integer.SIZE / 8 + (20 + 2);
	static void creaFichero(RandomAccessFile fich) throws IOException{
		for (int n = 1; n <= NR; n++) {
			borra(fich, n);
//			fich.seek(n*LR);
//			fich.writeInt(-1);
		}
	}

	static public void graba(RandomAccessFile fich, Registro r) throws IOException {
		fich.seek(r.getId() * LR);
		fich.writeInt(r.getId());
		fich.writeUTF(r.getCadena());// truncar la cadena a longitud con un subtring
	}
	
	static public void borra(RandomAccessFile fich, Registro r) throws IOException {
		fich.seek(r.getId() * LR);
		fich.writeInt(-1);
	}
	
	static public void borra(RandomAccessFile fich, int nr) throws IOException {
		fich.seek(nr * LR);	
		fich.writeInt(-1);
	}

	static public Registro lee(RandomAccessFile fich, int id) throws IOException {
		fich.seek(id * LR);
		int i = fich.readInt();
		if (i==-1)
			return null;
		String s = fich.readUTF();
		Registro r = new Registro(i, s);
		return r;
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Registro[] aR = { new Registro(1, "casa"), new Registro(2, "ies"), new Registro(5, "teatro") };

		try (RandomAccessFile raf = new RandomAccessFile("fichero.random", "rw")) {
			creaFichero(raf);
//			for (Registro registro : aR) {
//				graba(raf, registro);
//			}
//			Registro r=lee(raf, 3);
//			System.out.println(r);
//			r.setCadena("ies laguna");
//			graba(raf, r);
//			r=lee(raf, 2);
//			System.out.println(r);
//			borra(raf, 2);
//			r=lee(raf, 2);
//			System.out.println(r);
			boolean eof=false;
			int nr=0;
			while (!eof) {
				Registro r=lee(raf, nr++);
				System.out.println(r);
				
			}
			borra(raf, 1);
		}
	}
}
