/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ha_serializacion;

import java.io.Serializable;

/**
 * 
 * @author ali
 */
public class Persona implements Serializable {

	protected int nPersona;
	protected String nombre;
	protected int edad;
	protected String domicilio;

	public Persona() {
		nPersona = 0;
		nombre = "";
		edad = 0;
		domicilio = "";

	}

	public Persona(int nP, String nom, int e, String d) {
		setNPersona(nP);
		setNombre(nom);
		edad = e;
		setDomicilio(d);

	}

	public String getDomicilio() {
		return domicilio;
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

	public void setDomicilio(String domicilio) {

		this.domicilio = domicilio;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public final void setNPersona(int nPersona) {

		this.nPersona = nPersona;
	}

	public void setNombre(String nombre) {

		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "\nPersona:" + "\nNúmero=" + nPersona + "\nNombre=" + nombre + "\nEdad=" + edad + "\nDomicilio=" + domicilio;
	}
}
