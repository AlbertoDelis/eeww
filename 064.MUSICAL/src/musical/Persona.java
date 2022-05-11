package musical;

import java.util.Arrays;

public class Persona implements FichPersona{
	private int numero;
	private String numId;
	private int edad;
	private char sexo;
	private int []notas;
	
	public Persona(int numero, String numId, int edad, char sexo, int[] notas) {
		super();
		this.numero = numero;
		this.numId = numId;
		this.edad = edad;
		this.sexo = sexo;
		this.notas = new int[3];
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNumId() {
		return numId;
	}

	public void setNumId(String numId) {
		this.numId = numId;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Persona [numero=" + numero + ", numId=" + numId + ", edad=" + edad + ", sexo=" + sexo + ", notas="
				+ Arrays.toString(notas) + "]";
	}

	@Override
	public void getCrearFich() {
	}

	@Override
	public void getLeerFich() {
	}

	@Override
	public void grabarFich() {
	}



}
