/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gb_ficheroDirectoMenu;

/**
 * 
 * @author ali
 */
public final class Persona {

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

	public Persona(int nP, String nom, int e, String d, float s, byte ec, byte c) throws ValidacionEntrada {
		setNPersona(nP);
		setNombre(nom);
		edad = e;
		setDomicilio(d);
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

	public final void setCategoria(byte categoria) throws ValidacionEntradaCategoria {
		if (categoria < 0 || categoria > 9) {
			throw new ValidacionEntradaCategoria();
		}
		this.categoria = categoria;
	}

	public void setDomicilio(String domicilio) throws ValidacionEntrada {
		if (domicilio.isEmpty()) {
			throw new ValidacionEntrada("DOMICILIO no puede ser vacío.");
		}
		this.domicilio = domicilio;
	}

	public final void setECivil(byte eCivil) throws ValidacionEntradaECivil {
		if (eCivil < 0 || eCivil > 2) {
			throw new ValidacionEntradaECivil();
		}
		this.eCivil = eCivil;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public final void setNPersona(int nPersona) throws ValidacionEntrada {
		if (nPersona < 0) {
			throw new ValidacionEntradaNP("Número de la persona no válido: [0-...]");
		}
		this.nPersona = nPersona;
	}

	public void setNombre(String nombre) throws ValidacionEntrada {
		if (nombre.isEmpty()) {
			throw new ValidacionEntrada("NOMBRE no puede ser vacío.");
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
