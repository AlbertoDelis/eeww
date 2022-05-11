/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gb_ficheroDirectoMenu;

/**
 * 
 * @author ali
 */
public class Categoria {

	private byte flagRegistro;
	private int nCat;
	private String descripcion;
	private int descuento;

	public Categoria() {
		nCat = 0;
		descripcion = null;
		descuento = 0;
	}

	public Categoria(int n, String descr, int descu) {
		nCat = n;
		descripcion = descr;
		descuento = descu;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getDescuento() {
		return descuento;
	}

	public int getnCat() {
		return nCat;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public void setnCat(int nCat) {
		this.nCat = nCat;
	}

}
