/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gb_ficheroDirectoMenu;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 
 * @author ali
 */
public class CategoriaAccesoDatos {

	private RandomAccessFile rAF;

	public CategoriaAccesoDatos() throws IOException {
		rAF = new RandomAccessFile("categorias.dat", "rw");
	}

	@Override
	protected void finalize() throws Throwable {
		rAF.close();
		super.finalize();
	}

	public Categoria leeCategoria(int nC, Categoria c) throws IOException {
		rAF.seek(nC * (1 + 4 + 34 + 4)); // Nos posicionamos
		byte flagRegistro = rAF.readByte();
		c.setnCat(rAF.readInt());
		c.setDescripcion(rAF.readUTF().trim());
		c.setDescuento(rAF.readInt());
		return c;
	}
	public static void grabaFicheroDatosCategoria() {
		byte[] activo = new byte[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		int[] nCat = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		String[] desc = new String[] { "Cat 0", "Cat 1", "Cat 2", "Cat 3", "Cat 4", "Cat 5", "Cat 6", "Cat 7", "Cat 8", "Cat 9" };
		int[] descuento = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		try {
			FileOutputStream fSalida = new FileOutputStream("categorias.dat");
			DataOutputStream dOS = new DataOutputStream(fSalida);
			for (int n = 0; n < 10; n++) {
				dOS.writeByte(activo[n]);
				dOS.writeInt(nCat[n]);
				dOS.writeUTF(desc[n] + "                           ");
				dOS.writeInt(descuento[n]);
			}
			dOS.close();
			fSalida.close();
		} catch (IOException e) {
		} finally {
		}
	}

}
