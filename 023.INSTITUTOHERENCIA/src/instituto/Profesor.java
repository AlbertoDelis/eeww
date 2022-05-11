package instituto;

import java.time.LocalDate;

public class Profesor extends Persona{
	private String especialidad;
	private char turno;
	
	public Profesor(String nombre, String nif, LocalDate fechaNac, String especialidad, char turno) {
		super(nombre, nif, fechaNac);
		this.especialidad = especialidad;
		this.turno = turno;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public char getTurno() {
		return turno;
	}

	public void setTurno(char turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Profesor [especialidad=" + especialidad + ", turno=" + turno + "]";
	}	

}
