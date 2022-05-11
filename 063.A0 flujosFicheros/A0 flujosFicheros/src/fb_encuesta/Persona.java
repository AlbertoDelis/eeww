package fb_encuesta;

import java.util.Arrays;

public class Persona implements Constantes {
	private int orden;
	private String nombre;
	private int edad;
	private char sexo;
	private int[] voto;

	public Persona(int orden, String nombre, int edad, char sexo, int[] voto) {
		super();
		this.orden = orden;
		this.nombre = nombre;
		this.edad = edad;
		setSexo(sexo); // 'H', 'M'
		setVoto(voto); // Sólo válidos, 1..NE
	}

	private int[] getVoto() {
		return voto;
	}

	private void setVoto(int[] voto) {
		for (int v : voto) {
			if (v < 1 || v > NEXITOS)
				throw new IllegalArgumentException("Voto emitido incorrecto: " + v);
		}
		this.voto = voto.clone();
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	private void setSexo(char sexo) throws IllegalArgumentException {
		if ("HhMm".indexOf(sexo) == -1)
			throw new IllegalArgumentException("Sexo incorrecto");
		this.sexo = sexo;
	}

	public int getOrden() {
		return orden;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public char getSexo() {
		return sexo;
	}

	public int[] getVotos() {
		return voto;
	}

	public int getVoto(int v) throws IllegalArgumentException {
		if (v < 0 || v >= NVOTOS)
			throw new IllegalArgumentException("Voto solicitado incorrecto: " + v);
		return voto[v];
	}

	@Override
	public String toString() {
		return "Persona [" + orden + ", " + nombre + ", " + edad + ", " + sexo + ", voto=" + Arrays.toString(voto) + "]";
	}

}
