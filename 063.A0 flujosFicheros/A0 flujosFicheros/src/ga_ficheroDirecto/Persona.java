/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ga_ficheroDirecto;

/**
 *
 * @author ali
 */
public class Persona {

	protected int nPersona;
	protected String nombre;
	protected int edad;
	protected String domicilio;
	protected float sueldo;
	protected byte eCivil; // 0, 1, 2
	protected byte categoria; // 0..9

	public Persona() {
		nPersona = 0;
		nombre = "";
		edad = 0;
		domicilio = "";
		sueldo = 0;
		eCivil = 0;
		categoria = 0;
	}

	public Persona(int nP, String nom, int e, String d, float s, byte ec, byte c) throws validacionEntrada {
		setNPersona(nP);
		setNombre(nom);
		edad = e;
		domicilio = d;
		sueldo = s;
		setECivil(ec);
		setCategoria(c);
	}

	public byte getCategoria() {
		return categoria;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public byte getECivil() {
		return eCivil;
	}

	public int getEdad() {
		return edad;
	}

	public int getNPersona() {
		return nPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public float getSueldo() {
		return sueldo;
	}

	public final void setCategoria(byte categoria) throws validacionEntradaCategoria {
		if (categoria < 0 || categoria > 2) {
			throw new validacionEntradaCategoria();
		}
		this.categoria = categoria;
	}

	public void setDomicilio(String domicilio) throws validacionEntrada {
		if (domicilio.isEmpty()) {
			throw new validacionEntrada("DOMICILIO no puede ser vacío.");
		}
		this.domicilio = domicilio;
	}

	public final void setECivil(byte eCivil) throws validacionEntradaECivil {
		if (eCivil < 0 || eCivil > 2) {
			throw new validacionEntradaECivil();
		}
		this.eCivil = eCivil;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public final void setNPersona(int nPersona) throws validacionEntrada {
		if (nPersona < 0) {
			throw new validacionEntradaNP("Número de la persona no válido: [0-...]");
		}
		this.nPersona = nPersona;
	}

	public void setNombre(String nombre) throws validacionEntrada {
		if (nombre.isEmpty()) {
			throw new validacionEntrada("NOMBRE no puede ser vacío.");
		}
		this.nombre = nombre;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "\nPersona:" + "\nNúmero=" + nPersona + "\nNombre=" + nombre + "\nEdad=" + edad + "\nDomicilio=" + domicilio
				+ "\nSueldo=" + sueldo + "\neCivil=" + eCivil + "\nCategoria=" + categoria;
	}
}
