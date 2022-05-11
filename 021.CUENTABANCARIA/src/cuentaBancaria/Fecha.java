package cuentaBancaria;

import java.time.LocalDate;
import java.util.Calendar;

public class Fecha {
	private LocalDate fecha;
	private Calendar calendario;
	private int d;
	private int m;
	private int a;
	
	public Fecha(LocalDate fecha, Calendar calendario) {
		this.fecha = LocalDate.now();
		this.calendario=calendario;
		
	}
	
	public Fecha(LocalDate fecha, Calendar calendario, int d, int m, int a) {
		this.fecha=LocalDate.of(a, m, d);
		this.calendario = calendario;
		this.d = d;
		this.m = m;
		this.a = a;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Calendar getCalendario() {
		return calendario;
	}

	public void setCalendario(Calendar calendario) {
		this.calendario = calendario;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public boolean fechaCorrecta(LocalDate fecha, int a, int m, int d) {
		if (a<1900 || a>2022) {
			return false;	
		} else if (m<1 || m>12){
			return false;
		} else if(d<1 || d>30)
			return false;
	}else {
		
		return true;
	}
	
	

	@Override
	public String toString() {
		return String.format("Fecha [fecha=%s, calendario=%s, d=%s, m=%s, a=%s]", fecha, calendario, d, m, a);
	}
	
	
	
	
	
	

}
