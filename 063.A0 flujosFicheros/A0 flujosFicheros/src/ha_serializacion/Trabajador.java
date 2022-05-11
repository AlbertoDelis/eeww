/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ha_serializacion;

/**
 * 
 * @author ali
 */
public class Trabajador extends Persona {

	protected float sueldo;
	protected byte eCivil; // 0, 1, 2
	protected byte categoria; // 0..9

	public Trabajador() {

		sueldo = 0;
		eCivil = 0;
		categoria = 0;
	}

	public Trabajador(int nP, String nom, int e, String d, float s, byte ec, byte c) {
		super(nP, nom, e, d);
		sueldo = s;
		setECivil(ec);
		setCategoria(c);
	}

	public byte getCategoria() {
		return categoria;
	}

	public byte getECivil() {
		return eCivil;
	}

	public float getSueldo() {
		return sueldo;
	}

	public final void setCategoria(byte categoria) {

		this.categoria = categoria;
	}

	public final void setECivil(byte eCivil) {

		this.eCivil = eCivil;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSueldo=" + sueldo + "\neCivil=" + eCivil + "\nCategoria=" + categoria;
	}
}
